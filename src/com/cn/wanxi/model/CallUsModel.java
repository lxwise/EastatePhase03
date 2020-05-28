package com.cn.wanxi.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author l-xin
 * @create 2020-05-25 10:00
 */
public class CallUsModel {
    //新闻版块导航
    private int id;
    private String name;

    private String adr = "四川省成都市孵化园";
    private String phone = " 028-00000000";
    private String img;
    private String[] imgs = {"../img/location.png","../img/call.png","../img/message.png"};

    private List<CallUsModel> imgList =new ArrayList<>();
    public List<CallUsModel> getimgList() {
        for (int i = 0; i < imgs.length; i++) {
            CallUsModel callUsModel = new CallUsModel();
            callUsModel.setImg(imgs[i]);
            imgList.add(callUsModel);

        }
        return imgList;

    }

    private String email = "admin@163.com";

    //-----------------广告导航栏--------------------------
    private int[] ids = {1,2,3,4,5};
    private String[] heafs = {"/companyInfo","/companyHonor","#","#","#"};
    private String[] names = {"集团简介","集团荣誉","发展历程","核心优势","企业文化"};

    private List<CallUsModel> list =new ArrayList<>();

    public List<CallUsModel> getList() {
        for (int i = 0; i < ids.length; i++) {
            CallUsModel callUsModel = new CallUsModel();
            callUsModel.setId(ids[i]);
            callUsModel.setName(names[i]);
           list.add(callUsModel);

        }
        return list;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getHeafs() {
        return heafs;
    }

    public void setHeafs(String[] heafs) {
        this.heafs = heafs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String[] getImgs() {
        return imgs;
    }

    public void setImgs(String[] imgs) {
        this.imgs = imgs;
    }
}
