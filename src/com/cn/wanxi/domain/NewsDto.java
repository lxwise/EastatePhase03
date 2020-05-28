package com.cn.wanxi.domain;

/**
 * @author l-xin
 * @create 2020-05-27 17:45
 */
public class NewsDto {
    //首页新闻
    private String homeNew;

    //新闻页新闻
    private String newImg;
    private String news;


    //新闻版块导航
    //-----------------//新闻版块导航栏--------------------------
    private int id;
    private String name;


    public String getHomeNew() {
        return homeNew;
    }

    public void setHomeNew(String homeNew) {
        this.homeNew = homeNew;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
