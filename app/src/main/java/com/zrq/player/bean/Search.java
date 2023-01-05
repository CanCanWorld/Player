package com.zrq.player.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Search {

    private int code;
    private String message;
    private int ttl;
    private DataDTO data;

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

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public static class DataDTO {
        private String seid;
        private int page;
        private int pagesize;
        private int numResults;
        private int numPages;
        private String suggest_keyword;
        private String rqt_type;
        private CostTimeDTO cost_time;
        private ExpListDTO exp_list;
        private int egg_hit;
        private PageinfoDTO pageinfo;
        private TopTlistDTO top_tlist;
        private int show_column;
        private List<String> show_module_list;
        private AppDisplayOptionDTO app_display_option;
        private int in_black_key;
        private int in_white_key;
        private List<ResultDTO> result;
        private int is_search_page_grayed;

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

        public CostTimeDTO getCost_time() {
            return cost_time;
        }

        public void setCost_time(CostTimeDTO cost_time) {
            this.cost_time = cost_time;
        }

        public ExpListDTO getExp_list() {
            return exp_list;
        }

        public void setExp_list(ExpListDTO exp_list) {
            this.exp_list = exp_list;
        }

        public int getEgg_hit() {
            return egg_hit;
        }

        public void setEgg_hit(int egg_hit) {
            this.egg_hit = egg_hit;
        }

        public PageinfoDTO getPageinfo() {
            return pageinfo;
        }

        public void setPageinfo(PageinfoDTO pageinfo) {
            this.pageinfo = pageinfo;
        }

        public TopTlistDTO getTop_tlist() {
            return top_tlist;
        }

        public void setTop_tlist(TopTlistDTO top_tlist) {
            this.top_tlist = top_tlist;
        }

        public int getShow_column() {
            return show_column;
        }

        public void setShow_column(int show_column) {
            this.show_column = show_column;
        }

        public List<String> getShow_module_list() {
            return show_module_list;
        }

        public void setShow_module_list(List<String> show_module_list) {
            this.show_module_list = show_module_list;
        }

        public AppDisplayOptionDTO getApp_display_option() {
            return app_display_option;
        }

        public void setApp_display_option(AppDisplayOptionDTO app_display_option) {
            this.app_display_option = app_display_option;
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

        public List<ResultDTO> getResult() {
            return result;
        }

        public void setResult(List<ResultDTO> result) {
            this.result = result;
        }

        public int getIs_search_page_grayed() {
            return is_search_page_grayed;
        }

        public void setIs_search_page_grayed(int is_search_page_grayed) {
            this.is_search_page_grayed = is_search_page_grayed;
        }

        public static class CostTimeDTO {
            private String params_check;
            private String is_risk_query;
            private String illegal_handler;
            private String as_response_format;
            private String mysql_request;
            private String as_request;
            private String save_cache;
            private String as_request_format;
            private String deserialize_response;
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

            public String getMysql_request() {
                return mysql_request;
            }

            public void setMysql_request(String mysql_request) {
                this.mysql_request = mysql_request;
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

            public String getAs_request_format() {
                return as_request_format;
            }

            public void setAs_request_format(String as_request_format) {
                this.as_request_format = as_request_format;
            }

            public String getDeserialize_response() {
                return deserialize_response;
            }

            public void setDeserialize_response(String deserialize_response) {
                this.deserialize_response = deserialize_response;
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

        public static class ExpListDTO {
            @SerializedName("6609")
            private boolean _$6609;
            @SerializedName("5505")
            private boolean _$5505;
            @SerializedName("7709")
            private boolean _$7709;

            public boolean is_$6609() {
                return _$6609;
            }

            public void set_$6609(boolean _$6609) {
                this._$6609 = _$6609;
            }

            public boolean is_$5505() {
                return _$5505;
            }

            public void set_$5505(boolean _$5505) {
                this._$5505 = _$5505;
            }

            public boolean is_$7709() {
                return _$7709;
            }

            public void set_$7709(boolean _$7709) {
                this._$7709 = _$7709;
            }
        }

        public static class PageinfoDTO {
            private LiveRoomDTO live_room;
            private PgcDTO pgc;
            private OperationCardDTO operation_card;
            private TvDTO tv;
            private MovieDTO movie;
            private BiliUserDTO bili_user;
            private LiveMasterDTO live_master;
            private LiveAllDTO live_all;
            private TopicDTO topic;
            private UpuserDTO upuser;
            private LiveDTO live;
            private VideoDTO video;
            private UserDTO user;
            private BangumiDTO bangumi;
            private ActivityDTO activity;
            private MediaFtDTO media_ft;
            private ArticleDTO article;
            private MediaBangumiDTO media_bangumi;
            private SpecialDTO special;
            private LiveUserDTO live_user;

            public LiveRoomDTO getLive_room() {
                return live_room;
            }

            public void setLive_room(LiveRoomDTO live_room) {
                this.live_room = live_room;
            }

            public PgcDTO getPgc() {
                return pgc;
            }

            public void setPgc(PgcDTO pgc) {
                this.pgc = pgc;
            }

            public OperationCardDTO getOperation_card() {
                return operation_card;
            }

            public void setOperation_card(OperationCardDTO operation_card) {
                this.operation_card = operation_card;
            }

            public TvDTO getTv() {
                return tv;
            }

            public void setTv(TvDTO tv) {
                this.tv = tv;
            }

            public MovieDTO getMovie() {
                return movie;
            }

            public void setMovie(MovieDTO movie) {
                this.movie = movie;
            }

            public BiliUserDTO getBili_user() {
                return bili_user;
            }

            public void setBili_user(BiliUserDTO bili_user) {
                this.bili_user = bili_user;
            }

            public LiveMasterDTO getLive_master() {
                return live_master;
            }

            public void setLive_master(LiveMasterDTO live_master) {
                this.live_master = live_master;
            }

            public LiveAllDTO getLive_all() {
                return live_all;
            }

            public void setLive_all(LiveAllDTO live_all) {
                this.live_all = live_all;
            }

            public TopicDTO getTopic() {
                return topic;
            }

            public void setTopic(TopicDTO topic) {
                this.topic = topic;
            }

            public UpuserDTO getUpuser() {
                return upuser;
            }

            public void setUpuser(UpuserDTO upuser) {
                this.upuser = upuser;
            }

            public LiveDTO getLive() {
                return live;
            }

            public void setLive(LiveDTO live) {
                this.live = live;
            }

            public VideoDTO getVideo() {
                return video;
            }

            public void setVideo(VideoDTO video) {
                this.video = video;
            }

            public UserDTO getUser() {
                return user;
            }

            public void setUser(UserDTO user) {
                this.user = user;
            }

            public BangumiDTO getBangumi() {
                return bangumi;
            }

            public void setBangumi(BangumiDTO bangumi) {
                this.bangumi = bangumi;
            }

            public ActivityDTO getActivity() {
                return activity;
            }

            public void setActivity(ActivityDTO activity) {
                this.activity = activity;
            }

            public MediaFtDTO getMedia_ft() {
                return media_ft;
            }

            public void setMedia_ft(MediaFtDTO media_ft) {
                this.media_ft = media_ft;
            }

            public ArticleDTO getArticle() {
                return article;
            }

            public void setArticle(ArticleDTO article) {
                this.article = article;
            }

            public MediaBangumiDTO getMedia_bangumi() {
                return media_bangumi;
            }

            public void setMedia_bangumi(MediaBangumiDTO media_bangumi) {
                this.media_bangumi = media_bangumi;
            }

            public SpecialDTO getSpecial() {
                return special;
            }

            public void setSpecial(SpecialDTO special) {
                this.special = special;
            }

            public LiveUserDTO getLive_user() {
                return live_user;
            }

            public void setLive_user(LiveUserDTO live_user) {
                this.live_user = live_user;
            }

            public static class LiveRoomDTO {
                private int numResults;
                private int total;
                private int pages;

                public int getNumResults() {
                    return numResults;
                }

                public void setNumResults(int numResults) {
                    this.numResults = numResults;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getPages() {
                    return pages;
                }

                public void setPages(int pages) {
                    this.pages = pages;
                }
            }

            public static class PgcDTO {
                private int numResults;
                private int total;
                private int pages;

                public int getNumResults() {
                    return numResults;
                }

                public void setNumResults(int numResults) {
                    this.numResults = numResults;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getPages() {
                    return pages;
                }

                public void setPages(int pages) {
                    this.pages = pages;
                }
            }

            public static class OperationCardDTO {
                private int numResults;
                private int total;
                private int pages;

                public int getNumResults() {
                    return numResults;
                }

                public void setNumResults(int numResults) {
                    this.numResults = numResults;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getPages() {
                    return pages;
                }

                public void setPages(int pages) {
                    this.pages = pages;
                }
            }

            public static class TvDTO {
                private int numResults;
                private int total;
                private int pages;

                public int getNumResults() {
                    return numResults;
                }

                public void setNumResults(int numResults) {
                    this.numResults = numResults;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getPages() {
                    return pages;
                }

                public void setPages(int pages) {
                    this.pages = pages;
                }
            }

            public static class MovieDTO {
                private int numResults;
                private int total;
                private int pages;

                public int getNumResults() {
                    return numResults;
                }

                public void setNumResults(int numResults) {
                    this.numResults = numResults;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getPages() {
                    return pages;
                }

                public void setPages(int pages) {
                    this.pages = pages;
                }
            }

            public static class BiliUserDTO {
                private int numResults;
                private int total;
                private int pages;

                public int getNumResults() {
                    return numResults;
                }

                public void setNumResults(int numResults) {
                    this.numResults = numResults;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getPages() {
                    return pages;
                }

                public void setPages(int pages) {
                    this.pages = pages;
                }
            }

            public static class LiveMasterDTO {
                private int numResults;
                private int total;
                private int pages;

                public int getNumResults() {
                    return numResults;
                }

                public void setNumResults(int numResults) {
                    this.numResults = numResults;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getPages() {
                    return pages;
                }

                public void setPages(int pages) {
                    this.pages = pages;
                }
            }

            public static class LiveAllDTO {
                private int numResults;
                private int total;
                private int pages;

                public int getNumResults() {
                    return numResults;
                }

                public void setNumResults(int numResults) {
                    this.numResults = numResults;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getPages() {
                    return pages;
                }

                public void setPages(int pages) {
                    this.pages = pages;
                }
            }

            public static class TopicDTO {
                private int numResults;
                private int total;
                private int pages;

                public int getNumResults() {
                    return numResults;
                }

                public void setNumResults(int numResults) {
                    this.numResults = numResults;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getPages() {
                    return pages;
                }

                public void setPages(int pages) {
                    this.pages = pages;
                }
            }

            public static class UpuserDTO {
                private int numResults;
                private int total;
                private int pages;

                public int getNumResults() {
                    return numResults;
                }

                public void setNumResults(int numResults) {
                    this.numResults = numResults;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getPages() {
                    return pages;
                }

                public void setPages(int pages) {
                    this.pages = pages;
                }
            }

            public static class LiveDTO {
                private int numResults;
                private int total;
                private int pages;

                public int getNumResults() {
                    return numResults;
                }

                public void setNumResults(int numResults) {
                    this.numResults = numResults;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getPages() {
                    return pages;
                }

                public void setPages(int pages) {
                    this.pages = pages;
                }
            }

            public static class VideoDTO {
                private int numResults;
                private int total;
                private int pages;

                public int getNumResults() {
                    return numResults;
                }

                public void setNumResults(int numResults) {
                    this.numResults = numResults;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getPages() {
                    return pages;
                }

                public void setPages(int pages) {
                    this.pages = pages;
                }
            }

            public static class UserDTO {
                private int numResults;
                private int total;
                private int pages;

                public int getNumResults() {
                    return numResults;
                }

                public void setNumResults(int numResults) {
                    this.numResults = numResults;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getPages() {
                    return pages;
                }

                public void setPages(int pages) {
                    this.pages = pages;
                }
            }

            public static class BangumiDTO {
                private int numResults;
                private int total;
                private int pages;

                public int getNumResults() {
                    return numResults;
                }

                public void setNumResults(int numResults) {
                    this.numResults = numResults;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getPages() {
                    return pages;
                }

                public void setPages(int pages) {
                    this.pages = pages;
                }
            }

            public static class ActivityDTO {
                private int numResults;
                private int total;
                private int pages;

                public int getNumResults() {
                    return numResults;
                }

                public void setNumResults(int numResults) {
                    this.numResults = numResults;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getPages() {
                    return pages;
                }

                public void setPages(int pages) {
                    this.pages = pages;
                }
            }

            public static class MediaFtDTO {
                private int numResults;
                private int total;
                private int pages;

                public int getNumResults() {
                    return numResults;
                }

                public void setNumResults(int numResults) {
                    this.numResults = numResults;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getPages() {
                    return pages;
                }

                public void setPages(int pages) {
                    this.pages = pages;
                }
            }

            public static class ArticleDTO {
                private int numResults;
                private int total;
                private int pages;

                public int getNumResults() {
                    return numResults;
                }

                public void setNumResults(int numResults) {
                    this.numResults = numResults;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getPages() {
                    return pages;
                }

                public void setPages(int pages) {
                    this.pages = pages;
                }
            }

            public static class MediaBangumiDTO {
                private int numResults;
                private int total;
                private int pages;

                public int getNumResults() {
                    return numResults;
                }

                public void setNumResults(int numResults) {
                    this.numResults = numResults;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getPages() {
                    return pages;
                }

                public void setPages(int pages) {
                    this.pages = pages;
                }
            }

            public static class SpecialDTO {
                private int numResults;
                private int total;
                private int pages;

                public int getNumResults() {
                    return numResults;
                }

                public void setNumResults(int numResults) {
                    this.numResults = numResults;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getPages() {
                    return pages;
                }

                public void setPages(int pages) {
                    this.pages = pages;
                }
            }

            public static class LiveUserDTO {
                private int numResults;
                private int total;
                private int pages;

                public int getNumResults() {
                    return numResults;
                }

                public void setNumResults(int numResults) {
                    this.numResults = numResults;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getPages() {
                    return pages;
                }

                public void setPages(int pages) {
                    this.pages = pages;
                }
            }
        }

        public static class TopTlistDTO {
            private int live_room;
            private int pgc;
            private int operation_card;
            private int tv;
            private int movie;
            private int special;
            private int live_master;
            private int bili_user;
            private int topic;
            private int upuser;
            private int live;
            private int video;
            private int user;
            private int bangumi;
            private int activity;
            private int media_ft;
            private int article;
            private int media_bangumi;
            private int card;
            private int live_user;

            public int getLive_room() {
                return live_room;
            }

            public void setLive_room(int live_room) {
                this.live_room = live_room;
            }

            public int getPgc() {
                return pgc;
            }

            public void setPgc(int pgc) {
                this.pgc = pgc;
            }

            public int getOperation_card() {
                return operation_card;
            }

            public void setOperation_card(int operation_card) {
                this.operation_card = operation_card;
            }

            public int getTv() {
                return tv;
            }

            public void setTv(int tv) {
                this.tv = tv;
            }

            public int getMovie() {
                return movie;
            }

            public void setMovie(int movie) {
                this.movie = movie;
            }

            public int getSpecial() {
                return special;
            }

            public void setSpecial(int special) {
                this.special = special;
            }

            public int getLive_master() {
                return live_master;
            }

            public void setLive_master(int live_master) {
                this.live_master = live_master;
            }

            public int getBili_user() {
                return bili_user;
            }

            public void setBili_user(int bili_user) {
                this.bili_user = bili_user;
            }

            public int getTopic() {
                return topic;
            }

            public void setTopic(int topic) {
                this.topic = topic;
            }

            public int getUpuser() {
                return upuser;
            }

            public void setUpuser(int upuser) {
                this.upuser = upuser;
            }

            public int getLive() {
                return live;
            }

            public void setLive(int live) {
                this.live = live;
            }

            public int getVideo() {
                return video;
            }

            public void setVideo(int video) {
                this.video = video;
            }

            public int getUser() {
                return user;
            }

            public void setUser(int user) {
                this.user = user;
            }

            public int getBangumi() {
                return bangumi;
            }

            public void setBangumi(int bangumi) {
                this.bangumi = bangumi;
            }

            public int getActivity() {
                return activity;
            }

            public void setActivity(int activity) {
                this.activity = activity;
            }

            public int getMedia_ft() {
                return media_ft;
            }

            public void setMedia_ft(int media_ft) {
                this.media_ft = media_ft;
            }

            public int getArticle() {
                return article;
            }

            public void setArticle(int article) {
                this.article = article;
            }

            public int getMedia_bangumi() {
                return media_bangumi;
            }

            public void setMedia_bangumi(int media_bangumi) {
                this.media_bangumi = media_bangumi;
            }

            public int getCard() {
                return card;
            }

            public void setCard(int card) {
                this.card = card;
            }

            public int getLive_user() {
                return live_user;
            }

            public void setLive_user(int live_user) {
                this.live_user = live_user;
            }
        }

        public static class AppDisplayOptionDTO {
            private int is_search_page_grayed;

            public int getIs_search_page_grayed() {
                return is_search_page_grayed;
            }

            public void setIs_search_page_grayed(int is_search_page_grayed) {
                this.is_search_page_grayed = is_search_page_grayed;
            }
        }

        public static class ResultDTO {
            private String result_type;
            private List<SearchVideo> data;

            public String getResult_type() {
                return result_type;
            }

            public void setResult_type(String result_type) {
                this.result_type = result_type;
            }

            public List<SearchVideo> getData() {
                return data;
            }

            public void setData(List<SearchVideo> data) {
                this.data = data;
            }
        }
    }
}
