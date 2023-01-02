package com.zrq.player.bean

import androidx.annotation.Keep

@Keep
data class Video(
    var title: String,
    var bvid: String,
    var cid: Int,
    var pubdate: Int,
    var pub_location: String? = "",
    var view: Int,
    var danmaku: Int,
    var reply: Int,
    var favorite: Int,
    var coin: Int,
    var share: Int,
    var now_rank: Int,
    var his_rank: Int,
    var like: Int,
    var dislike: Int,
    var upName: String,
    var face: String,
)