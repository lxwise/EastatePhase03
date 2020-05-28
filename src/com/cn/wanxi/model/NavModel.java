package com.cn.wanxi.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author l-xin
 * @create 2020-05-23 20:57
 */
public class NavModel {
    //导航链接
    private String href;
    //导航名
    private String name;

    private  String[] hrefs = {"/home","/company","/productLayout","/productCase","/news","/employee","/callUs",};
    private  String[] names = {"网站首页","集团概况","产业布局","精品楼盘","新闻中心","人力资源","联系我们"};
    //封装到list集合
    private List<NavModel> navModelList = new ArrayList<>();

    public List<NavModel> getNavModelList(){
        for (int i = 0; i <hrefs.length ; i++) {
            NavModel navModel = new NavModel();
            navModel.setHref(hrefs[i]);
            navModel.setName(names[i]);
            navModelList.add(navModel);
         }
        return  navModelList;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getHrefs() {
        return hrefs;
    }

    public void setHrefs(String[] hrefs) {
        this.hrefs = hrefs;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public void setNavModelList(List<NavModel> navModelList) {
        this.navModelList = navModelList;
    }
}
