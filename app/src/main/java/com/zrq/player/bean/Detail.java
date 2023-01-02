package com.zrq.player.bean;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import java.util.List;

@Keep
public class Detail {

    private long code;
    private String message;
    private long ttl;
    private DataBean data;

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTtl() {
        return ttl;
    }

    public void setTtl(long ttl) {
        this.ttl = ttl;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        @SerializedName("View")
        private ViewBean view;
        @SerializedName("Card")
        private CardBean card;
        @SerializedName("Tags")
        private List<TagsBean> tags;
        @SerializedName("Reply")
        private ReplyBean reply;
        @SerializedName("Related")
        private List<RelateDao> related;
        @SerializedName("Spec")
        private Object spec;
        private HotShareBean hot_share;
        private Object elec;
        private Object recommend;
        private ViewAdditBean view_addit;
        private Object guide;

        public ViewBean getView() {
            return view;
        }

        public void setView(ViewBean view) {
            this.view = view;
        }

        public CardBean getCard() {
            return card;
        }

        public void setCard(CardBean card) {
            this.card = card;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public ReplyBean getReply() {
            return reply;
        }

        public void setReply(ReplyBean reply) {
            this.reply = reply;
        }

        public List<RelateDao> getRelated() {
            return related;
        }

        public void setRelated(List<RelateDao> related) {
            this.related = related;
        }

        public Object getSpec() {
            return spec;
        }

        public void setSpec(Object spec) {
            this.spec = spec;
        }

        public HotShareBean getHot_share() {
            return hot_share;
        }

        public void setHot_share(HotShareBean hot_share) {
            this.hot_share = hot_share;
        }

        public Object getElec() {
            return elec;
        }

        public void setElec(Object elec) {
            this.elec = elec;
        }

        public Object getRecommend() {
            return recommend;
        }

        public void setRecommend(Object recommend) {
            this.recommend = recommend;
        }

        public ViewAdditBean getView_addit() {
            return view_addit;
        }

        public void setView_addit(ViewAdditBean view_addit) {
            this.view_addit = view_addit;
        }

        public Object getGuide() {
            return guide;
        }

        public void setGuide(Object guide) {
            this.guide = guide;
        }

        public static class ViewBean {
            private String bvid;
            private long aid;
            private long videos;
            private long tid;
            private String tname;
            private long copyright;
            private String pic;
            private String title;
            private long pubdate;
            private long ctime;
            private String desc;
            private List<DescV2Bean> desc_v2;
            private long state;
            private long duration;
            private RightsBean rights;
            private OwnerBean owner;
            private StatBean stat;
            private String dynamic;
            private long cid;
            private DimensionBean dimension;
            private Object premiere;
            private long teenage_mode;
            private boolean is_chargeable_season;
            private boolean is_story;
            private boolean no_cache;
            private List<PagesBean> pages;
            private SubtitleBean subtitle;
            private boolean is_season_display;
            private UserGarbBean user_garb;
            private HonorReplyBean honor_reply;
            private String like_icon;
            private boolean need_jump_bv;

            public String getBvid() {
                return bvid;
            }

            public void setBvid(String bvid) {
                this.bvid = bvid;
            }

            public long getAid() {
                return aid;
            }

            public void setAid(long aid) {
                this.aid = aid;
            }

            public long getVideos() {
                return videos;
            }

            public void setVideos(long videos) {
                this.videos = videos;
            }

            public long getTid() {
                return tid;
            }

            public void setTid(long tid) {
                this.tid = tid;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public long getCopyright() {
                return copyright;
            }

            public void setCopyright(long copyright) {
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

            public long getPubdate() {
                return pubdate;
            }

            public void setPubdate(long pubdate) {
                this.pubdate = pubdate;
            }

            public long getCtime() {
                return ctime;
            }

            public void setCtime(long ctime) {
                this.ctime = ctime;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public List<DescV2Bean> getDesc_v2() {
                return desc_v2;
            }

            public void setDesc_v2(List<DescV2Bean> desc_v2) {
                this.desc_v2 = desc_v2;
            }

            public long getState() {
                return state;
            }

            public void setState(long state) {
                this.state = state;
            }

            public long getDuration() {
                return duration;
            }

            public void setDuration(long duration) {
                this.duration = duration;
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

            public long getCid() {
                return cid;
            }

            public void setCid(long cid) {
                this.cid = cid;
            }

            public DimensionBean getDimension() {
                return dimension;
            }

            public void setDimension(DimensionBean dimension) {
                this.dimension = dimension;
            }

            public Object getPremiere() {
                return premiere;
            }

            public void setPremiere(Object premiere) {
                this.premiere = premiere;
            }

            public long getTeenage_mode() {
                return teenage_mode;
            }

            public void setTeenage_mode(long teenage_mode) {
                this.teenage_mode = teenage_mode;
            }

            public boolean isIs_chargeable_season() {
                return is_chargeable_season;
            }

            public void setIs_chargeable_season(boolean is_chargeable_season) {
                this.is_chargeable_season = is_chargeable_season;
            }

            public boolean isIs_story() {
                return is_story;
            }

            public void setIs_story(boolean is_story) {
                this.is_story = is_story;
            }

            public boolean isNo_cache() {
                return no_cache;
            }

            public void setNo_cache(boolean no_cache) {
                this.no_cache = no_cache;
            }

            public List<PagesBean> getPages() {
                return pages;
            }

            public void setPages(List<PagesBean> pages) {
                this.pages = pages;
            }

            public SubtitleBean getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(SubtitleBean subtitle) {
                this.subtitle = subtitle;
            }

            public boolean isIs_season_display() {
                return is_season_display;
            }

            public void setIs_season_display(boolean is_season_display) {
                this.is_season_display = is_season_display;
            }

            public UserGarbBean getUser_garb() {
                return user_garb;
            }

            public void setUser_garb(UserGarbBean user_garb) {
                this.user_garb = user_garb;
            }

            public HonorReplyBean getHonor_reply() {
                return honor_reply;
            }

            public void setHonor_reply(HonorReplyBean honor_reply) {
                this.honor_reply = honor_reply;
            }

            public String getLike_icon() {
                return like_icon;
            }

            public void setLike_icon(String like_icon) {
                this.like_icon = like_icon;
            }

            public boolean isNeed_jump_bv() {
                return need_jump_bv;
            }

            public void setNeed_jump_bv(boolean need_jump_bv) {
                this.need_jump_bv = need_jump_bv;
            }

            public static class RightsBean {
                private long bp;
                private long elec;
                private long download;
                private long movie;
                private long pay;
                private long hd5;
                private long no_reprlong;
                private long autoplay;
                private long ugc_pay;
                private long is_cooperation;
                private long ugc_pay_preview;
                private long no_background;
                private long clean_mode;
                private long is_stein_gate;
                private long is_360;
                private long no_share;
                private long arc_pay;
                private long free_watch;

                public long getBp() {
                    return bp;
                }

                public void setBp(long bp) {
                    this.bp = bp;
                }

                public long getElec() {
                    return elec;
                }

                public void setElec(long elec) {
                    this.elec = elec;
                }

                public long getDownload() {
                    return download;
                }

                public void setDownload(long download) {
                    this.download = download;
                }

                public long getMovie() {
                    return movie;
                }

                public void setMovie(long movie) {
                    this.movie = movie;
                }

                public long getPay() {
                    return pay;
                }

                public void setPay(long pay) {
                    this.pay = pay;
                }

                public long getHd5() {
                    return hd5;
                }

                public void setHd5(long hd5) {
                    this.hd5 = hd5;
                }

                public long getNo_reprlong() {
                    return no_reprlong;
                }

                public void setNo_reprlong(long no_reprlong) {
                    this.no_reprlong = no_reprlong;
                }

                public long getAutoplay() {
                    return autoplay;
                }

                public void setAutoplay(long autoplay) {
                    this.autoplay = autoplay;
                }

                public long getUgc_pay() {
                    return ugc_pay;
                }

                public void setUgc_pay(long ugc_pay) {
                    this.ugc_pay = ugc_pay;
                }

                public long getIs_cooperation() {
                    return is_cooperation;
                }

                public void setIs_cooperation(long is_cooperation) {
                    this.is_cooperation = is_cooperation;
                }

                public long getUgc_pay_preview() {
                    return ugc_pay_preview;
                }

                public void setUgc_pay_preview(long ugc_pay_preview) {
                    this.ugc_pay_preview = ugc_pay_preview;
                }

                public long getNo_background() {
                    return no_background;
                }

                public void setNo_background(long no_background) {
                    this.no_background = no_background;
                }

                public long getClean_mode() {
                    return clean_mode;
                }

                public void setClean_mode(long clean_mode) {
                    this.clean_mode = clean_mode;
                }

                public long getIs_stein_gate() {
                    return is_stein_gate;
                }

                public void setIs_stein_gate(long is_stein_gate) {
                    this.is_stein_gate = is_stein_gate;
                }

                public long getIs_360() {
                    return is_360;
                }

                public void setIs_360(long is_360) {
                    this.is_360 = is_360;
                }

                public long getNo_share() {
                    return no_share;
                }

                public void setNo_share(long no_share) {
                    this.no_share = no_share;
                }

                public long getArc_pay() {
                    return arc_pay;
                }

                public void setArc_pay(long arc_pay) {
                    this.arc_pay = arc_pay;
                }

                public long getFree_watch() {
                    return free_watch;
                }

                public void setFree_watch(long free_watch) {
                    this.free_watch = free_watch;
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
                private long aid;
                private long view;
                private long danmaku;
                private long reply;
                private long favorite;
                private long coin;
                private long share;
                private long now_rank;
                private long his_rank;
                private long like;
                private long dislike;
                private String evaluation;
                private String argue_msg;

                public long getAid() {
                    return aid;
                }

                public void setAid(long aid) {
                    this.aid = aid;
                }

                public long getView() {
                    return view;
                }

                public void setView(long view) {
                    this.view = view;
                }

                public long getDanmaku() {
                    return danmaku;
                }

                public void setDanmaku(long danmaku) {
                    this.danmaku = danmaku;
                }

                public long getReply() {
                    return reply;
                }

                public void setReply(long reply) {
                    this.reply = reply;
                }

                public long getFavorite() {
                    return favorite;
                }

                public void setFavorite(long favorite) {
                    this.favorite = favorite;
                }

                public long getCoin() {
                    return coin;
                }

                public void setCoin(long coin) {
                    this.coin = coin;
                }

                public long getShare() {
                    return share;
                }

                public void setShare(long share) {
                    this.share = share;
                }

                public long getNow_rank() {
                    return now_rank;
                }

                public void setNow_rank(long now_rank) {
                    this.now_rank = now_rank;
                }

                public long getHis_rank() {
                    return his_rank;
                }

                public void setHis_rank(long his_rank) {
                    this.his_rank = his_rank;
                }

                public long getLike() {
                    return like;
                }

                public void setLike(long like) {
                    this.like = like;
                }

                public long getDislike() {
                    return dislike;
                }

                public void setDislike(long dislike) {
                    this.dislike = dislike;
                }

                public String getEvaluation() {
                    return evaluation;
                }

                public void setEvaluation(String evaluation) {
                    this.evaluation = evaluation;
                }

                public String getArgue_msg() {
                    return argue_msg;
                }

                public void setArgue_msg(String argue_msg) {
                    this.argue_msg = argue_msg;
                }
            }

            public static class DimensionBean {
                private long width;
                private long height;
                private long rotate;

                public long getWidth() {
                    return width;
                }

                public void setWidth(long width) {
                    this.width = width;
                }

                public long getHeight() {
                    return height;
                }

                public void setHeight(long height) {
                    this.height = height;
                }

                public long getRotate() {
                    return rotate;
                }

                public void setRotate(long rotate) {
                    this.rotate = rotate;
                }
            }

            public static class SubtitleBean {
                private boolean allow_submit;
                private List<ListBean> list;

                public boolean isAllow_submit() {
                    return allow_submit;
                }

                public void setAllow_submit(boolean allow_submit) {
                    this.allow_submit = allow_submit;
                }

                public List<ListBean> getList() {
                    return list;
                }

                public void setList(List<ListBean> list) {
                    this.list = list;
                }

                public static class ListBean {
                    private long id;
                    private String lan;
                    private String lan_doc;
                    private boolean is_lock;
                    private String subtitle_url;
                    private long type;
                    private String id_str;
                    private long ai_type;
                    private long ai_status;
                    private AuthorBean author;

                    public long getId() {
                        return id;
                    }

                    public void setId(long id) {
                        this.id = id;
                    }

                    public String getLan() {
                        return lan;
                    }

                    public void setLan(String lan) {
                        this.lan = lan;
                    }

                    public String getLan_doc() {
                        return lan_doc;
                    }

                    public void setLan_doc(String lan_doc) {
                        this.lan_doc = lan_doc;
                    }

                    public boolean isIs_lock() {
                        return is_lock;
                    }

                    public void setIs_lock(boolean is_lock) {
                        this.is_lock = is_lock;
                    }

                    public String getSubtitle_url() {
                        return subtitle_url;
                    }

                    public void setSubtitle_url(String subtitle_url) {
                        this.subtitle_url = subtitle_url;
                    }

                    public long getType() {
                        return type;
                    }

                    public void setType(long type) {
                        this.type = type;
                    }

                    public String getId_str() {
                        return id_str;
                    }

                    public void setId_str(String id_str) {
                        this.id_str = id_str;
                    }

                    public long getAi_type() {
                        return ai_type;
                    }

                    public void setAi_type(long ai_type) {
                        this.ai_type = ai_type;
                    }

                    public long getAi_status() {
                        return ai_status;
                    }

                    public void setAi_status(long ai_status) {
                        this.ai_status = ai_status;
                    }

                    public AuthorBean getAuthor() {
                        return author;
                    }

                    public void setAuthor(AuthorBean author) {
                        this.author = author;
                    }

                    public static class AuthorBean {
                        private long mid;
                        private String name;
                        private String sex;
                        private String face;
                        private String sign;
                        private long rank;
                        private long birthday;
                        private long is_fake_account;
                        private long is_deleted;
                        private long in_reg_audit;
                        private long is_senior_member;

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

                        public String getSex() {
                            return sex;
                        }

                        public void setSex(String sex) {
                            this.sex = sex;
                        }

                        public String getFace() {
                            return face;
                        }

                        public void setFace(String face) {
                            this.face = face;
                        }

                        public String getSign() {
                            return sign;
                        }

                        public void setSign(String sign) {
                            this.sign = sign;
                        }

                        public long getRank() {
                            return rank;
                        }

                        public void setRank(long rank) {
                            this.rank = rank;
                        }

                        public long getBirthday() {
                            return birthday;
                        }

                        public void setBirthday(long birthday) {
                            this.birthday = birthday;
                        }

                        public long getIs_fake_account() {
                            return is_fake_account;
                        }

                        public void setIs_fake_account(long is_fake_account) {
                            this.is_fake_account = is_fake_account;
                        }

                        public long getIs_deleted() {
                            return is_deleted;
                        }

                        public void setIs_deleted(long is_deleted) {
                            this.is_deleted = is_deleted;
                        }

                        public long getIn_reg_audit() {
                            return in_reg_audit;
                        }

                        public void setIn_reg_audit(long in_reg_audit) {
                            this.in_reg_audit = in_reg_audit;
                        }

                        public long getIs_senior_member() {
                            return is_senior_member;
                        }

                        public void setIs_senior_member(long is_senior_member) {
                            this.is_senior_member = is_senior_member;
                        }
                    }
                }
            }

            public static class UserGarbBean {
                private String url_image_ani_cut;

                public String getUrl_image_ani_cut() {
                    return url_image_ani_cut;
                }

                public void setUrl_image_ani_cut(String url_image_ani_cut) {
                    this.url_image_ani_cut = url_image_ani_cut;
                }
            }

            public static class HonorReplyBean {
            }

            public static class DescV2Bean {
                private String raw_text;
                private long type;
                private long biz_id;

                public String getRaw_text() {
                    return raw_text;
                }

                public void setRaw_text(String raw_text) {
                    this.raw_text = raw_text;
                }

                public long getType() {
                    return type;
                }

                public void setType(long type) {
                    this.type = type;
                }

                public long getBiz_id() {
                    return biz_id;
                }

                public void setBiz_id(long biz_id) {
                    this.biz_id = biz_id;
                }
            }

            public static class PagesBean {
                private long cid;
                private long page;
                private String from;
                private String part;
                private long duration;
                private String vid;
                private String weblink;
                private DimensionBean dimension;
                private String first_frame;

                public long getCid() {
                    return cid;
                }

                public void setCid(long cid) {
                    this.cid = cid;
                }

                public long getPage() {
                    return page;
                }

                public void setPage(long page) {
                    this.page = page;
                }

                public String getFrom() {
                    return from;
                }

                public void setFrom(String from) {
                    this.from = from;
                }

                public String getPart() {
                    return part;
                }

                public void setPart(String part) {
                    this.part = part;
                }

                public long getDuration() {
                    return duration;
                }

                public void setDuration(long duration) {
                    this.duration = duration;
                }

                public String getVid() {
                    return vid;
                }

                public void setVid(String vid) {
                    this.vid = vid;
                }

                public String getWeblink() {
                    return weblink;
                }

                public void setWeblink(String weblink) {
                    this.weblink = weblink;
                }

                public DimensionBean getDimension() {
                    return dimension;
                }

                public void setDimension(DimensionBean dimension) {
                    this.dimension = dimension;
                }

                public String getFirst_frame() {
                    return first_frame;
                }

                public void setFirst_frame(String first_frame) {
                    this.first_frame = first_frame;
                }

                public static class DimensionBean {
                    private long width;
                    private long height;
                    private long rotate;

                    public long getWidth() {
                        return width;
                    }

                    public void setWidth(long width) {
                        this.width = width;
                    }

                    public long getHeight() {
                        return height;
                    }

                    public void setHeight(long height) {
                        this.height = height;
                    }

                    public long getRotate() {
                        return rotate;
                    }

                    public void setRotate(long rotate) {
                        this.rotate = rotate;
                    }
                }
            }
        }

        public static class CardBean {
            private Card card;
            private SpaceBean space;
            private boolean following;
            private long archive_count;
            private long article_count;
            private long follower;
            private long like_num;

            public Card getCard() {
                return card;
            }

            public void setCard(Card card) {
                this.card = card;
            }

            public SpaceBean getSpace() {
                return space;
            }

            public void setSpace(SpaceBean space) {
                this.space = space;
            }

            public boolean isFollowing() {
                return following;
            }

            public void setFollowing(boolean following) {
                this.following = following;
            }

            public long getArchive_count() {
                return archive_count;
            }

            public void setArchive_count(long archive_count) {
                this.archive_count = archive_count;
            }

            public long getArticle_count() {
                return article_count;
            }

            public void setArticle_count(long article_count) {
                this.article_count = article_count;
            }

            public long getFollower() {
                return follower;
            }

            public void setFollower(long follower) {
                this.follower = follower;
            }

            public long getLike_num() {
                return like_num;
            }

            public void setLike_num(long like_num) {
                this.like_num = like_num;
            }

            public static class Card {
                private String mid;
                private String name;
                private boolean approve;
                private String sex;
                private String rank;
                private String face;
                private long face_nft;
                private long face_nft_type;
                @SerializedName("DisplayRank")
                private String displayRank;
                private long regtime;
                private long spacesta;
                private String birthday;
                private String place;
                private String description;
                private long article;
                private List<?> attentions;
                private long fans;
                private long friend;
                private long attention;
                private String sign;
                private LevelInfoBean level_info;
                private PendantBean pendant;
                private NameplateBean nameplate;
                @SerializedName("Official")
                private OfficialBean official;
                private OfficialVerifyBean official_verify;
                private VipBean vip;
                private long is_senior_member;

                public String getMid() {
                    return mid;
                }

                public void setMid(String mid) {
                    this.mid = mid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public boolean isApprove() {
                    return approve;
                }

                public void setApprove(boolean approve) {
                    this.approve = approve;
                }

                public String getSex() {
                    return sex;
                }

                public void setSex(String sex) {
                    this.sex = sex;
                }

                public String getRank() {
                    return rank;
                }

                public void setRank(String rank) {
                    this.rank = rank;
                }

                public String getFace() {
                    return face;
                }

                public void setFace(String face) {
                    this.face = face;
                }

                public long getFace_nft() {
                    return face_nft;
                }

                public void setFace_nft(long face_nft) {
                    this.face_nft = face_nft;
                }

                public long getFace_nft_type() {
                    return face_nft_type;
                }

                public void setFace_nft_type(long face_nft_type) {
                    this.face_nft_type = face_nft_type;
                }

                public String getDisplayRank() {
                    return displayRank;
                }

                public void setDisplayRank(String displayRank) {
                    this.displayRank = displayRank;
                }

                public long getRegtime() {
                    return regtime;
                }

                public void setRegtime(long regtime) {
                    this.regtime = regtime;
                }

                public long getSpacesta() {
                    return spacesta;
                }

                public void setSpacesta(long spacesta) {
                    this.spacesta = spacesta;
                }

                public String getBirthday() {
                    return birthday;
                }

                public void setBirthday(String birthday) {
                    this.birthday = birthday;
                }

                public String getPlace() {
                    return place;
                }

                public void setPlace(String place) {
                    this.place = place;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public long getArticle() {
                    return article;
                }

                public void setArticle(long article) {
                    this.article = article;
                }

                public List<?> getAttentions() {
                    return attentions;
                }

                public void setAttentions(List<?> attentions) {
                    this.attentions = attentions;
                }

                public long getFans() {
                    return fans;
                }

                public void setFans(long fans) {
                    this.fans = fans;
                }

                public long getFriend() {
                    return friend;
                }

                public void setFriend(long friend) {
                    this.friend = friend;
                }

                public long getAttention() {
                    return attention;
                }

                public void setAttention(long attention) {
                    this.attention = attention;
                }

                public String getSign() {
                    return sign;
                }

                public void setSign(String sign) {
                    this.sign = sign;
                }

                public LevelInfoBean getLevel_info() {
                    return level_info;
                }

                public void setLevel_info(LevelInfoBean level_info) {
                    this.level_info = level_info;
                }

                public PendantBean getPendant() {
                    return pendant;
                }

                public void setPendant(PendantBean pendant) {
                    this.pendant = pendant;
                }

                public NameplateBean getNameplate() {
                    return nameplate;
                }

                public void setNameplate(NameplateBean nameplate) {
                    this.nameplate = nameplate;
                }

                public OfficialBean getOfficial() {
                    return official;
                }

                public void setOfficial(OfficialBean official) {
                    this.official = official;
                }

                public OfficialVerifyBean getOfficial_verify() {
                    return official_verify;
                }

                public void setOfficial_verify(OfficialVerifyBean official_verify) {
                    this.official_verify = official_verify;
                }

                public VipBean getVip() {
                    return vip;
                }

                public void setVip(VipBean vip) {
                    this.vip = vip;
                }

                public long getIs_senior_member() {
                    return is_senior_member;
                }

                public void setIs_senior_member(long is_senior_member) {
                    this.is_senior_member = is_senior_member;
                }

                public static class LevelInfoBean {
                    private long current_level;
                    private long current_min;
                    private long current_exp;
                    private long next_exp;

                    public long getCurrent_level() {
                        return current_level;
                    }

                    public void setCurrent_level(long current_level) {
                        this.current_level = current_level;
                    }

                    public long getCurrent_min() {
                        return current_min;
                    }

                    public void setCurrent_min(long current_min) {
                        this.current_min = current_min;
                    }

                    public long getCurrent_exp() {
                        return current_exp;
                    }

                    public void setCurrent_exp(long current_exp) {
                        this.current_exp = current_exp;
                    }

                    public long getNext_exp() {
                        return next_exp;
                    }

                    public void setNext_exp(long next_exp) {
                        this.next_exp = next_exp;
                    }
                }

                public static class PendantBean {
                    private long pid;
                    private String name;
                    private String image;
                    private long expire;
                    private String image_enhance;
                    private String image_enhance_frame;

                    public long getPid() {
                        return pid;
                    }

                    public void setPid(long pid) {
                        this.pid = pid;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getImage() {
                        return image;
                    }

                    public void setImage(String image) {
                        this.image = image;
                    }

                    public long getExpire() {
                        return expire;
                    }

                    public void setExpire(long expire) {
                        this.expire = expire;
                    }

                    public String getImage_enhance() {
                        return image_enhance;
                    }

                    public void setImage_enhance(String image_enhance) {
                        this.image_enhance = image_enhance;
                    }

                    public String getImage_enhance_frame() {
                        return image_enhance_frame;
                    }

                    public void setImage_enhance_frame(String image_enhance_frame) {
                        this.image_enhance_frame = image_enhance_frame;
                    }
                }

                public static class NameplateBean {
                    private long nid;
                    private String name;
                    private String image;
                    private String image_small;
                    private String level;
                    private String condition;

                    public long getNid() {
                        return nid;
                    }

                    public void setNid(long nid) {
                        this.nid = nid;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getImage() {
                        return image;
                    }

                    public void setImage(String image) {
                        this.image = image;
                    }

                    public String getImage_small() {
                        return image_small;
                    }

                    public void setImage_small(String image_small) {
                        this.image_small = image_small;
                    }

                    public String getLevel() {
                        return level;
                    }

                    public void setLevel(String level) {
                        this.level = level;
                    }

                    public String getCondition() {
                        return condition;
                    }

                    public void setCondition(String condition) {
                        this.condition = condition;
                    }
                }

                public static class OfficialBean {
                    private long role;
                    private String title;
                    private String desc;
                    private long type;

                    public long getRole() {
                        return role;
                    }

                    public void setRole(long role) {
                        this.role = role;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }

                    public long getType() {
                        return type;
                    }

                    public void setType(long type) {
                        this.type = type;
                    }
                }

                public static class OfficialVerifyBean {
                    private long type;
                    private String desc;

                    public long getType() {
                        return type;
                    }

                    public void setType(long type) {
                        this.type = type;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }

                public static class VipBean {
                    private long type;
                    private long status;
                    private long due_date;
                    private long vip_pay_type;
                    private long theme_type;
                    private LabelBean label;
                    private long avatar_subscript;
                    private String nickname_color;
                    private long role;
                    private String avatar_subscript_url;
                    private long tv_vip_status;
                    private long tv_vip_pay_type;
                    private long vipType;
                    private long vipStatus;

                    public long getType() {
                        return type;
                    }

                    public void setType(long type) {
                        this.type = type;
                    }

                    public long getStatus() {
                        return status;
                    }

                    public void setStatus(long status) {
                        this.status = status;
                    }

                    public long getDue_date() {
                        return due_date;
                    }

                    public void setDue_date(long due_date) {
                        this.due_date = due_date;
                    }

                    public long getVip_pay_type() {
                        return vip_pay_type;
                    }

                    public void setVip_pay_type(long vip_pay_type) {
                        this.vip_pay_type = vip_pay_type;
                    }

                    public long getTheme_type() {
                        return theme_type;
                    }

                    public void setTheme_type(long theme_type) {
                        this.theme_type = theme_type;
                    }

                    public LabelBean getLabel() {
                        return label;
                    }

                    public void setLabel(LabelBean label) {
                        this.label = label;
                    }

                    public long getAvatar_subscript() {
                        return avatar_subscript;
                    }

                    public void setAvatar_subscript(long avatar_subscript) {
                        this.avatar_subscript = avatar_subscript;
                    }

                    public String getNickname_color() {
                        return nickname_color;
                    }

                    public void setNickname_color(String nickname_color) {
                        this.nickname_color = nickname_color;
                    }

                    public long getRole() {
                        return role;
                    }

                    public void setRole(long role) {
                        this.role = role;
                    }

                    public String getAvatar_subscript_url() {
                        return avatar_subscript_url;
                    }

                    public void setAvatar_subscript_url(String avatar_subscript_url) {
                        this.avatar_subscript_url = avatar_subscript_url;
                    }

                    public long getTv_vip_status() {
                        return tv_vip_status;
                    }

                    public void setTv_vip_status(long tv_vip_status) {
                        this.tv_vip_status = tv_vip_status;
                    }

                    public long getTv_vip_pay_type() {
                        return tv_vip_pay_type;
                    }

                    public void setTv_vip_pay_type(long tv_vip_pay_type) {
                        this.tv_vip_pay_type = tv_vip_pay_type;
                    }

                    public long getVipType() {
                        return vipType;
                    }

                    public void setVipType(long vipType) {
                        this.vipType = vipType;
                    }

                    public long getVipStatus() {
                        return vipStatus;
                    }

                    public void setVipStatus(long vipStatus) {
                        this.vipStatus = vipStatus;
                    }

                    public static class LabelBean {
                        private String path;
                        private String text;
                        private String label_theme;
                        private String text_color;
                        private long bg_style;
                        private String bg_color;
                        private String border_color;
                        private boolean use_img_label;
                        private String img_label_uri_hans;
                        private String img_label_uri_hant;
                        private String img_label_uri_hans_static;
                        private String img_label_uri_hant_static;

                        public String getPath() {
                            return path;
                        }

                        public void setPath(String path) {
                            this.path = path;
                        }

                        public String getText() {
                            return text;
                        }

                        public void setText(String text) {
                            this.text = text;
                        }

                        public String getLabel_theme() {
                            return label_theme;
                        }

                        public void setLabel_theme(String label_theme) {
                            this.label_theme = label_theme;
                        }

                        public String getText_color() {
                            return text_color;
                        }

                        public void setText_color(String text_color) {
                            this.text_color = text_color;
                        }

                        public long getBg_style() {
                            return bg_style;
                        }

                        public void setBg_style(long bg_style) {
                            this.bg_style = bg_style;
                        }

                        public String getBg_color() {
                            return bg_color;
                        }

                        public void setBg_color(String bg_color) {
                            this.bg_color = bg_color;
                        }

                        public String getBorder_color() {
                            return border_color;
                        }

                        public void setBorder_color(String border_color) {
                            this.border_color = border_color;
                        }

                        public boolean isUse_img_label() {
                            return use_img_label;
                        }

                        public void setUse_img_label(boolean use_img_label) {
                            this.use_img_label = use_img_label;
                        }

                        public String getImg_label_uri_hans() {
                            return img_label_uri_hans;
                        }

                        public void setImg_label_uri_hans(String img_label_uri_hans) {
                            this.img_label_uri_hans = img_label_uri_hans;
                        }

                        public String getImg_label_uri_hant() {
                            return img_label_uri_hant;
                        }

                        public void setImg_label_uri_hant(String img_label_uri_hant) {
                            this.img_label_uri_hant = img_label_uri_hant;
                        }

                        public String getImg_label_uri_hans_static() {
                            return img_label_uri_hans_static;
                        }

                        public void setImg_label_uri_hans_static(String img_label_uri_hans_static) {
                            this.img_label_uri_hans_static = img_label_uri_hans_static;
                        }

                        public String getImg_label_uri_hant_static() {
                            return img_label_uri_hant_static;
                        }

                        public void setImg_label_uri_hant_static(String img_label_uri_hant_static) {
                            this.img_label_uri_hant_static = img_label_uri_hant_static;
                        }
                    }
                }
            }

            public static class SpaceBean {
                private String s_img;
                private String l_img;

                public String getS_img() {
                    return s_img;
                }

                public void setS_img(String s_img) {
                    this.s_img = s_img;
                }

                public String getL_img() {
                    return l_img;
                }

                public void setL_img(String l_img) {
                    this.l_img = l_img;
                }
            }
        }

        public static class ReplyBean {
            private PageBean page;
            private List<RepliesBean> replies;

            public PageBean getPage() {
                return page;
            }

            public void setPage(PageBean page) {
                this.page = page;
            }

            public List<RepliesBean> getReplies() {
                return replies;
            }

            public void setReplies(List<RepliesBean> replies) {
                this.replies = replies;
            }

            public static class PageBean {
                private long acount;
                private long count;
                private long num;
                private long size;

                public long getAcount() {
                    return acount;
                }

                public void setAcount(long acount) {
                    this.acount = acount;
                }

                public long getCount() {
                    return count;
                }

                public void setCount(long count) {
                    this.count = count;
                }

                public long getNum() {
                    return num;
                }

                public void setNum(long num) {
                    this.num = num;
                }

                public long getSize() {
                    return size;
                }

                public void setSize(long size) {
                    this.size = size;
                }
            }

            public static class RepliesBean {
                private long rpid;
                private long oid;
                private long type;
                private long mid;
                private long root;
                private long parent;
                private long dialog;
                private long count;
                private long rcount;
                private long floor;
                private long state;
                private long fansgrade;
                private long attr;
                private long ctime;
                private long like;
                private long action;
                private ContentBean content;
                private Object replies;
                private long assist;
                private boolean show_follow;

                public long getRpid() {
                    return rpid;
                }

                public void setRpid(long rpid) {
                    this.rpid = rpid;
                }

                public long getOid() {
                    return oid;
                }

                public void setOid(long oid) {
                    this.oid = oid;
                }

                public long getType() {
                    return type;
                }

                public void setType(long type) {
                    this.type = type;
                }

                public long getMid() {
                    return mid;
                }

                public void setMid(long mid) {
                    this.mid = mid;
                }

                public long getRoot() {
                    return root;
                }

                public void setRoot(long root) {
                    this.root = root;
                }

                public long getParent() {
                    return parent;
                }

                public void setParent(long parent) {
                    this.parent = parent;
                }

                public long getDialog() {
                    return dialog;
                }

                public void setDialog(long dialog) {
                    this.dialog = dialog;
                }

                public long getCount() {
                    return count;
                }

                public void setCount(long count) {
                    this.count = count;
                }

                public long getRcount() {
                    return rcount;
                }

                public void setRcount(long rcount) {
                    this.rcount = rcount;
                }

                public long getFloor() {
                    return floor;
                }

                public void setFloor(long floor) {
                    this.floor = floor;
                }

                public long getState() {
                    return state;
                }

                public void setState(long state) {
                    this.state = state;
                }

                public long getFansgrade() {
                    return fansgrade;
                }

                public void setFansgrade(long fansgrade) {
                    this.fansgrade = fansgrade;
                }

                public long getAttr() {
                    return attr;
                }

                public void setAttr(long attr) {
                    this.attr = attr;
                }

                public long getCtime() {
                    return ctime;
                }

                public void setCtime(long ctime) {
                    this.ctime = ctime;
                }

                public long getLike() {
                    return like;
                }

                public void setLike(long like) {
                    this.like = like;
                }

                public long getAction() {
                    return action;
                }

                public void setAction(long action) {
                    this.action = action;
                }

                public ContentBean getContent() {
                    return content;
                }

                public void setContent(ContentBean content) {
                    this.content = content;
                }

                public Object getReplies() {
                    return replies;
                }

                public void setReplies(Object replies) {
                    this.replies = replies;
                }

                public long getAssist() {
                    return assist;
                }

                public void setAssist(long assist) {
                    this.assist = assist;
                }

                public boolean isShow_follow() {
                    return show_follow;
                }

                public void setShow_follow(boolean show_follow) {
                    this.show_follow = show_follow;
                }

                public static class ContentBean {
                    private String message;
                    private long plat;
                    private String device;

                    public String getMessage() {
                        return message;
                    }

                    public void setMessage(String message) {
                        this.message = message;
                    }

                    public long getPlat() {
                        return plat;
                    }

                    public void setPlat(long plat) {
                        this.plat = plat;
                    }

                    public String getDevice() {
                        return device;
                    }

                    public void setDevice(String device) {
                        this.device = device;
                    }
                }
            }
        }

        public static class HotShareBean {
            private boolean show;
            private List<?> list;

            public boolean isShow() {
                return show;
            }

            public void setShow(boolean show) {
                this.show = show;
            }

            public List<?> getList() {
                return list;
            }

            public void setList(List<?> list) {
                this.list = list;
            }
        }

        public static class ViewAdditBean {
            @SerializedName("63")
            private boolean _$63;
            @SerializedName("64")
            private boolean _$64;
            @SerializedName("69")
            private boolean _$69;
            @SerializedName("71")
            private boolean _$71;
            @SerializedName("72")
            private boolean _$72;

            public boolean is_$63() {
                return _$63;
            }

            public void set_$63(boolean _$63) {
                this._$63 = _$63;
            }

            public boolean is_$64() {
                return _$64;
            }

            public void set_$64(boolean _$64) {
                this._$64 = _$64;
            }

            public boolean is_$69() {
                return _$69;
            }

            public void set_$69(boolean _$69) {
                this._$69 = _$69;
            }

            public boolean is_$71() {
                return _$71;
            }

            public void set_$71(boolean _$71) {
                this._$71 = _$71;
            }

            public boolean is_$72() {
                return _$72;
            }

            public void set_$72(boolean _$72) {
                this._$72 = _$72;
            }
        }

        public static class TagsBean {
            private long tag_id;
            private String tag_name;
            private String cover;
            private String head_cover;
            private String content;
            private String short_content;
            private long type;
            private long state;
            private long ctime;
            private CountBean count;
            private long is_atten;
            private long likes;
            private long hates;
            private long attribute;
            private long liked;
            private long hated;
            private long extra_attr;
            private String music_id;
            private String tag_type;
            private boolean is_activity;
            private String color;
            private long alpha;
            private boolean is_season;
            private long subscribed_count;
            private String archive_count;
            private long featured_count;
            private String jump_url;

            public long getTag_id() {
                return tag_id;
            }

            public void setTag_id(long tag_id) {
                this.tag_id = tag_id;
            }

            public String getTag_name() {
                return tag_name;
            }

            public void setTag_name(String tag_name) {
                this.tag_name = tag_name;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getHead_cover() {
                return head_cover;
            }

            public void setHead_cover(String head_cover) {
                this.head_cover = head_cover;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getShort_content() {
                return short_content;
            }

            public void setShort_content(String short_content) {
                this.short_content = short_content;
            }

            public long getType() {
                return type;
            }

            public void setType(long type) {
                this.type = type;
            }

            public long getState() {
                return state;
            }

            public void setState(long state) {
                this.state = state;
            }

            public long getCtime() {
                return ctime;
            }

            public void setCtime(long ctime) {
                this.ctime = ctime;
            }

            public CountBean getCount() {
                return count;
            }

            public void setCount(CountBean count) {
                this.count = count;
            }

            public long getIs_atten() {
                return is_atten;
            }

            public void setIs_atten(long is_atten) {
                this.is_atten = is_atten;
            }

            public long getLikes() {
                return likes;
            }

            public void setLikes(long likes) {
                this.likes = likes;
            }

            public long getHates() {
                return hates;
            }

            public void setHates(long hates) {
                this.hates = hates;
            }

            public long getAttribute() {
                return attribute;
            }

            public void setAttribute(long attribute) {
                this.attribute = attribute;
            }

            public long getLiked() {
                return liked;
            }

            public void setLiked(long liked) {
                this.liked = liked;
            }

            public long getHated() {
                return hated;
            }

            public void setHated(long hated) {
                this.hated = hated;
            }

            public long getExtra_attr() {
                return extra_attr;
            }

            public void setExtra_attr(long extra_attr) {
                this.extra_attr = extra_attr;
            }

            public String getMusic_id() {
                return music_id;
            }

            public void setMusic_id(String music_id) {
                this.music_id = music_id;
            }

            public String getTag_type() {
                return tag_type;
            }

            public void setTag_type(String tag_type) {
                this.tag_type = tag_type;
            }

            public boolean isIs_activity() {
                return is_activity;
            }

            public void setIs_activity(boolean is_activity) {
                this.is_activity = is_activity;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public long getAlpha() {
                return alpha;
            }

            public void setAlpha(long alpha) {
                this.alpha = alpha;
            }

            public boolean isIs_season() {
                return is_season;
            }

            public void setIs_season(boolean is_season) {
                this.is_season = is_season;
            }

            public long getSubscribed_count() {
                return subscribed_count;
            }

            public void setSubscribed_count(long subscribed_count) {
                this.subscribed_count = subscribed_count;
            }

            public String getArchive_count() {
                return archive_count;
            }

            public void setArchive_count(String archive_count) {
                this.archive_count = archive_count;
            }

            public long getFeatured_count() {
                return featured_count;
            }

            public void setFeatured_count(long featured_count) {
                this.featured_count = featured_count;
            }

            public String getJump_url() {
                return jump_url;
            }

            public void setJump_url(String jump_url) {
                this.jump_url = jump_url;
            }

            public static class CountBean {
                private long view;
                private long use;
                private long atten;

                public long getView() {
                    return view;
                }

                public void setView(long view) {
                    this.view = view;
                }

                public long getUse() {
                    return use;
                }

                public void setUse(long use) {
                    this.use = use;
                }

                public long getAtten() {
                    return atten;
                }

                public void setAtten(long atten) {
                    this.atten = atten;
                }
            }
        }

    }
}
