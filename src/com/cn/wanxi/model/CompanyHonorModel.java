package com.cn.wanxi.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author l-xin
 * @create 2020-05-25 10:45
 */
public class CompanyHonorModel {
    //-----------------集团荣誉也导航栏--------------------------
    private  int id;
    private String name;
    private int[] ids = {1,2,3,4,5};
    private String[] names = {"集团简介","集团荣誉","发展历程","核心优势","企业文化"};

    private List<CompanyInfoModel> listInfo =new ArrayList<>();

    public List<CompanyInfoModel> getListInfo() {
        for (int i = 0; i < ids.length; i++) {
            CompanyInfoModel companyInfoModel = new CompanyInfoModel();
            companyInfoModel.setId(ids[i]);
            companyInfoModel.setName(names[i]);
            listInfo.add(companyInfoModel);

        }
        return listInfo;

    }

//-----------------集团荣誉也图片--------------------------
    private String img = "../img/5.jpg";




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

    public void setListInfo(List<CompanyInfoModel> listInfo) {
        this.listInfo = listInfo;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
