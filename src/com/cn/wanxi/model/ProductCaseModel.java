package com.cn.wanxi.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author l-xin
 * @create 2020-05-24 19:29
 */
public class ProductCaseModel {
    //楼盘广告板块
    private int id;
    private String name;
    //案例信息
    private String img;
    private String title;
    private String info;

    private String[] imgs = {"../img/1.jpg","../img/2.jpg","../img/3.jpg"};
    private String[] titles = {"绿城深蓝中心","御海首府","天泰阳光水岸"};
    private String[] infos = {"水电规划设计，是中国电建集团的核心业务板块之一，<p>\n" +
            "                承担了我国80%以上河流及水电站的规划设计</p>",
            "电力系统中各种电压的变电所及输配电线路组成的整<p>\n" +
            "                体，称为电力网，简称电网。</p>","大亚湾核电站是中国大陆第一-座大型商用核电站也是\n" +
            "                <p> 大陆首座使用国外技术和资金建设的核电站。。</p>"};

    //--------------案例版块导航--------------------------
    private int[] ids = {1,2,3,4,5};
    private String[] names = {"集团简介","集团荣誉","发展历程","核心优势","企业文化"};
    //楼盘广告板块
    private List<ProductCaseModel> list = new ArrayList<>();

    public List<ProductCaseModel> getList() {
        for (int i = 0; i <ids.length; i++) {
            ProductCaseModel productCaseModel = new ProductCaseModel();
            productCaseModel.setId(ids[i]);
            productCaseModel.setName(names[i]);
            list.add(productCaseModel);
        }

        return list;
    }
    //案例信息
    private List<ProductCaseModel> caseList = new ArrayList<>();

    public List<ProductCaseModel> getCaseList() {
        for (int i = 0; i <imgs.length ; i++) {
            ProductCaseModel caseModel = new ProductCaseModel();
            caseModel.setImg(imgs[i]);
            caseModel.setTitle(titles[i]);
            caseModel.setInfo(infos[i]);
            caseList.add(caseModel);

        }
        return caseList;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String[] getImgs() {
        return imgs;
    }

    public void setImgs(String[] imgs) {
        this.imgs = imgs;
    }

    public String[] getTitles() {
        return titles;
    }

    public void setTitles(String[] titles) {
        this.titles = titles;
    }

    public String[] getInfos() {
        return infos;
    }

    public void setInfos(String[] infos) {
        this.infos = infos;
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
