package com.zrq.player.bean;

import androidx.annotation.Keep;

import java.util.List;

@Keep
public class RegionVideo {

    private int code;
    private String message;
    private int ttl;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTtl() {
        return ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private PageBean page;
        private List<ArchivesBean> archives;

        public PageBean getPage() {
            return page;
        }

        public void setPage(PageBean page) {
            this.page = page;
        }

        public List<ArchivesBean> getArchives() {
            return archives;
        }

        public void setArchives(List<ArchivesBean> archives) {
            this.archives = archives;
        }

        public static class PageBean {
            private int num;
            private int size;
            private int count;

            public int getNum() {
                return num;
            }

            public void setNum(int num) {
                this.num = num;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }
        }

        public static class ArchivesBean {
            private int aid;
            private int videos;
            private int tid;
            private String tname;
            private int copyright;
            private String pic;
            private String title;
            private int pubdate;
            private int ctime;
            private String desc;
            private int state;
            private int duration;
            private int mission_id;
            private RightsBean rights;
            private OwnerBean owner;
            private StatBean stat;
            private String dynamic;
            private int cid;
            private DimensionBean dimension;
            private String short_link;
            private String short_link_v2;
            private int up_from_v2;
            private String first_frame;
            private String pub_location;
            private String bvid;
            private int season_type;
            private boolean is_ogv;
            private Object ogv_info;
            private String rcmd_reason;
            private int season_id;
            private boolean dismiss = false;
            private String banType = "";

            public int getAid() {
                return aid;
            }

            public void setAid(int aid) {
                this.aid = aid;
            }

            public int getVideos() {
                return videos;
            }

            public void setVideos(int videos) {
                this.videos = videos;
            }

            public int getTid() {
                return tid;
            }

            public void setTid(int tid) {
                this.tid = tid;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public int getCopyright() {
                return copyright;
            }

            public void setCopyright(int copyright) {
                this.copyright = copyright;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getPubdate() {
                return pubdate;
            }

            public void setPubdate(int pubdate) {
                this.pubdate = pubdate;
            }

            public int getCtime() {
                return ctime;
            }

            public void setCtime(int ctime) {
                this.ctime = ctime;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public int getMission_id() {
                return mission_id;
            }

            public void setMission_id(int mission_id) {
                this.mission_id = mission_id;
            }

            public RightsBean getRights() {
                return rights;
            }

            public void setRights(RightsBean rights) {
                this.rights = rights;
            }

            public OwnerBean getOwner() {
                return owner;
            }

            public void setOwner(OwnerBean owner) {
                this.owner = owner;
            }

            public StatBean getStat() {
                return stat;
            }

            public void setStat(StatBean stat) {
                this.stat = stat;
            }

            public String getDynamic() {
                return dynamic;
            }

            public void setDynamic(String dynamic) {
                this.dynamic = dynamic;
            }

            public int getCid() {
                return cid;
            }

            public void setCid(int cid) {
                this.cid = cid;
            }

            public DimensionBean getDimension() {
                return dimension;
            }

            public void setDimension(DimensionBean dimension) {
                this.dimension = dimension;
            }

            public String getShort_link() {
                return short_link;
            }

            public void setShort_link(String short_link) {
                this.short_link = short_link;
            }

            public String getShort_link_v2() {
                return short_link_v2;
            }

            public void setShort_link_v2(String short_link_v2) {
                this.short_link_v2 = short_link_v2;
            }

            public int getUp_from_v2() {
                return up_from_v2;
            }

            public void setUp_from_v2(int up_from_v2) {
                this.up_from_v2 = up_from_v2;
            }

            public String getFirst_frame() {
                return first_frame;
            }

            public void setFirst_frame(String first_frame) {
                this.first_frame = first_frame;
            }

            public String getPub_location() {
                return pub_location;
            }

            public void setPub_location(String pub_location) {
                this.pub_location = pub_location;
            }

            public String getBvid() {
                return bvid;
            }

            public void setBvid(String bvid) {
                this.bvid = bvid;
            }

            public int getSeason_type() {
                return season_type;
            }

            public void setSeason_type(int season_type) {
                this.season_type = season_type;
            }

            public boolean isIs_ogv() {
                return is_ogv;
            }

            public void setIs_ogv(boolean is_ogv) {
                this.is_ogv = is_ogv;
            }

            public Object getOgv_info() {
                return ogv_info;
            }

            public void setOgv_info(Object ogv_info) {
                this.ogv_info = ogv_info;
            }

            public String getRcmd_reason() {
                return rcmd_reason;
            }

            public void setRcmd_reason(String rcmd_reason) {
                this.rcmd_reason = rcmd_reason;
            }

            public int getSeason_id() {
                return season_id;
            }

            public void setSeason_id(int season_id) {
                this.season_id = season_id;
            }

            public boolean isDismiss() {
                return dismiss;
            }

            public void setDismiss(boolean dismiss) {
                this.dismiss = dismiss;
            }

            public String getBanType() {
                return banType;
            }

            public void setBanType(String banType) {
                this.banType = banType;
            }

            public static class RightsBean {
                private int bp;
                private int elec;
                private int download;
                private int movie;
                private int pay;
                private int hd5;
                private int no_reprint;
                private int autoplay;
                private int ugc_pay;
                private int is_cooperation;
                private int ugc_pay_preview;
                private int no_background;
                private int arc_pay;
                private int pay_free_watch;

                public int getBp() {
                    return bp;
                }

                public void setBp(int bp) {
                    this.bp = bp;
                }

                public int getElec() {
                    return elec;
                }

                public void setElec(int elec) {
                    this.elec = elec;
                }

                public int getDownload() {
                    return download;
                }

                public void setDownload(int download) {
                    this.download = download;
                }

                public int getMovie() {
                    return movie;
                }

                public void setMovie(int movie) {
                    this.movie = movie;
                }

                public int getPay() {
                    return pay;
                }

                public void setPay(int pay) {
                    this.pay = pay;
                }

                public int getHd5() {
                    return hd5;
                }

                public void setHd5(int hd5) {
                    this.hd5 = hd5;
                }

                public int getNo_reprint() {
                    return no_reprint;
                }

                public void setNo_reprint(int no_reprint) {
                    this.no_reprint = no_reprint;
                }

                public int getAutoplay() {
                    return autoplay;
                }

                public void setAutoplay(int autoplay) {
                    this.autoplay = autoplay;
                }

                public int getUgc_pay() {
                    return ugc_pay;
                }

                public void setUgc_pay(int ugc_pay) {
                    this.ugc_pay = ugc_pay;
                }

                public int getIs_cooperation() {
                    return is_cooperation;
                }

                public void setIs_cooperation(int is_cooperation) {
                    this.is_cooperation = is_cooperation;
                }

                public int getUgc_pay_preview() {
                    return ugc_pay_preview;
                }

                public void setUgc_pay_preview(int ugc_pay_preview) {
                    this.ugc_pay_preview = ugc_pay_preview;
                }

                public int getNo_background() {
                    return no_background;
                }

                public void setNo_background(int no_background) {
                    this.no_background = no_background;
                }

                public int getArc_pay() {
                    return arc_pay;
                }

                public void setArc_pay(int arc_pay) {
                    this.arc_pay = arc_pay;
                }

                public int getPay_free_watch() {
                    return pay_free_watch;
                }

                public void setPay_free_watch(int pay_free_watch) {
                    this.pay_free_watch = pay_free_watch;
                }
            }

            public static class OwnerBean {
                private long mid;
                private String name;
                private String face;

                public long getMid() {
                    return mid;
                }

                public void setMid(long mid) {
                    this.mid = mid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getFace() {
                    return face;
                }

                public void setFace(String face) {
                    this.face = face;
                }
            }

            public static class StatBean {
                private int aid;
                private int view;
                private int danmaku;
                private int reply;
                private int favorite;
                private int coin;
                private int share;
                private int now_rank;
                private int his_rank;
                private int like;
                private int dislike;

                public int getAid() {
                    return aid;
                }

                public void setAid(int aid) {
                    this.aid = aid;
                }

                public int getView() {
                    return view;
                }

                public void setView(int view) {
                    this.view = view;
                }

                public int getDanmaku() {
                    return danmaku;
                }

                public void setDanmaku(int danmaku) {
                    this.danmaku = danmaku;
                }

                public int getReply() {
                    return reply;
                }

                public void setReply(int reply) {
                    this.reply = reply;
                }

                public int getFavorite() {
                    return favorite;
                }

                public void setFavorite(int favorite) {
                    this.favorite = favorite;
                }

                public int getCoin() {
                    return coin;
                }

                public void setCoin(int coin) {
                    this.coin = coin;
                }

                public int getShare() {
                    return share;
                }

                public void setShare(int share) {
                    this.share = share;
                }

                public int getNow_rank() {
                    return now_rank;
                }

                public void setNow_rank(int now_rank) {
                    this.now_rank = now_rank;
                }

                public int getHis_rank() {
                    return his_rank;
                }

                public void setHis_rank(int his_rank) {
                    this.his_rank = his_rank;
                }

                public int getLike() {
                    return like;
                }

                public void setLike(int like) {
                    this.like = like;
                }

                public int getDislike() {
                    return dislike;
                }

                public void setDislike(int dislike) {
                    this.dislike = dislike;
                }
            }

            public static class DimensionBean {
                private int width;
                private int height;
                private int rotate;

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getRotate() {
                    return rotate;
                }

                public void setRotate(int rotate) {
                    this.rotate = rotate;
                }
            }
        }
    }
}
