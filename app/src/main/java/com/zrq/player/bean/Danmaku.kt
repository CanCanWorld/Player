package com.zrq.player.bean

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Path

data class Danmaku(
    @ElementList(required = true, inline = true, entry = "d")
    var items : MutableList<Line>
)

data class Line(
    @Attribute(name = "p", required = true)
    var p: String
)