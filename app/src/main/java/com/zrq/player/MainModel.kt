package com.zrq.player

import androidx.lifecycle.ViewModel
import com.zrq.player.bean.Video
import java.util.*

class MainModel : ViewModel() {
    val videos = LinkedList<Video>()
    var isFullScreen = false
    var onBackListener: () -> Unit = {}
}