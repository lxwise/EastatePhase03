package com.cn.wanxi.domain;

/**
 * @author l-xin
 * @create 2020-05-28 9:09
 */
public class CompanyInfoDto {

    //---------------------公司信息也概况---------------------------------
    private String img;
    private  String info;
    private  String infoText;
    private String heaf;

    //-----------------集团简介导航--------------------------
    private  int id;
    private String name;
    //------------------------集团简介文字---------------------------------------
    private String textInfo1;
    private String textInfo2;
    private String textInfo3;

    //------------------------集团简介轮播图片---------------------------------------
    private String imgInfo;
//荣誉页图片
    private String imgHonor;

    public String getImgHonor() {
        return imgHonor;
    }

    public void setImgHonor(String imgHonor) {
        this.imgHonor = imgHonor;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfoText() {
        return infoText;
    }

    public void setInfoText(String infoText) {
        this.infoText = infoText;
    }

    public String getHeaf() {
        return heaf;
    }

    public void setHeaf(String heaf) {
        this.heaf = heaf;
    }


    public String getTextInfo1() {
        return textInfo1;
    }

    public void setTextInfo1(String textInfo1) {
        this.textInfo1 = textInfo1;
    }

    public String getTextInfo2() {
        return textInfo2;
    }

    public void setTextInfo2(String textInfo2) {
        this.textInfo2 = textInfo2;
    }

    public String getTextInfo3() {
        return textInfo3;
    }

    public void setTextInfo3(String textInfo3) {
        this.textInfo3 = textInfo3;
    }

    public String getImgInfo() {
        return imgInfo;
    }

    public void setImgInfo(String imgInfo) {
        this.imgInfo = imgInfo;
    }
}
