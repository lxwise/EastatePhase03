package com.cn.wanxi.domain;

/**
 * @author l-xin
 * @create 2020-05-27 13:59
 */
public class ImgDto {

    //首页小案例图片
    private String imgHeaf;
    private String imgName;
    //大案例图片
    private String img;

    //-------------------首页公司概况图片--------------------------------
    private String cpImg;
    //-------------------首页公司概况介绍--------------------------------
    private String cpInfo;
    private String cpInfo1;

    public String getImgHeaf() {
        return imgHeaf;
    }

    public void setImgHeaf(String imgHeaf) {
        this.imgHeaf = imgHeaf;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCpImg() {
        return cpImg;
    }

    public void setCpImg(String cpImg) {
        this.cpImg = cpImg;
    }

    public String getCpInfo() {
        return cpInfo;
    }

    public void setCpInfo(String cpInfo) {
        this.cpInfo = cpInfo;
    }

    public String getCpInfo1() {
        return cpInfo1;
    }

    public void setCpInfo1(String cpInfo1) {
        this.cpInfo1 = cpInfo1;
    }

}
