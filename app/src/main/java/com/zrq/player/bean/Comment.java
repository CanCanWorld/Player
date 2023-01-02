package com.zrq.player.bean;

import androidx.annotation.Keep;

import java.util.List;

@Keep
public class Comment {

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
        private ConfigBean config;
        private List<RepliesBean> replies;
        private UpperBean upper;
        private Object top;
        private int vote;
        private int blacklist;
        private int assist;
        private int mode;
        private List<Integer> support_mode;
        private ControlBean control;
        private FolderBean folder;

        public PageBean getPage() {
            return page;
        }

        public void setPage(PageBean page) {
            this.page = page;
        }

        public ConfigBean getConfig() {
            return config;
        }

        public void setConfig(ConfigBean config) {
            this.config = config;
        }

        public List<RepliesBean> getReplies() {
            return replies;
        }

        public void setReplies(List<RepliesBean> replies) {
            this.replies = replies;
        }

        public UpperBean getUpper() {
            return upper;
        }

        public void setUpper(UpperBean upper) {
            this.upper = upper;
        }

        public Object getTop() {
            return top;
        }

        public void setTop(Object top) {
            this.top = top;
        }

        public int getVote() {
            return vote;
        }

        public void setVote(int vote) {
            this.vote = vote;
        }

        public int getBlacklist() {
            return blacklist;
        }

        public void setBlacklist(int blacklist) {
            this.blacklist = blacklist;
        }

        public int getAssist() {
            return assist;
        }

        public void setAssist(int assist) {
            this.assist = assist;
        }

        public int getMode() {
            return mode;
        }

        public void setMode(int mode) {
            this.mode = mode;
        }

        public List<Integer> getSupport_mode() {
            return support_mode;
        }

        public void setSupport_mode(List<Integer> support_mode) {
            this.support_mode = support_mode;
        }

        public ControlBean getControl() {
            return control;
        }

        public void setControl(ControlBean control) {
            this.control = control;
        }

        public FolderBean getFolder() {
            return folder;
        }

        public void setFolder(FolderBean folder) {
            this.folder = folder;
        }

        public static class PageBean {
            private int num;
            private int size;
            private int count;
            private int acount;

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

            public int getAcount() {
                return acount;
            }

            public void setAcount(int acount) {
                this.acount = acount;
            }
        }

        public static class ConfigBean {
            private int showtopic;
            private boolean show_up_flag;
            private boolean read_only;

            public int getShowtopic() {
                return showtopic;
            }

            public void setShowtopic(int showtopic) {
                this.showtopic = showtopic;
            }

            public boolean isShow_up_flag() {
                return show_up_flag;
            }

            public void setShow_up_flag(boolean show_up_flag) {
                this.show_up_flag = show_up_flag;
            }

            public boolean isRead_only() {
                return read_only;
            }

            public void setRead_only(boolean read_only) {
                this.read_only = read_only;
            }
        }

        public static class UpperBean {
            private long mid;
            private Object top;
            private Object vote;

            public long getMid() {
                return mid;
            }

            public void setMid(long mid) {
                this.mid = mid;
            }

            public Object getTop() {
                return top;
            }

            public void setTop(Object top) {
                this.top = top;
            }

            public Object getVote() {
                return vote;
            }

            public void setVote(Object vote) {
                this.vote = vote;
            }
        }

        public static class ControlBean {
            private boolean input_disable;
            private String root_input_text;
            private String child_input_text;
            private String giveup_input_text;
            private int screenshot_icon_state;
            private int upload_picture_icon_state;
            private String answer_guide_text;
            private String answer_guide_icon_url;
            private String answer_guide_ios_url;
            private String answer_guide_android_url;
            private String bg_text;
            private int show_type;
            private String show_text;
            private boolean web_selection;
            private boolean disable_jump_emote;

            public boolean isInput_disable() {
                return input_disable;
            }

            public void setInput_disable(boolean input_disable) {
                this.input_disable = input_disable;
            }

            public String getRoot_input_text() {
                return root_input_text;
            }

            public void setRoot_input_text(String root_input_text) {
                this.root_input_text = root_input_text;
            }

            public String getChild_input_text() {
                return child_input_text;
            }

            public void setChild_input_text(String child_input_text) {
                this.child_input_text = child_input_text;
            }

            public String getGiveup_input_text() {
                return giveup_input_text;
            }

            public void setGiveup_input_text(String giveup_input_text) {
                this.giveup_input_text = giveup_input_text;
            }

            public int getScreenshot_icon_state() {
                return screenshot_icon_state;
            }

            public void setScreenshot_icon_state(int screenshot_icon_state) {
                this.screenshot_icon_state = screenshot_icon_state;
            }

            public int getUpload_picture_icon_state() {
                return upload_picture_icon_state;
            }

            public void setUpload_picture_icon_state(int upload_picture_icon_state) {
                this.upload_picture_icon_state = upload_picture_icon_state;
            }

            public String getAnswer_guide_text() {
                return answer_guide_text;
            }

            public void setAnswer_guide_text(String answer_guide_text) {
                this.answer_guide_text = answer_guide_text;
            }

            public String getAnswer_guide_icon_url() {
                return answer_guide_icon_url;
            }

            public void setAnswer_guide_icon_url(String answer_guide_icon_url) {
                this.answer_guide_icon_url = answer_guide_icon_url;
            }

            public String getAnswer_guide_ios_url() {
                return answer_guide_ios_url;
            }

            public void setAnswer_guide_ios_url(String answer_guide_ios_url) {
                this.answer_guide_ios_url = answer_guide_ios_url;
            }

            public String getAnswer_guide_android_url() {
                return answer_guide_android_url;
            }

            public void setAnswer_guide_android_url(String answer_guide_android_url) {
                this.answer_guide_android_url = answer_guide_android_url;
            }

            public String getBg_text() {
                return bg_text;
            }

            public void setBg_text(String bg_text) {
                this.bg_text = bg_text;
            }

            public int getShow_type() {
                return show_type;
            }

            public void setShow_type(int show_type) {
                this.show_type = show_type;
            }

            public String getShow_text() {
                return show_text;
            }

            public void setShow_text(String show_text) {
                this.show_text = show_text;
            }

            public boolean isWeb_selection() {
                return web_selection;
            }

            public void setWeb_selection(boolean web_selection) {
                this.web_selection = web_selection;
            }

            public boolean isDisable_jump_emote() {
                return disable_jump_emote;
            }

            public void setDisable_jump_emote(boolean disable_jump_emote) {
                this.disable_jump_emote = disable_jump_emote;
            }
        }

        public static class FolderBean {
            private boolean has_folded;
            private boolean is_folded;
            private String rule;

            public boolean isHas_folded() {
                return has_folded;
            }

            public void setHas_folded(boolean has_folded) {
                this.has_folded = has_folded;
            }

            public boolean isIs_folded() {
                return is_folded;
            }

            public void setIs_folded(boolean is_folded) {
                this.is_folded = is_folded;
            }

            public String getRule() {
                return rule;
            }

            public void setRule(String rule) {
                this.rule = rule;
            }
        }

        public static class RepliesBean {
            private long rpid;
            private int oid;
            private int type;
            private long mid;
            private int root;
            private int parent;
            private int dialog;
            private int count;
            private int rcount;
            private int state;
            private int fansgrade;
            private int attr;
            private int ctime;
            private String rpid_str;
            private String root_str;
            private String parent_str;
            private int like;
            private int action;
            private MemberBean member;
            private ContentBean content;
            private Object replies;
            private int assist;
            private UpActionBean up_action;
            private boolean invisible;
            private List<CardLabelBean> card_label;
            private ReplyControlBean reply_control;
            private FolderBean folder;
            private String dynamic_id_str;

            public long getRpid() {
                return rpid;
            }

            public void setRpid(long rpid) {
                this.rpid = rpid;
            }

            public int getOid() {
                return oid;
            }

            public void setOid(int oid) {
                this.oid = oid;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public long getMid() {
                return mid;
            }

            public void setMid(long mid) {
                this.mid = mid;
            }

            public int getRoot() {
                return root;
            }

            public void setRoot(int root) {
                this.root = root;
            }

            public int getParent() {
                return parent;
            }

            public void setParent(int parent) {
                this.parent = parent;
            }

            public int getDialog() {
                return dialog;
            }

            public void setDialog(int dialog) {
                this.dialog = dialog;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public int getRcount() {
                return rcount;
            }

            public void setRcount(int rcount) {
                this.rcount = rcount;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }

            public int getFansgrade() {
                return fansgrade;
            }

            public void setFansgrade(int fansgrade) {
                this.fansgrade = fansgrade;
            }

            public int getAttr() {
                return attr;
            }

            public void setAttr(int attr) {
                this.attr = attr;
            }

            public int getCtime() {
                return ctime;
            }

            public void setCtime(int ctime) {
                this.ctime = ctime;
            }

            public String getRpid_str() {
                return rpid_str;
            }

            public void setRpid_str(String rpid_str) {
                this.rpid_str = rpid_str;
            }

            public String getRoot_str() {
                return root_str;
            }

            public void setRoot_str(String root_str) {
                this.root_str = root_str;
            }

            public String getParent_str() {
                return parent_str;
            }

            public void setParent_str(String parent_str) {
                this.parent_str = parent_str;
            }

            public int getLike() {
                return like;
            }

            public void setLike(int like) {
                this.like = like;
            }

            public int getAction() {
                return action;
            }

            public void setAction(int action) {
                this.action = action;
            }

            public MemberBean getMember() {
                return member;
            }

            public void setMember(MemberBean member) {
                this.member = member;
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

            public int getAssist() {
                return assist;
            }

            public void setAssist(int assist) {
                this.assist = assist;
            }

            public UpActionBean getUp_action() {
                return up_action;
            }

            public void setUp_action(UpActionBean up_action) {
                this.up_action = up_action;
            }

            public boolean isInvisible() {
                return invisible;
            }

            public void setInvisible(boolean invisible) {
                this.invisible = invisible;
            }

            public List<CardLabelBean> getCard_label() {
                return card_label;
            }

            public void setCard_label(List<CardLabelBean> card_label) {
                this.card_label = card_label;
            }

            public ReplyControlBean getReply_control() {
                return reply_control;
            }

            public void setReply_control(ReplyControlBean reply_control) {
                this.reply_control = reply_control;
            }

            public FolderBean getFolder() {
                return folder;
            }

            public void setFolder(FolderBean folder) {
                this.folder = folder;
            }

            public String getDynamic_id_str() {
                return dynamic_id_str;
            }

            public void setDynamic_id_str(String dynamic_id_str) {
                this.dynamic_id_str = dynamic_id_str;
            }

            public static class MemberBean {
                private String mid;
                private String uname;
                private String sex;
                private String sign;
                private String avatar;
                private String rank;
                private int face_nft_new;
                private int is_senior_member;
                private LevelInfoBean level_info;
                private PendantBean pendant;
                private NameplateBean nameplate;
                private OfficialVerifyBean official_verify;
                private VipBean vip;
                private Object fans_detail;
                private UserSailingBean user_sailing;
                private boolean is_contractor;
                private String contract_desc;
                private Object nft_interaction;
                private AvatarItemBean avatar_item;

                public String getMid() {
                    return mid;
                }

                public void setMid(String mid) {
                    this.mid = mid;
                }

                public String getUname() {
                    return uname;
                }

                public void setUname(String uname) {
                    this.uname = uname;
                }

                public String getSex() {
                    return sex;
                }

                public void setSex(String sex) {
                    this.sex = sex;
                }

                public String getSign() {
                    return sign;
                }

                public void setSign(String sign) {
                    this.sign = sign;
                }

                public String getAvatar() {
                    return avatar;
                }

                public void setAvatar(String avatar) {
                    this.avatar = avatar;
                }

                public String getRank() {
                    return rank;
                }

                public void setRank(String rank) {
                    this.rank = rank;
                }

                public int getFace_nft_new() {
                    return face_nft_new;
                }

                public void setFace_nft_new(int face_nft_new) {
                    this.face_nft_new = face_nft_new;
                }

                public int getIs_senior_member() {
                    return is_senior_member;
                }

                public void setIs_senior_member(int is_senior_member) {
                    this.is_senior_member = is_senior_member;
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

                public Object getFans_detail() {
                    return fans_detail;
                }

                public void setFans_detail(Object fans_detail) {
                    this.fans_detail = fans_detail;
                }

                public UserSailingBean getUser_sailing() {
                    return user_sailing;
                }

                public void setUser_sailing(UserSailingBean user_sailing) {
                    this.user_sailing = user_sailing;
                }

                public boolean isIs_contractor() {
                    return is_contractor;
                }

                public void setIs_contractor(boolean is_contractor) {
                    this.is_contractor = is_contractor;
                }

                public String getContract_desc() {
                    return contract_desc;
                }

                public void setContract_desc(String contract_desc) {
                    this.contract_desc = contract_desc;
                }

                public Object getNft_interaction() {
                    return nft_interaction;
                }

                public void setNft_interaction(Object nft_interaction) {
                    this.nft_interaction = nft_interaction;
                }

                public AvatarItemBean getAvatar_item() {
                    return avatar_item;
                }

                public void setAvatar_item(AvatarItemBean avatar_item) {
                    this.avatar_item = avatar_item;
                }

                public static class LevelInfoBean {
                    private int current_level;
                    private int current_min;
                    private int current_exp;
                    private int next_exp;

                    public int getCurrent_level() {
                        return current_level;
                    }

                    public void setCurrent_level(int current_level) {
                        this.current_level = current_level;
                    }

                    public int getCurrent_min() {
                        return current_min;
                    }

                    public void setCurrent_min(int current_min) {
                        this.current_min = current_min;
                    }

                    public int getCurrent_exp() {
                        return current_exp;
                    }

                    public void setCurrent_exp(int current_exp) {
                        this.current_exp = current_exp;
                    }

                    public int getNext_exp() {
                        return next_exp;
                    }

                    public void setNext_exp(int next_exp) {
                        this.next_exp = next_exp;
                    }
                }

                public static class PendantBean {
                    private int pid;
                    private String name;
                    private String image;
                    private int expire;
                    private String image_enhance;
                    private String image_enhance_frame;

                    public int getPid() {
                        return pid;
                    }

                    public void setPid(int pid) {
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

                    public int getExpire() {
                        return expire;
                    }

                    public void setExpire(int expire) {
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
                    private int nid;
                    private String name;
                    private String image;
                    private String image_small;
                    private String level;
                    private String condition;

                    public int getNid() {
                        return nid;
                    }

                    public void setNid(int nid) {
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

                public static class OfficialVerifyBean {
                    private int type;
                    private String desc;

                    public int getType() {
                        return type;
                    }

                    public void setType(int type) {
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
                    private int vipType;
                    private long vipDueDate;
                    private String dueRemark;
                    private int accessStatus;
                    private int vipStatus;
                    private String vipStatusWarn;
                    private int themeType;
                    private LabelBean label;
                    private int avatar_subscript;
                    private String nickname_color;

                    public int getVipType() {
                        return vipType;
                    }

                    public void setVipType(int vipType) {
                        this.vipType = vipType;
                    }

                    public long getVipDueDate() {
                        return vipDueDate;
                    }

                    public void setVipDueDate(long vipDueDate) {
                        this.vipDueDate = vipDueDate;
                    }

                    public String getDueRemark() {
                        return dueRemark;
                    }

                    public void setDueRemark(String dueRemark) {
                        this.dueRemark = dueRemark;
                    }

                    public int getAccessStatus() {
                        return accessStatus;
                    }

                    public void setAccessStatus(int accessStatus) {
                        this.accessStatus = accessStatus;
                    }

                    public int getVipStatus() {
                        return vipStatus;
                    }

                    public void setVipStatus(int vipStatus) {
                        this.vipStatus = vipStatus;
                    }

                    public String getVipStatusWarn() {
                        return vipStatusWarn;
                    }

                    public void setVipStatusWarn(String vipStatusWarn) {
                        this.vipStatusWarn = vipStatusWarn;
                    }

                    public int getThemeType() {
                        return themeType;
                    }

                    public void setThemeType(int themeType) {
                        this.themeType = themeType;
                    }

                    public LabelBean getLabel() {
                        return label;
                    }

                    public void setLabel(LabelBean label) {
                        this.label = label;
                    }

                    public int getAvatar_subscript() {
                        return avatar_subscript;
                    }

                    public void setAvatar_subscript(int avatar_subscript) {
                        this.avatar_subscript = avatar_subscript;
                    }

                    public String getNickname_color() {
                        return nickname_color;
                    }

                    public void setNickname_color(String nickname_color) {
                        this.nickname_color = nickname_color;
                    }

                    public static class LabelBean {
                        private String path;
                        private String text;
                        private String label_theme;
                        private String text_color;
                        private int bg_style;
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

                        public int getBg_style() {
                            return bg_style;
                        }

                        public void setBg_style(int bg_style) {
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

                public static class UserSailingBean {
                    private Object pendant;
                    private Object cardbg;
                    private Object cardbg_with_focus;

                    public Object getPendant() {
                        return pendant;
                    }

                    public void setPendant(Object pendant) {
                        this.pendant = pendant;
                    }

                    public Object getCardbg() {
                        return cardbg;
                    }

                    public void setCardbg(Object cardbg) {
                        this.cardbg = cardbg;
                    }

                    public Object getCardbg_with_focus() {
                        return cardbg_with_focus;
                    }

                    public void setCardbg_with_focus(Object cardbg_with_focus) {
                        this.cardbg_with_focus = cardbg_with_focus;
                    }
                }

                public static class AvatarItemBean {
                    private ContainerSizeBean container_size;
                    private FallbackLayersBean fallback_layers;
                    private String mid;

                    public ContainerSizeBean getContainer_size() {
                        return container_size;
                    }

                    public void setContainer_size(ContainerSizeBean container_size) {
                        this.container_size = container_size;
                    }

                    public FallbackLayersBean getFallback_layers() {
                        return fallback_layers;
                    }

                    public void setFallback_layers(FallbackLayersBean fallback_layers) {
                        this.fallback_layers = fallback_layers;
                    }

                    public String getMid() {
                        return mid;
                    }

                    public void setMid(String mid) {
                        this.mid = mid;
                    }

                    public static class ContainerSizeBean {
                        private double width;
                        private double height;

                        public double getWidth() {
                            return width;
                        }

                        public void setWidth(double width) {
                            this.width = width;
                        }

                        public double getHeight() {
                            return height;
                        }

                        public void setHeight(double height) {
                            this.height = height;
                        }
                    }

                    public static class FallbackLayersBean {
                        private List<LayersBean> layers;
                        private boolean is_critical_group;

                        public List<LayersBean> getLayers() {
                            return layers;
                        }

                        public void setLayers(List<LayersBean> layers) {
                            this.layers = layers;
                        }

                        public boolean isIs_critical_group() {
                            return is_critical_group;
                        }

                        public void setIs_critical_group(boolean is_critical_group) {
                            this.is_critical_group = is_critical_group;
                        }

                        public static class LayersBean {
                            private boolean visible;
                            private GeneralSpecBean general_spec;
                            private LayerConfigBean layer_config;
                            private ResourceBean resource;

                            public boolean isVisible() {
                                return visible;
                            }

                            public void setVisible(boolean visible) {
                                this.visible = visible;
                            }

                            public GeneralSpecBean getGeneral_spec() {
                                return general_spec;
                            }

                            public void setGeneral_spec(GeneralSpecBean general_spec) {
                                this.general_spec = general_spec;
                            }

                            public LayerConfigBean getLayer_config() {
                                return layer_config;
                            }

                            public void setLayer_config(LayerConfigBean layer_config) {
                                this.layer_config = layer_config;
                            }

                            public ResourceBean getResource() {
                                return resource;
                            }

                            public void setResource(ResourceBean resource) {
                                this.resource = resource;
                            }

                            public static class GeneralSpecBean {
                                private PosSpecBean pos_spec;
                                private SizeSpecBean size_spec;
                                private RenderSpecBean render_spec;

                                public PosSpecBean getPos_spec() {
                                    return pos_spec;
                                }

                                public void setPos_spec(PosSpecBean pos_spec) {
                                    this.pos_spec = pos_spec;
                                }

                                public SizeSpecBean getSize_spec() {
                                    return size_spec;
                                }

                                public void setSize_spec(SizeSpecBean size_spec) {
                                    this.size_spec = size_spec;
                                }

                                public RenderSpecBean getRender_spec() {
                                    return render_spec;
                                }

                                public void setRender_spec(RenderSpecBean render_spec) {
                                    this.render_spec = render_spec;
                                }

                                public static class PosSpecBean {
                                    private int coordinate_pos;
                                    private double axis_x;
                                    private double axis_y;

                                    public int getCoordinate_pos() {
                                        return coordinate_pos;
                                    }

                                    public void setCoordinate_pos(int coordinate_pos) {
                                        this.coordinate_pos = coordinate_pos;
                                    }

                                    public double getAxis_x() {
                                        return axis_x;
                                    }

                                    public void setAxis_x(double axis_x) {
                                        this.axis_x = axis_x;
                                    }

                                    public double getAxis_y() {
                                        return axis_y;
                                    }

                                    public void setAxis_y(double axis_y) {
                                        this.axis_y = axis_y;
                                    }
                                }

                                public static class SizeSpecBean {
                                    private double width;
                                    private double height;

                                    public double getWidth() {
                                        return width;
                                    }

                                    public void setWidth(double width) {
                                        this.width = width;
                                    }

                                    public double getHeight() {
                                        return height;
                                    }

                                    public void setHeight(double height) {
                                        this.height = height;
                                    }
                                }

                                public static class RenderSpecBean {
                                    private int opacity;

                                    public int getOpacity() {
                                        return opacity;
                                    }

                                    public void setOpacity(int opacity) {
                                        this.opacity = opacity;
                                    }
                                }
                            }

                            public static class LayerConfigBean {
                                private TagsBean tags;
                                private boolean is_critical;
                                private LayerMaskBean layer_mask;

                                public TagsBean getTags() {
                                    return tags;
                                }

                                public void setTags(TagsBean tags) {
                                    this.tags = tags;
                                }

                                public boolean isIs_critical() {
                                    return is_critical;
                                }

                                public void setIs_critical(boolean is_critical) {
                                    this.is_critical = is_critical;
                                }

                                public LayerMaskBean getLayer_mask() {
                                    return layer_mask;
                                }

                                public void setLayer_mask(LayerMaskBean layer_mask) {
                                    this.layer_mask = layer_mask;
                                }

                                public static class TagsBean {
                                    @com.google.gson.annotations.SerializedName("AVATAR_LAYER")
                                    private DataBean.RepliesBean.MemberBean.AvatarItemBean.FallbackLayersBean.LayersBean.LayerConfigBean.TagsBean.AVATARLAYERBean aVATAR_LAYER;

                                    public AVATARLAYERBean getAVATAR_LAYER() {
                                        return aVATAR_LAYER;
                                    }

                                    public void setAVATAR_LAYER(AVATARLAYERBean aVATAR_LAYER) {
                                        this.aVATAR_LAYER = aVATAR_LAYER;
                                    }

                                    public static class AVATARLAYERBean {
                                    }
                                }

                                public static class LayerMaskBean {
                                    private GeneralSpecBean general_spec;
                                    private MaskSrcBean mask_src;

                                    public GeneralSpecBean getGeneral_spec() {
                                        return general_spec;
                                    }

                                    public void setGeneral_spec(GeneralSpecBean general_spec) {
                                        this.general_spec = general_spec;
                                    }

                                    public MaskSrcBean getMask_src() {
                                        return mask_src;
                                    }

                                    public void setMask_src(MaskSrcBean mask_src) {
                                        this.mask_src = mask_src;
                                    }

                                    public static class GeneralSpecBean {
                                        private PosSpecBean pos_spec;
                                        private SizeSpecBean size_spec;
                                        private RenderSpecBean render_spec;

                                        public PosSpecBean getPos_spec() {
                                            return pos_spec;
                                        }

                                        public void setPos_spec(PosSpecBean pos_spec) {
                                            this.pos_spec = pos_spec;
                                        }

                                        public SizeSpecBean getSize_spec() {
                                            return size_spec;
                                        }

                                        public void setSize_spec(SizeSpecBean size_spec) {
                                            this.size_spec = size_spec;
                                        }

                                        public RenderSpecBean getRender_spec() {
                                            return render_spec;
                                        }

                                        public void setRender_spec(RenderSpecBean render_spec) {
                                            this.render_spec = render_spec;
                                        }

                                        public static class PosSpecBean {
                                            private int coordinate_pos;
                                            private double axis_x;
                                            private double axis_y;

                                            public int getCoordinate_pos() {
                                                return coordinate_pos;
                                            }

                                            public void setCoordinate_pos(int coordinate_pos) {
                                                this.coordinate_pos = coordinate_pos;
                                            }

                                            public double getAxis_x() {
                                                return axis_x;
                                            }

                                            public void setAxis_x(double axis_x) {
                                                this.axis_x = axis_x;
                                            }

                                            public double getAxis_y() {
                                                return axis_y;
                                            }

                                            public void setAxis_y(double axis_y) {
                                                this.axis_y = axis_y;
                                            }
                                        }

                                        public static class SizeSpecBean {
                                            private double width;
                                            private double height;

                                            public double getWidth() {
                                                return width;
                                            }

                                            public void setWidth(double width) {
                                                this.width = width;
                                            }

                                            public double getHeight() {
                                                return height;
                                            }

                                            public void setHeight(double height) {
                                                this.height = height;
                                            }
                                        }

                                        public static class RenderSpecBean {
                                            private int opacity;

                                            public int getOpacity() {
                                                return opacity;
                                            }

                                            public void setOpacity(int opacity) {
                                                this.opacity = opacity;
                                            }
                                        }
                                    }

                                    public static class MaskSrcBean {
                                        private int src_type;
                                        private DrawBean draw;

                                        public int getSrc_type() {
                                            return src_type;
                                        }

                                        public void setSrc_type(int src_type) {
                                            this.src_type = src_type;
                                        }

                                        public DrawBean getDraw() {
                                            return draw;
                                        }

                                        public void setDraw(DrawBean draw) {
                                            this.draw = draw;
                                        }

                                        public static class DrawBean {
                                            private int draw_type;
                                            private int fill_mode;
                                            private ColorConfigBean color_config;

                                            public int getDraw_type() {
                                                return draw_type;
                                            }

                                            public void setDraw_type(int draw_type) {
                                                this.draw_type = draw_type;
                                            }

                                            public int getFill_mode() {
                                                return fill_mode;
                                            }

                                            public void setFill_mode(int fill_mode) {
                                                this.fill_mode = fill_mode;
                                            }

                                            public ColorConfigBean getColor_config() {
                                                return color_config;
                                            }

                                            public void setColor_config(ColorConfigBean color_config) {
                                                this.color_config = color_config;
                                            }

                                            public static class ColorConfigBean {
                                                private DayBean day;

                                                public DayBean getDay() {
                                                    return day;
                                                }

                                                public void setDay(DayBean day) {
                                                    this.day = day;
                                                }

                                                public static class DayBean {
                                                    private String argb;

                                                    public String getArgb() {
                                                        return argb;
                                                    }

                                                    public void setArgb(String argb) {
                                                        this.argb = argb;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            public static class ResourceBean {
                                private int res_type;
                                private ResImageBean res_image;

                                public int getRes_type() {
                                    return res_type;
                                }

                                public void setRes_type(int res_type) {
                                    this.res_type = res_type;
                                }

                                public ResImageBean getRes_image() {
                                    return res_image;
                                }

                                public void setRes_image(ResImageBean res_image) {
                                    this.res_image = res_image;
                                }

                                public static class ResImageBean {
                                    private ImageSrcBean image_src;

                                    public ImageSrcBean getImage_src() {
                                        return image_src;
                                    }

                                    public void setImage_src(ImageSrcBean image_src) {
                                        this.image_src = image_src;
                                    }

                                    public static class ImageSrcBean {
                                        private int src_type;
                                        private int placeholder;
                                        private RemoteBean remote;

                                        public int getSrc_type() {
                                            return src_type;
                                        }

                                        public void setSrc_type(int src_type) {
                                            this.src_type = src_type;
                                        }

                                        public int getPlaceholder() {
                                            return placeholder;
                                        }

                                        public void setPlaceholder(int placeholder) {
                                            this.placeholder = placeholder;
                                        }

                                        public RemoteBean getRemote() {
                                            return remote;
                                        }

                                        public void setRemote(RemoteBean remote) {
                                            this.remote = remote;
                                        }

                                        public static class RemoteBean {
                                            private String url;
                                            private String bfs_style;

                                            public String getUrl() {
                                                return url;
                                            }

                                            public void setUrl(String url) {
                                                this.url = url;
                                            }

                                            public String getBfs_style() {
                                                return bfs_style;
                                            }

                                            public void setBfs_style(String bfs_style) {
                                                this.bfs_style = bfs_style;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            public static class ContentBean {
                private String message;
                private AtNameToMidBean at_name_to_mid;
                private List<MembersBean> members;
                private JumpUrlBean jump_url;
                private int max_line;

                public String getMessage() {
                    return message;
                }

                public void setMessage(String message) {
                    this.message = message;
                }

                public AtNameToMidBean getAt_name_to_mid() {
                    return at_name_to_mid;
                }

                public void setAt_name_to_mid(AtNameToMidBean at_name_to_mid) {
                    this.at_name_to_mid = at_name_to_mid;
                }

                public List<MembersBean> getMembers() {
                    return members;
                }

                public void setMembers(List<MembersBean> members) {
                    this.members = members;
                }

                public JumpUrlBean getJump_url() {
                    return jump_url;
                }

                public void setJump_url(JumpUrlBean jump_url) {
                    this.jump_url = jump_url;
                }

                public int getMax_line() {
                    return max_line;
                }

                public void setMax_line(int max_line) {
                    this.max_line = max_line;
                }

                public static class AtNameToMidBean {
                    private int 是位社恐;

                    public int get是位社恐() {
                        return 是位社恐;
                    }

                    public void set是位社恐(int 是位社恐) {
                        this.是位社恐 = 是位社恐;
                    }
                }

                public static class JumpUrlBean {
                }

                public static class MembersBean {
                    private String mid;
                    private String uname;
                    private String sex;
                    private String sign;
                    private String avatar;
                    private String rank;
                    private int face_nft_new;
                    private int is_senior_member;
                    private LevelInfoBean level_info;
                    private PendantBean pendant;
                    private NameplateBean nameplate;
                    private OfficialVerifyBean official_verify;
                    private VipBean vip;

                    public String getMid() {
                        return mid;
                    }

                    public void setMid(String mid) {
                        this.mid = mid;
                    }

                    public String getUname() {
                        return uname;
                    }

                    public void setUname(String uname) {
                        this.uname = uname;
                    }

                    public String getSex() {
                        return sex;
                    }

                    public void setSex(String sex) {
                        this.sex = sex;
                    }

                    public String getSign() {
                        return sign;
                    }

                    public void setSign(String sign) {
                        this.sign = sign;
                    }

                    public String getAvatar() {
                        return avatar;
                    }

                    public void setAvatar(String avatar) {
                        this.avatar = avatar;
                    }

                    public String getRank() {
                        return rank;
                    }

                    public void setRank(String rank) {
                        this.rank = rank;
                    }

                    public int getFace_nft_new() {
                        return face_nft_new;
                    }

                    public void setFace_nft_new(int face_nft_new) {
                        this.face_nft_new = face_nft_new;
                    }

                    public int getIs_senior_member() {
                        return is_senior_member;
                    }

                    public void setIs_senior_member(int is_senior_member) {
                        this.is_senior_member = is_senior_member;
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

                    public static class LevelInfoBean {
                        private int current_level;
                        private int current_min;
                        private int current_exp;
                        private int next_exp;

                        public int getCurrent_level() {
                            return current_level;
                        }

                        public void setCurrent_level(int current_level) {
                            this.current_level = current_level;
                        }

                        public int getCurrent_min() {
                            return current_min;
                        }

                        public void setCurrent_min(int current_min) {
                            this.current_min = current_min;
                        }

                        public int getCurrent_exp() {
                            return current_exp;
                        }

                        public void setCurrent_exp(int current_exp) {
                            this.current_exp = current_exp;
                        }

                        public int getNext_exp() {
                            return next_exp;
                        }

                        public void setNext_exp(int next_exp) {
                            this.next_exp = next_exp;
                        }
                    }

                    public static class PendantBean {
                        private int pid;
                        private String name;
                        private String image;
                        private int expire;
                        private String image_enhance;
                        private String image_enhance_frame;

                        public int getPid() {
                            return pid;
                        }

                        public void setPid(int pid) {
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

                        public int getExpire() {
                            return expire;
                        }

                        public void setExpire(int expire) {
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
                        private int nid;
                        private String name;
                        private String image;
                        private String image_small;
                        private String level;
                        private String condition;

                        public int getNid() {
                            return nid;
                        }

                        public void setNid(int nid) {
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

                    public static class OfficialVerifyBean {
                        private int type;
                        private String desc;

                        public int getType() {
                            return type;
                        }

                        public void setType(int type) {
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
                        private int vipType;
                        private long vipDueDate;
                        private String dueRemark;
                        private int accessStatus;
                        private int vipStatus;
                        private String vipStatusWarn;
                        private int themeType;
                        private LabelBean label;
                        private int avatar_subscript;
                        private String nickname_color;

                        public int getVipType() {
                            return vipType;
                        }

                        public void setVipType(int vipType) {
                            this.vipType = vipType;
                        }

                        public long getVipDueDate() {
                            return vipDueDate;
                        }

                        public void setVipDueDate(long vipDueDate) {
                            this.vipDueDate = vipDueDate;
                        }

                        public String getDueRemark() {
                            return dueRemark;
                        }

                        public void setDueRemark(String dueRemark) {
                            this.dueRemark = dueRemark;
                        }

                        public int getAccessStatus() {
                            return accessStatus;
                        }

                        public void setAccessStatus(int accessStatus) {
                            this.accessStatus = accessStatus;
                        }

                        public int getVipStatus() {
                            return vipStatus;
                        }

                        public void setVipStatus(int vipStatus) {
                            this.vipStatus = vipStatus;
                        }

                        public String getVipStatusWarn() {
                            return vipStatusWarn;
                        }

                        public void setVipStatusWarn(String vipStatusWarn) {
                            this.vipStatusWarn = vipStatusWarn;
                        }

                        public int getThemeType() {
                            return themeType;
                        }

                        public void setThemeType(int themeType) {
                            this.themeType = themeType;
                        }

                        public LabelBean getLabel() {
                            return label;
                        }

                        public void setLabel(LabelBean label) {
                            this.label = label;
                        }

                        public int getAvatar_subscript() {
                            return avatar_subscript;
                        }

                        public void setAvatar_subscript(int avatar_subscript) {
                            this.avatar_subscript = avatar_subscript;
                        }

                        public String getNickname_color() {
                            return nickname_color;
                        }

                        public void setNickname_color(String nickname_color) {
                            this.nickname_color = nickname_color;
                        }

                        public static class LabelBean {
                            private String path;
                            private String text;
                            private String label_theme;
                            private String text_color;
                            private int bg_style;
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

                            public int getBg_style() {
                                return bg_style;
                            }

                            public void setBg_style(int bg_style) {
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
            }

            public static class UpActionBean {
                private boolean like;
                private boolean reply;

                public boolean isLike() {
                    return like;
                }

                public void setLike(boolean like) {
                    this.like = like;
                }

                public boolean isReply() {
                    return reply;
                }

                public void setReply(boolean reply) {
                    this.reply = reply;
                }
            }

            public static class ReplyControlBean {
                private boolean up_like;
                private String time_desc;

                public boolean isUp_like() {
                    return up_like;
                }

                public void setUp_like(boolean up_like) {
                    this.up_like = up_like;
                }

                public String getTime_desc() {
                    return time_desc;
                }

                public void setTime_desc(String time_desc) {
                    this.time_desc = time_desc;
                }
            }

            public static class FolderBean {
                private boolean has_folded;
                private boolean is_folded;
                private String rule;

                public boolean isHas_folded() {
                    return has_folded;
                }

                public void setHas_folded(boolean has_folded) {
                    this.has_folded = has_folded;
                }

                public boolean isIs_folded() {
                    return is_folded;
                }

                public void setIs_folded(boolean is_folded) {
                    this.is_folded = is_folded;
                }

                public String getRule() {
                    return rule;
                }

                public void setRule(String rule) {
                    this.rule = rule;
                }
            }

            public static class CardLabelBean {
                private long rpid;
                private String text_content;
                private String text_color_day;
                private String text_color_night;
                private String label_color_day;
                private String label_color_night;
                private String image;
                private int type;
                private String background;
                private int background_width;
                private int background_height;
                private String jump_url;
                private int effect;
                private int effect_start_time;

                public long getRpid() {
                    return rpid;
                }

                public void setRpid(long rpid) {
                    this.rpid = rpid;
                }

                public String getText_content() {
                    return text_content;
                }

                public void setText_content(String text_content) {
                    this.text_content = text_content;
                }

                public String getText_color_day() {
                    return text_color_day;
                }

                public void setText_color_day(String text_color_day) {
                    this.text_color_day = text_color_day;
                }

                public String getText_color_night() {
                    return text_color_night;
                }

                public void setText_color_night(String text_color_night) {
                    this.text_color_night = text_color_night;
                }

                public String getLabel_color_day() {
                    return label_color_day;
                }

                public void setLabel_color_day(String label_color_day) {
                    this.label_color_day = label_color_day;
                }

                public String getLabel_color_night() {
                    return label_color_night;
                }

                public void setLabel_color_night(String label_color_night) {
                    this.label_color_night = label_color_night;
                }

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getBackground() {
                    return background;
                }

                public void setBackground(String background) {
                    this.background = background;
                }

                public int getBackground_width() {
                    return background_width;
                }

                public void setBackground_width(int background_width) {
                    this.background_width = background_width;
                }

                public int getBackground_height() {
                    return background_height;
                }

                public void setBackground_height(int background_height) {
                    this.background_height = background_height;
                }

                public String getJump_url() {
                    return jump_url;
                }

                public void setJump_url(String jump_url) {
                    this.jump_url = jump_url;
                }

                public int getEffect() {
                    return effect;
                }

                public void setEffect(int effect) {
                    this.effect = effect;
                }

                public int getEffect_start_time() {
                    return effect_start_time;
                }

                public void setEffect_start_time(int effect_start_time) {
                    this.effect_start_time = effect_start_time;
                }
            }
        }
    }
}

