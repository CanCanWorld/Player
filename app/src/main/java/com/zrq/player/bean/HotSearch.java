package com.zrq.player.bean;

import androidx.annotation.Keep;

import java.util.List;

@Keep
public class HotSearch {

    private String exp_str;
    private int code;
    private CostBean cost;
    private String seid;
    private int timestamp;
    private String message;
    private List<ListBean> list;

    public String getExp_str() {
        return exp_str;
    }

    public void setExp_str(String exp_str) {
        this.exp_str = exp_str;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public CostBean getCost() {
        return cost;
    }

    public void setCost(CostBean cost) {
        this.cost = cost;
    }

    public String getSeid() {
        return seid;
    }

    public void setSeid(String seid) {
        this.seid = seid;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class CostBean {
        private String params_check;
        private String hotword_request;
        private String hotword_request_format;
        private String hotword_response_format;
        private String deserialize_response;
        private String total;
        private String main_handler;

        public String getParams_check() {
            return params_check;
        }

        public void setParams_check(String params_check) {
            this.params_check = params_check;
        }

        public String getHotword_request() {
            return hotword_request;
        }

        public void setHotword_request(String hotword_request) {
            this.hotword_request = hotword_request;
        }

        public String getHotword_request_format() {
            return hotword_request_format;
        }

        public void setHotword_request_format(String hotword_request_format) {
            this.hotword_request_format = hotword_request_format;
        }

        public String getHotword_response_format() {
            return hotword_response_format;
        }

        public void setHotword_response_format(String hotword_response_format) {
            this.hotword_response_format = hotword_response_format;
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

    public static class ListBean {
        private String status;
        private int call_reason;
        private String heat_layer;
        private int hot_id;
        private String keyword;
        private int resource_id;
        private int goto_type;
        private String show_name;
        private int pos;
        private int word_type;
        private int id;
        private double score;
        private String goto_value;
        private StatDatasBean stat_datas;
        private List<?> live_id;
        private String name_type;
        private String icon;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getCall_reason() {
            return call_reason;
        }

        public void setCall_reason(int call_reason) {
            this.call_reason = call_reason;
        }

        public String getHeat_layer() {
            return heat_layer;
        }

        public void setHeat_layer(String heat_layer) {
            this.heat_layer = heat_layer;
        }

        public int getHot_id() {
            return hot_id;
        }

        public void setHot_id(int hot_id) {
            this.hot_id = hot_id;
        }

        public String getKeyword() {
            return keyword;
        }

        public void setKeyword(String keyword) {
            this.keyword = keyword;
        }

        public int getResource_id() {
            return resource_id;
        }

        public void setResource_id(int resource_id) {
            this.resource_id = resource_id;
        }

        public int getGoto_type() {
            return goto_type;
        }

        public void setGoto_type(int goto_type) {
            this.goto_type = goto_type;
        }

        public String getShow_name() {
            return show_name;
        }

        public void setShow_name(String show_name) {
            this.show_name = show_name;
        }

        public int getPos() {
            return pos;
        }

        public void setPos(int pos) {
            this.pos = pos;
        }

        public int getWord_type() {
            return word_type;
        }

        public void setWord_type(int word_type) {
            this.word_type = word_type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        public String getGoto_value() {
            return goto_value;
        }

        public void setGoto_value(String goto_value) {
            this.goto_value = goto_value;
        }

        public StatDatasBean getStat_datas() {
            return stat_datas;
        }

        public void setStat_datas(StatDatasBean stat_datas) {
            this.stat_datas = stat_datas;
        }

        public List<?> getLive_id() {
            return live_id;
        }

        public void setLive_id(List<?> live_id) {
            this.live_id = live_id;
        }

        public String getName_type() {
            return name_type;
        }

        public void setName_type(String name_type) {
            this.name_type = name_type;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public static class StatDatasBean {
            private String reply_1h;
            private String play_total_rank_1h_div;
            private String share_1h;
            private String score_ori;
            private String play_1h;
            private String insert_reason;
            private String classifier_level;
            private String mtime;
            private String recall_tag;
            private String danmu_1h;
            private String pos_start;
            private String category;
            private String related_resource;
            private String pos_type;
            private String rule_level;
            private String play_total_rank_5m_div;
            private String etime;
            private String source;
            private String score_exp;
            private String likes_1h;
            private String stime;
            private String show_word_pred_max_ctr;
            private String pos_end;
            private String level;
            private String show_count;
            private String show_word_pred_ctr;
            private String play_total_rank_5m;
            private String card_type;
            private String score_new;
            private String live_id;
            private String play_total_rank_1h;
            private String play_total_rank;

            public String getReply_1h() {
                return reply_1h;
            }

            public void setReply_1h(String reply_1h) {
                this.reply_1h = reply_1h;
            }

            public String getPlay_total_rank_1h_div() {
                return play_total_rank_1h_div;
            }

            public void setPlay_total_rank_1h_div(String play_total_rank_1h_div) {
                this.play_total_rank_1h_div = play_total_rank_1h_div;
            }

            public String getShare_1h() {
                return share_1h;
            }

            public void setShare_1h(String share_1h) {
                this.share_1h = share_1h;
            }

            public String getScore_ori() {
                return score_ori;
            }

            public void setScore_ori(String score_ori) {
                this.score_ori = score_ori;
            }

            public String getPlay_1h() {
                return play_1h;
            }

            public void setPlay_1h(String play_1h) {
                this.play_1h = play_1h;
            }

            public String getInsert_reason() {
                return insert_reason;
            }

            public void setInsert_reason(String insert_reason) {
                this.insert_reason = insert_reason;
            }

            public String getClassifier_level() {
                return classifier_level;
            }

            public void setClassifier_level(String classifier_level) {
                this.classifier_level = classifier_level;
            }

            public String getMtime() {
                return mtime;
            }

            public void setMtime(String mtime) {
                this.mtime = mtime;
            }

            public String getRecall_tag() {
                return recall_tag;
            }

            public void setRecall_tag(String recall_tag) {
                this.recall_tag = recall_tag;
            }

            public String getDanmu_1h() {
                return danmu_1h;
            }

            public void setDanmu_1h(String danmu_1h) {
                this.danmu_1h = danmu_1h;
            }

            public String getPos_start() {
                return pos_start;
            }

            public void setPos_start(String pos_start) {
                this.pos_start = pos_start;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getRelated_resource() {
                return related_resource;
            }

            public void setRelated_resource(String related_resource) {
                this.related_resource = related_resource;
            }

            public String getPos_type() {
                return pos_type;
            }

            public void setPos_type(String pos_type) {
                this.pos_type = pos_type;
            }

            public String getRule_level() {
                return rule_level;
            }

            public void setRule_level(String rule_level) {
                this.rule_level = rule_level;
            }

            public String getPlay_total_rank_5m_div() {
                return play_total_rank_5m_div;
            }

            public void setPlay_total_rank_5m_div(String play_total_rank_5m_div) {
                this.play_total_rank_5m_div = play_total_rank_5m_div;
            }

            public String getEtime() {
                return etime;
            }

            public void setEtime(String etime) {
                this.etime = etime;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getScore_exp() {
                return score_exp;
            }

            public void setScore_exp(String score_exp) {
                this.score_exp = score_exp;
            }

            public String getLikes_1h() {
                return likes_1h;
            }

            public void setLikes_1h(String likes_1h) {
                this.likes_1h = likes_1h;
            }

            public String getStime() {
                return stime;
            }

            public void setStime(String stime) {
                this.stime = stime;
            }

            public String getShow_word_pred_max_ctr() {
                return show_word_pred_max_ctr;
            }

            public void setShow_word_pred_max_ctr(String show_word_pred_max_ctr) {
                this.show_word_pred_max_ctr = show_word_pred_max_ctr;
            }

            public String getPos_end() {
                return pos_end;
            }

            public void setPos_end(String pos_end) {
                this.pos_end = pos_end;
            }

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getShow_count() {
                return show_count;
            }

            public void setShow_count(String show_count) {
                this.show_count = show_count;
            }

            public String getShow_word_pred_ctr() {
                return show_word_pred_ctr;
            }

            public void setShow_word_pred_ctr(String show_word_pred_ctr) {
                this.show_word_pred_ctr = show_word_pred_ctr;
            }

            public String getPlay_total_rank_5m() {
                return play_total_rank_5m;
            }

            public void setPlay_total_rank_5m(String play_total_rank_5m) {
                this.play_total_rank_5m = play_total_rank_5m;
            }

            public String getCard_type() {
                return card_type;
            }

            public void setCard_type(String card_type) {
                this.card_type = card_type;
            }

            public String getScore_new() {
                return score_new;
            }

            public void setScore_new(String score_new) {
                this.score_new = score_new;
            }

            public String getLive_id() {
                return live_id;
            }

            public void setLive_id(String live_id) {
                this.live_id = live_id;
            }

            public String getPlay_total_rank_1h() {
                return play_total_rank_1h;
            }

            public void setPlay_total_rank_1h(String play_total_rank_1h) {
                this.play_total_rank_1h = play_total_rank_1h;
            }

            public String getPlay_total_rank() {
                return play_total_rank;
            }

            public void setPlay_total_rank(String play_total_rank) {
                this.play_total_rank = play_total_rank;
            }
        }
    }
}
