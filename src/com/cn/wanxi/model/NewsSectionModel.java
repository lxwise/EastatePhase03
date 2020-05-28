package com.cn.wanxi.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author l-xin
 * @create 2020-05-24 14:21
 */
public class NewsSectionModel {
    //新闻版块导航
    //-----------------//新闻版块导航栏--------------------------
    private int id;
    private String name;

    private int[] ids = {1,2,3,4,5};
    private String[] names = {"媒体聚焦","","行业新闻","","集团公告"};

    private List<NewsSectionModel> list =new ArrayList<>();

    public List<NewsSectionModel> getList() {
        for (int i = 0; i < ids.length; i++) {
            NewsSectionModel sectionModel = new NewsSectionModel();
            sectionModel.setId(ids[i]);
            sectionModel.setName(names[i]);
            list.add(sectionModel);

        }
        return list;

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

    public int[] getIds() {
        return ids;
    }

    public void setIds(int[] ids) {
        this.ids = ids;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }
}
