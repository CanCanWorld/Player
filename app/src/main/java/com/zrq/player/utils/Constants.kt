package com.zrq.player.utils

import com.zrq.player.bean.Region

object Constants {
    const val BASE_URL = "https://api.bilibili.com/x"

    const val POPULAR = "/web-interface/popular"

    const val PLAY_URL = "/player/playurl"

    const val RELATED = "/web-interface/archive/related"

    val Regions = arrayListOf<Region>(
        Region("动画", 1),
        Region("MAD·AMV", 24),
        Region("MMD·3D", 25),
        Region("短片·手书·配音", 47),
        Region("特摄", 86),
        Region("动漫杂谈", 253),
        Region("综合", 27),
    )
}