package com.cn.wanxi.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author l-xin
 * @create 2020-05-24 14:40
 */
public class ImgModel {

    //首页小案例图片
    private String imgHeaf;
    private String imgName;
    //大案例图片
    private String img;

    private String[] imgHeafs = {"../img/j1.png","../img/j2.png","../img/j3.png","../img/j4.png","../img/j5.png","../img/j6.png"};
    private String[] imgNames = {"商业地产","住宅地产","高端别墅","旅游地产","养老地产","其它"};

    private  String[] imgs = {"../img/l1.jpg","../img/l2.jpg","../img/l3.jpg","../img/l4.jpg"};

    //封装小案例数据
    private List<ImgModel> list = new ArrayList<>();

    public List<ImgModel> getList() {

        for (int i = 0; i <imgHeafs.length ; i++) {
            ImgModel imgModel = new ImgModel();
            imgModel.setImgHeaf(imgHeafs[i]);
            imgModel.setImgName(imgNames[i]);
            list.add(imgModel);
        }
        return list;
    }

    //封装大案例图片
    private  List<ImgModel> imgList = new ArrayList<>();

    public List<ImgModel> getImgList() {
        for (int i = 0; i < imgs.length; i++) {
            ImgModel imgModel = new ImgModel();
            imgModel.setImg(imgs[i]);
            imgList.add(imgModel);

        }
        return imgList;
    }




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

    public String[] getImgHeafs() {
        return imgHeafs;
    }

    public void setImgHeafs(String[] imgHeafs) {
        this.imgHeafs = imgHeafs;
    }

    public String[] getImgNames() {
        return imgNames;
    }

    public void setImgNames(String[] imgNames) {
        this.imgNames = imgNames;
    }

    public String[] getImgs() {
        return imgs;
    }

    public void setImgs(String[] imgs) {
        this.imgs = imgs;
    }
}
