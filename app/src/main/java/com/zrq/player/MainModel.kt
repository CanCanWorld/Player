package com.zrq.player

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zrq.player.bean.Detail
import com.zrq.player.bean.Video
import java.util.*

class MainModel : ViewModel() {
    var detail = MutableLiveData<Detail.DataBean>()
    val keyword = MutableLiveData<String>()
    val videos = LinkedList<Video>()
    var onBackPress: () -> Unit = {}
}