package com.zrq.player

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zrq.player.bean.Detail
import com.zrq.player.bean.Video
import java.util.*

class MainModel : ViewModel() {
    val videos = LinkedList<Video>()
    var onBackPress: () -> Unit = {}
    var detail = MutableLiveData<Detail.DataBean>()
}