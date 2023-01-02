package com.zrq.player.bean;

import androidx.annotation.Keep;

import java.util.List;

@Keep
public class PlayUrl {

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
        private String from;
        private String result;
        private String message;
        private int quality;
        private String format;
        private int timelength;
        private String accept_format;
        private List<String> accept_description;
        private List<Integer> accept_quality;
        private int video_codecid;
        private String seek_param;
        private String seek_type;
        private List<DurlDTO> durl;
        private List<SupportFormatsDTO> support_formats;
        private Object high_format;
        private int last_play_time;
        private int last_play_cid;

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getQuality() {
            return quality;
        }

        public void setQuality(int quality) {
            this.quality = quality;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public int getTimelength() {
            return timelength;
        }

        public void setTimelength(int timelength) {
            this.timelength = timelength;
        }

        public String getAccept_format() {
            return accept_format;
        }

        public void setAccept_format(String accept_format) {
            this.accept_format = accept_format;
        }

        public List<String> getAccept_description() {
            return accept_description;
        }

        public void setAccept_description(List<String> accept_description) {
            this.accept_description = accept_description;
        }

        public List<Integer> getAccept_quality() {
            return accept_quality;
        }

        public void setAccept_quality(List<Integer> accept_quality) {
            this.accept_quality = accept_quality;
        }

        public int getVideo_codecid() {
            return video_codecid;
        }

        public void setVideo_codecid(int video_codecid) {
            this.video_codecid = video_codecid;
        }

        public String getSeek_param() {
            return seek_param;
        }

        public void setSeek_param(String seek_param) {
            this.seek_param = seek_param;
        }

        public String getSeek_type() {
            return seek_type;
        }

        public void setSeek_type(String seek_type) {
            this.seek_type = seek_type;
        }

        public List<DurlDTO> getDurl() {
            return durl;
        }

        public void setDurl(List<DurlDTO> durl) {
            this.durl = durl;
        }

        public List<SupportFormatsDTO> getSupport_formats() {
            return support_formats;
        }

        public void setSupport_formats(List<SupportFormatsDTO> support_formats) {
            this.support_formats = support_formats;
        }

        public Object getHigh_format() {
            return high_format;
        }

        public void setHigh_format(Object high_format) {
            this.high_format = high_format;
        }

        public int getLast_play_time() {
            return last_play_time;
        }

        public void setLast_play_time(int last_play_time) {
            this.last_play_time = last_play_time;
        }

        public int getLast_play_cid() {
            return last_play_cid;
        }

        public void setLast_play_cid(int last_play_cid) {
            this.last_play_cid = last_play_cid;
        }

        public static class DurlDTO {
            private int order;
            private int length;
            private int size;
            private String ahead;
            private String vhead;
            private String url;
            private List<String> backup_url;

            public int getOrder() {
                return order;
            }

            public void setOrder(int order) {
                this.order = order;
            }

            public int getLength() {
                return length;
            }

            public void setLength(int length) {
                this.length = length;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public String getAhead() {
                return ahead;
            }

            public void setAhead(String ahead) {
                this.ahead = ahead;
            }

            public String getVhead() {
                return vhead;
            }

            public void setVhead(String vhead) {
                this.vhead = vhead;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public List<String> getBackup_url() {
                return backup_url;
            }

            public void setBackup_url(List<String> backup_url) {
                this.backup_url = backup_url;
            }
        }

        public static class SupportFormatsDTO {
            private int quality;
            private String format;
            private String new_description;
            private String display_desc;
            private String superscript;
            private Object codecs;

            public int getQuality() {
                return quality;
            }

            public void setQuality(int quality) {
                this.quality = quality;
            }

            public String getFormat() {
                return format;
            }

            public void setFormat(String format) {
                this.format = format;
            }

            public String getNew_description() {
                return new_description;
            }

            public void setNew_description(String new_description) {
                this.new_description = new_description;
            }

            public String getDisplay_desc() {
                return display_desc;
            }

            public void setDisplay_desc(String display_desc) {
                this.display_desc = display_desc;
            }

            public String getSuperscript() {
                return superscript;
            }

            public void setSuperscript(String superscript) {
                this.superscript = superscript;
            }

            public Object getCodecs() {
                return codecs;
            }

            public void setCodecs(Object codecs) {
                this.codecs = codecs;
            }
        }
    }
}
