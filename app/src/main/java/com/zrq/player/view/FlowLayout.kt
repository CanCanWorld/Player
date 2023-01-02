package com.zrq.player.view

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.view.ViewGroup
import com.zrq.player.R

class FlowLayout : ViewGroup {
    constructor(context: Context?) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : this(context, attrs, 0)

    @SuppressLint("CustomViewStyleable")
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        if (context != null) {
            val typedArray = context.obtainStyledAttributes(attrs, R.styleable.FlowLayout)
            linesNum = typedArray.getInteger(R.styleable.FlowLayout_lines, 3)
            typedArray.recycle()
        }
    }

    private var linesNum = 0    //总行数
    private var curLine = Line()    //当前操作的行
    private val lines = mutableListOf<Line>()
    private var usedWidth = 0
    private var curLinesNum = 0
    private var usedHeight = 0

    @SuppressLint("DrawAllocation")
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        val totalWidth = MeasureSpec.getSize(widthMeasureSpec)
        val totalHeight = MeasureSpec.getSize(heightMeasureSpec)
        val widthSize = totalWidth - paddingLeft - paddingRight
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val heightSize = totalHeight - paddingTop - paddingBottom
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)
        curLine = Line()
        lines.clear()
        lines.add(curLine)
        usedWidth = 0
        usedHeight = 0
        curLinesNum = 0

        for (i in 0 until childCount) {

            val child = getChildAt(i)
            if (child.visibility == GONE) break
            val childWidth = MeasureSpec.makeMeasureSpec(widthSize, if (widthMode == MeasureSpec.EXACTLY) MeasureSpec.AT_MOST else widthMode)
            val childHeight = MeasureSpec.makeMeasureSpec(heightSize, if (heightMode == MeasureSpec.EXACTLY) MeasureSpec.AT_MOST else heightMode)
            child.measure(childWidth, childHeight)

            if (usedWidth + child.measuredWidth > widthSize) {
                //换行
                curLine = Line()
                lines.add(curLine)
                usedWidth = 0
                curLinesNum++
            }
            if (curLinesNum >= linesNum) break

            curLine.addView(child)
            usedWidth += child.measuredWidth
        }

        lines.forEach {
            Log.d(TAG, "onMeasure: ${it.height}")
            usedHeight += it.height
        }

        Log.d(TAG, "onMeasure: $usedHeight")
        setMeasuredDimension(totalWidth, usedHeight)
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {

        var top = paddingTop
        lines.forEach { line ->
            var left = paddingLeft
            for (view in line.views) {
                view.layout(left, top, left + view.measuredWidth, top + view.measuredHeight)
                left += view.measuredWidth
            }
            top += line.height
        }
    }

    companion object {
        private const val TAG = "FlowLayout"
    }

}

data class Line(var views: MutableList<View> = mutableListOf(), var width: Int = 0, var height: Int = 0) {
    fun addView(view: View) {
        views.add(view)
        width += view.measuredWidth
        if (height < view.measuredHeight)
            height = view.measuredHeight
    }
}