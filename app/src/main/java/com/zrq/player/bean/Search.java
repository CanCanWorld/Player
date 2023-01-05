package com.zrq.player.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Search {

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
        private String seid;
        private int page;
        private int pagesize;
        private int numResults;
        private int numPages;
        private String suggest_keyword;
        private String rqt_type;
        private CostTimeBean cost_time;
        private ExpListBean exp_list;
        private int egg_hit;
        private List<ResultBean> result;
        private int show_column;
        private int in_black_key;
        private int in_white_key;

        public String getSeid() {
            return seid;
        }

        public void setSeid(String seid) {
            this.seid = seid;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getPagesize() {
            return pagesize;
        }

        public void setPagesize(int pagesize) {
            this.pagesize = pagesize;
        }

        public int getNumResults() {
            return numResults;
        }

        public void setNumResults(int numResults) {
            this.numResults = numResults;
        }

        public int getNumPages() {
            return numPages;
        }

        public void setNumPages(int numPages) {
            this.numPages = numPages;
        }

        public String getSuggest_keyword() {
            return suggest_keyword;
        }

        public void setSuggest_keyword(String suggest_keyword) {
            this.suggest_keyword = suggest_keyword;
        }

        public String getRqt_type() {
            return rqt_type;
        }

        public void setRqt_type(String rqt_type) {
            this.rqt_type = rqt_type;
        }

        public CostTimeBean getCost_time() {
            return cost_time;
        }

        public void setCost_time(CostTimeBean cost_time) {
            this.cost_time = cost_time;
        }

        public ExpListBean getExp_list() {
            return exp_list;
        }

        public void setExp_list(ExpListBean exp_list) {
            this.exp_list = exp_list;
        }

        public int getEgg_hit() {
            return egg_hit;
        }

        public void setEgg_hit(int egg_hit) {
            this.egg_hit = egg_hit;
        }

        public List<ResultBean> getResult() {
            return result;
        }

        public void setResult(List<ResultBean> result) {
            this.result = result;
        }

        public int getShow_column() {
            return show_column;
        }

        public void setShow_column(int show_column) {
            this.show_column = show_column;
        }

        public int getIn_black_key() {
            return in_black_key;
        }

        public void setIn_black_key(int in_black_key) {
            this.in_black_key = in_black_key;
        }

        public int getIn_white_key() {
            return in_white_key;
        }

        public void setIn_white_key(int in_white_key) {
            this.in_white_key = in_white_key;
        }

        public static class CostTimeBean {
            private String params_check;
            private String is_risk_query;
            private String illegal_handler;
            private String as_response_format;
            private String as_request;
            private String save_cache;
            private String deserialize_response;
            private String as_request_format;
            private String total;
            private String main_handler;

            public String getParams_check() {
                return params_check;
            }

            public void setParams_check(String params_check) {
                this.params_check = params_check;
            }

            public String getIs_risk_query() {
                return is_risk_query;
            }

            public void setIs_risk_query(String is_risk_query) {
                this.is_risk_query = is_risk_query;
            }

            public String getIllegal_handler() {
                return illegal_handler;
            }

            public void setIllegal_handler(String illegal_handler) {
                this.illegal_handler = illegal_handler;
            }

            public String getAs_response_format() {
                return as_response_format;
            }

            public void setAs_response_format(String as_response_format) {
                this.as_response_format = as_response_format;
            }

            public String getAs_request() {
                return as_request;
            }

            public void setAs_request(String as_request) {
                this.as_request = as_request;
            }

            public String getSave_cache() {
                return save_cache;
            }

            public void setSave_cache(String save_cache) {
                this.save_cache = save_cache;
            }

            public String getDeserialize_response() {
                return deserialize_response;
            }

            public void setDeserialize_response(String deserialize_response) {
                this.deserialize_response = deserialize_response;
            }

            public String getAs_request_format() {
                return as_request_format;
            }

            public void setAs_request_format(String as_request_format) {
                this.as_request_format = as_request_format;
            }

            public String getTotal() {
                return total;
            }

            public void setTotal(String total) {
                this.total = total;
            }

            public String getMain_handler() {
                return main_handler;
            }

            public void setMain_handler(String main_handler) {
                this.main_handler = main_handler;
            }
        }

        public static class ExpListBean {
            @SerializedName("5510")
            private boolean _$5510;
            @SerializedName("6604")
            private boolean _$6604;
            @SerializedName("7701")
            private boolean _$7701;

            public boolean is_$5510() {
                return _$5510;
            }

            public void set_$5510(boolean _$5510) {
                this._$5510 = _$5510;
            }

            public boolean is_$6604() {
                return _$6604;
            }

            public void set_$6604(boolean _$6604) {
                this._$6604 = _$6604;
            }

            public boolean is_$7701() {
                return _$7701;
            }

            public void set_$7701(boolean _$7701) {
                this._$7701 = _$7701;
            }
        }

        public static class ResultBean {
            private String type;
            private int id;
            private String author;
            private int mid;
            private String typeid;
            private String typename;
            private String arcurl;
            private int aid;
            private String bvid;
            private String title;
            private String description;
            private String arcrank;
            private String pic;
            private int play;
            private int video_review;
            private int favorites;
            private String tag;
            private int review;
            private int pubdate;
            private int senddate;
            private String duration;
            private boolean badgepay;
            private List<String> hit_columns;
            private String view_type;
            private int is_pay;
            private int is_union_video;
            private Object rec_tags;
            private List<?> new_rec_tags;
            private int rank_score;
            private int like;
            private String upic;
            private String corner;
            private String cover;
            private String desc;
            private String url;
            private String rec_reason;
            private int danmaku;
            private Object biz_data;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public int getMid() {
                return mid;
            }

            public void setMid(int mid) {
                this.mid = mid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getTypename() {
                return typename;
            }

            public void setTypename(String typename) {
                this.typename = typename;
            }

            public String getArcurl() {
                return arcurl;
            }

            public void setArcurl(String arcurl) {
                this.arcurl = arcurl;
            }

            public int getAid() {
                return aid;
            }

            public void setAid(int aid) {
                this.aid = aid;
            }

            public String getBvid() {
                return bvid;
            }

            public void setBvid(String bvid) {
                this.bvid = bvid;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getArcrank() {
                return arcrank;
            }

            public void setArcrank(String arcrank) {
                this.arcrank = arcrank;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public int getPlay() {
                return play;
            }

            public void setPlay(int play) {
                this.play = play;
            }

            public int getVideo_review() {
                return video_review;
            }

            public void setVideo_review(int video_review) {
                this.video_review = video_review;
            }

            public int getFavorites() {
                return favorites;
            }

            public void setFavorites(int favorites) {
                this.favorites = favorites;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public int getReview() {
                return review;
            }

            public void setReview(int review) {
                this.review = review;
            }

            public int getPubdate() {
                return pubdate;
            }

            public void setPubdate(int pubdate) {
                this.pubdate = pubdate;
            }

            public int getSenddate() {
                return senddate;
            }

            public void setSenddate(int senddate) {
                this.senddate = senddate;
            }

            public String getDuration() {
                return duration;
            }

            public void setDuration(String duration) {
                this.duration = duration;
            }

            public boolean isBadgepay() {
                return badgepay;
            }

            public void setBadgepay(boolean badgepay) {
                this.badgepay = badgepay;
            }

            public List<String> getHit_columns() {
                return hit_columns;
            }

            public void setHit_columns(List<String> hit_columns) {
                this.hit_columns = hit_columns;
            }

            public String getView_type() {
                return view_type;
            }

            public void setView_type(String view_type) {
                this.view_type = view_type;
            }

            public int getIs_pay() {
                return is_pay;
            }

            public void setIs_pay(int is_pay) {
                this.is_pay = is_pay;
            }

            public int getIs_union_video() {
                return is_union_video;
            }

            public void setIs_union_video(int is_union_video) {
                this.is_union_video = is_union_video;
            }

            public Object getRec_tags() {
                return rec_tags;
            }

            public void setRec_tags(Object rec_tags) {
                this.rec_tags = rec_tags;
            }

            public List<?> getNew_rec_tags() {
                return new_rec_tags;
            }

            public void setNew_rec_tags(List<?> new_rec_tags) {
                this.new_rec_tags = new_rec_tags;
            }

            public int getRank_score() {
                return rank_score;
            }

            public void setRank_score(int rank_score) {
                this.rank_score = rank_score;
            }

            public int getLike() {
                return like;
            }

            public void setLike(int like) {
                this.like = like;
            }

            public String getUpic() {
                return upic;
            }

            public void setUpic(String upic) {
                this.upic = upic;
            }

            public String getCorner() {
                return corner;
            }

            public void setCorner(String corner) {
                this.corner = corner;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getRec_reason() {
                return rec_reason;
            }

            public void setRec_reason(String rec_reason) {
                this.rec_reason = rec_reason;
            }

            public int getDanmaku() {
                return danmaku;
            }

            public void setDanmaku(int danmaku) {
                this.danmaku = danmaku;
            }

            public Object getBiz_data() {
                return biz_data;
            }

            public void setBiz_data(Object biz_data) {
                this.biz_data = biz_data;
            }
        }
    }
}
