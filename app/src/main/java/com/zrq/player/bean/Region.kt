package com.zrq.player.bean

import androidx.annotation.Keep

@Keep
data class Region(
    var title: String,
    var tid: Int,
    var iconPath: Int
)
data class Regions(
    var regions: MutableList<Region>
)