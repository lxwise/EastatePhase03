package com.cn.wanxi.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author l-xin
 * @create 2020-05-24 15:07
 */
public class NewsModel {

    //首页新闻
    private String homeNew;

    private String[] homeNews = {" <div class=\"new\"><span>集团在藏拉萨水电项目投产.\n" +
            "                ....</span>\n" +
            "                    <p>2016-09-04</p>\n" +
            "                    <p>8月29日，国家集团在藏拉萨水电项目\n" +
            "                        - --西藏尼洋河多水电站首台机组(4\n" +
            "                        号机)完成72小时试运行，......</p>\n" +
            "                    <div class=\"new1\">媒体聚焦</div>\n" +
            "                </div>","<div class=\"new\">\n" +
            "                    <span>明年供给侧改革或突出“去</span>.....\n" +
            "                    <p>2016-09-04</p>\n" +
            "                    <p>11月出口和进口双双正增长，释放出进\n" +
            "                        出口回稳向好的积极信号，也再度印证\n" +
            "                        了当前我国经济筑底迹象显现。\n" +
            "                        ......</p>\n" +
            "                    <div class=\"new1\">行业新闻</div>\n" +
            "                </div>","<div class=\"new\">\n" +
            "                    <span>东北公司福建公司贯彻六</span>.... .\n" +
            "                    <p>2016-09-04</p>\n" +
            "                    <p>多布水电站是尼洋河综合治理与保护控\n" +
            "                        制性工程和优选项目，是自治区“十二\n" +
            "                        五”期间唯一开工并建成投产的重点.....\n" +
            "                    </p>\n" +
            "                    <div class=\"new1\">集团公告</div>\n" +
            "                </div>"};

    //首页新闻封装
    private List<NewsModel> homeList = new ArrayList<>();

    public List<NewsModel> getHomeList() {
        for (int i = 0; i <homeNews.length; i++) {
            NewsModel newsModel = new NewsModel();
            newsModel.setHomeNew(homeNews[i]);
            homeList.add(newsModel);
        }
        return homeList;

    }


    //新闻页新闻
    private String newImg;
    private String news;

    private String[] newsImgs = {"../img/1.jpg","../img/1.jpg","../img/1.jpg","../img/1.jpg"};
    private String[] newss = {"<div><span>[集团公告]</span>集团在藏**水电项目投产发电</div>\n" +
            "                <div><p>2016-09-04</p></div>\n" +
            "                <div>\n" +
            "                    <p>8月29日,电集团在藏**水电项目一西藏尼洋河多布水电站首台机组 (4号机)完成72小时试运行，正式投入商业运行。多布水电站是</p>\n" +
            "                    <p>尼洋河综合治理与保护控制性工程和优选项目，自治区”十二五”期间**开工并建成投产的重点内需水电项目,也是集团公司在藏**水电</p>\n" +
            "                    <p>项目。</p>\n" +
            "                </div>",
            "<div><span>[集团公告]</span>集团在藏**水电项目投产发电</div>\n" +
                    "                <div><p>2016-09-04</p></div>\n" +
                    "                <div>\n" +
                    "                    <p>8月29日,电集团在藏**水电项目一西藏尼洋河多布水电站首台机组 (4号机)完成72小时试运行，正式投入商业运行。多布水电站是</p>\n" +
                    "                    <p>尼洋河综合治理与保护控制性工程和优选项目，自治区”十二五”期间**开工并建成投产的重点内需水电项目,也是集团公司在藏**水电</p>\n" +
                    "                    <p>项目。</p>\n" +
                    "                </div>",
            "<div><span>[集团公告]</span>集团在藏**水电项目投产发电</div>\n" +
                    "                <div><p>2016-09-04</p></div>\n" +
                    "                <div>\n" +
                    "                    <p>8月29日,电集团在藏**水电项目一西藏尼洋河多布水电站首台机组 (4号机)完成72小时试运行，正式投入商业运行。多布水电站是</p>\n" +
                    "                    <p>尼洋河综合治理与保护控制性工程和优选项目，自治区”十二五”期间**开工并建成投产的重点内需水电项目,也是集团公司在藏**水电</p>\n" +
                    "                    <p>项目。</p>\n" +
                    "                </div>",
            "<div><span>[集团公告]</span>集团在藏**水电项目投产发电</div>\n" +
                    "                <div><p>2016-09-04</p></div>\n" +
                    "                <div>\n" +
                    "                    <p>8月29日,电集团在藏**水电项目一西藏尼洋河多布水电站首台机组 (4号机)完成72小时试运行，正式投入商业运行。多布水电站是</p>\n" +
                    "                    <p>尼洋河综合治理与保护控制性工程和优选项目，自治区”十二五”期间**开工并建成投产的重点内需水电项目,也是集团公司在藏**水电</p>\n" +
                    "                    <p>项目。</p>\n" +
            "                </div>"};
    //新闻页新闻封装
    private List<NewsModel> newsList = new ArrayList<>();

    public List<NewsModel> getNewsList() {
        for (int i = 0; i < newsImgs.length; i++) {
            NewsModel newsModel = new NewsModel();
            newsModel.setNewImg(newsImgs[i]);
            newsModel.setNews(newss[i]);
            newsList.add(newsModel);

        }
        return newsList;
    }


    public String getNewImg() {
        return newImg;
    }

    public void setNewImg(String newImg) {
        this.newImg = newImg;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String[] getNewsImgs() {
        return newsImgs;
    }

    public void setNewsImgs(String[] newsImgs) {
        this.newsImgs = newsImgs;
    }

    public String[] getNewss() {
        return newss;
    }

    public void setNewss(String[] newss) {
        this.newss = newss;
    }

    public String getHomeNew() {
        return homeNew;
    }

    public void setHomeNew(String homeNew) {
        this.homeNew = homeNew;
    }

    public String[] getHomeNews() {
        return homeNews;
    }

    public void setHomeNews(String[] homeNews) {
        this.homeNews = homeNews;
    }
}
