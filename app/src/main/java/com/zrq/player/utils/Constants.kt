package com.zrq.player.utils

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.tencent.mmkv.MMKV
import com.zrq.player.R
import com.zrq.player.bean.Region
import com.zrq.player.bean.Regions

object Constants {
    const val BASE_URL = "https://api.bilibili.com/x"

    const val POPULAR = "/web-interface/popular"

    const val PLAY_URL = "/player/playurl"

    const val RELATED = "/web-interface/archive/related"

    const val REGION = "/web-interface/dynamic/region"

    const val DETAIL = "/web-interface/view/detail"

    const val REPLY = "/v2/reply"

    const val DANMAKU = "/v1/dm/list.so?oid="

    const val BILIBILI = "https://bilibili.com"

    const val HOT_SEARCH = "https://s.search.bilibili.com/main/hotword"

    //?search_type=video&keyword=初音&page=1
    const val SEARCH = "/web-interface/search/type"

    const val PAGE_LOGIN = 0

    const val PAGE_REGISTER = 1

    const val REQUEST_CAPTCHA = "http://passport.bilibili.com/x/passport-login/captcha?source=main_web"

    const val LOGIN = "http://passport.bilibili.com/x/passport-login/web/login"

    const val GET_KEY = "https://passport.bilibili.com/x/passport-login/web/key"

    const val SEND_MSG = "http://passport.bilibili.com/x/passport-login/web/sms/send"

    private var regions = arrayListOf(
        Region("动画", 1, R.drawable.ic_douga),
        Region("番剧", 13, R.drawable.ic_anime),
        Region("国创", 167, R.drawable.ic_guochuang),
        Region("音乐", 3, R.drawable.ic_music),
        Region("舞蹈", 129, R.drawable.ic_dance),
        Region("游戏", 4, R.drawable.ic_game),
        Region("知识", 36, R.drawable.ic_knowledge),
        Region("科技", 188, R.drawable.ic_tech),
        Region("运动", 234, R.drawable.ic_sports),
        Region("汽车", 223, R.drawable.ic_car),
        Region("生活", 160, R.drawable.ic_life),
        Region("美食", 211, R.drawable.ic_food),
        Region("动物圈", 217, R.drawable.ic_animal),
        Region("鬼畜", 119, R.drawable.ic_kichiku),
        Region("时尚", 155, R.drawable.ic_fashion),
        Region("资讯", 202, R.drawable.ic_information),
        Region("娱乐", 5, R.drawable.ic_ent),
        Region("影视", 181, R.drawable.ic_cinephile),
        Region("纪录片", 177, R.drawable.ic_documentary),
        Region("电影", 23, R.drawable.ic_movie),
        Region("电视剧", 11, R.drawable.ic_teleplay),
    )

    private val mmkv: MMKV = MMKV.defaultMMKV()

    fun setRegion(regions: MutableList<Region>) {
        val toJson = Gson().toJson(Regions(regions), object : TypeToken<Regions>() {}.type)
        mmkv.putString("regions", toJson)
    }

    fun getRegion(): MutableList<Region> {
        val toJson = Gson().toJson(Regions(regions), object : TypeToken<Regions>() {}.type)
        val string = mmkv.getString("regions", toJson)
        return Gson().fromJson(string, Regions::class.java).regions
    }
}