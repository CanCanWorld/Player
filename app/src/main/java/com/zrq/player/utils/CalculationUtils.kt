package com.zrq.player.utils

object CalculationUtils {

    fun formatDuration(duration: Int): String {
        if (duration == 0) return "00:00"
        val m = duration / 60
        val s = duration - 60 * m
        return String.format("%02d", m) + ":" + String.format("%02d", s)
    }

    fun formatNum(num: Int): String {
        if (num == 0) return "0"
        val m = num / 10000
        val s = (num - 10000 * m) / 1000
        if (m == 0) {
            return num.toString()
        }
        return m.toString() + "." + s + "万"
    }
    fun formatNum(num: Long): String {
        if (num == 0L) return "0"
        val m = num / 10000
        val s = (num - 10000 * m) / 1000
        if (m == 0L) {
            return num.toString()
        }
        return m.toString() + "." + s + "万"
    }
}