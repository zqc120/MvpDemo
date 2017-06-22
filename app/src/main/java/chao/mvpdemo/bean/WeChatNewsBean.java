package chao.mvpdemo.bean;

import java.util.List;

/**
 * Created by Chao on 2017/6/2.
 */

public class WeChatNewsBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-06-02","title":"拍坏了的亲子照，爸爸妈妈看完都笑哭了！","description":"妈妈帮","picUrl":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-22807623.jpg/640","url":"https://mp.weixin.qq.com/s?__biz=MjM5ODAyMTY2MA==&idx=3&mid=2649768985&sn=7da6e7ba286c2b57e39182227a728396"},{"ctime":"2017-06-02","title":"50岁以后，不要自做多情","description":"江海摄影网","picUrl":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-12863014.static/640","url":"https://mp.weixin.qq.com/s?__biz=MzI2NzA0NTg5MA==&idx=4&mid=2655983681&sn=f0a5c0474d08f090f5f43b8abaa7efcd"},{"ctime":"2017-06-02","title":"命运一半在你手里，另一半在因果里","description":"江海摄影网","picUrl":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-12863014.static/640","url":"https://mp.weixin.qq.com/s?__biz=MzI2NzA0NTg5MA==&idx=2&mid=2655983681&sn=17698d58d7e03eee80b6ca54852e19aa"},{"ctime":"2017-06-02","title":"尊重孩子心中的\u201c城池\u201d","description":"民主与法制网时评","picUrl":"http://t1.qpic.cn/mblogpic/34d9dfb75cfceb04a840/2000","url":"https://mp.weixin.qq.com/s?__biz=MzAxOTY3Mzc3OQ==&idx=2&mid=2649850807&sn=4baf38c06bea4cd80d50ca7d461c92c8"},{"ctime":"2017-06-02","title":"一个人真正的资本，不是相貌，不是金钱，而是......","description":"教你做人做事","picUrl":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-25642135.jpg/640","url":"https://mp.weixin.qq.com/s?__biz=MzA3NTYyMjMyMw==&idx=3&mid=2650146616&sn=8276caebad55a91f23830d54a59d7b87"},{"ctime":"2017-06-02","title":"删掉我的人，就别再加回来了","description":"教你做人做事","picUrl":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-25644201.jpg/640","url":"https://mp.weixin.qq.com/s?__biz=MzA3NTYyMjMyMw==&idx=5&mid=2650146616&sn=459f495e4c405761509e0aad17843ce4"},{"ctime":"2017-06-02","title":"一切自有最好的安排","description":"感悟励志智慧人生","picUrl":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-26455960.jpg/640","url":"https://mp.weixin.qq.com/s?__biz=MzAxMDA0NjczNQ==&idx=3&mid=2650409193&sn=42f07f4b3fa2e6dc944b8b7e2fde04fb"},{"ctime":"2017-06-02","title":"一句实话，顶过上百句谎言","description":"感悟励志智慧人生","picUrl":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-26455961.jpg/640","url":"https://mp.weixin.qq.com/s?__biz=MzAxMDA0NjczNQ==&idx=2&mid=2650409193&sn=8772fddf7e5a303ef3521a4eeb0d0d7d"},{"ctime":"2017-06-02","title":"别让你的人生毁在冲动里","description":"感悟励志智慧人生","picUrl":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-26455962.jpg/640","url":"https://mp.weixin.qq.com/s?__biz=MzAxMDA0NjczNQ==&idx=4&mid=2650409193&sn=97e19bdad007620070597c362627c8ef"},{"ctime":"2017-06-02","title":"莫言震撼演讲：社会这船沉了，富人不会比穷人结局好到哪里！","description":"每日政商内参","picUrl":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-26438097.jpg/640","url":"https://mp.weixin.qq.com/s?__biz=MzA5MDI1NDM5NQ==&idx=2&mid=2650202592&sn=dabbe2c1cedbe505f01fda2d00f145ff"}]
     */

    private int code;
    private String msg;
    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        /**
         * ctime : 2017-06-02
         * title : 拍坏了的亲子照，爸爸妈妈看完都笑哭了！
         * description : 妈妈帮
         * picUrl : http://zxpic.gtimg.com/infonew/0/wechat_pics_-22807623.jpg/640
         * url : https://mp.weixin.qq.com/s?__biz=MjM5ODAyMTY2MA==&idx=3&mid=2649768985&sn=7da6e7ba286c2b57e39182227a728396
         */

        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
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

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
