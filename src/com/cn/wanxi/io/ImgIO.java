package com.cn.wanxi.io;

import com.cn.wanxi.domain.CompanyDto;
import com.cn.wanxi.domain.ImgDto;
import com.cn.wanxi.model.CompanyModel;
import com.cn.wanxi.model.ImgModel;
import com.cn.wanxi.util.WriteNote;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author l-xin
 * @create 2020-05-27 14:01
 */
public class ImgIO {
    private String filePath = "D:\\liuxin\\QQdownload\\wanxi\\eastate\\img.txt";//定义一个存记事本的路径
    /* 引入构造方法,构造方法：在加载当前类的时候执行*/
    public ImgIO() {
        writeCompanyModel();
    }


    private void writeCompanyModel() {
        //这里去执行写入记事本
        //创建文件对象 ,这里是带参数的构造方法，
        // 只要一个类里面写了带参数的构造方法，那么没有参数的构造方法无效，默认的构造方法就没有了
        File file = new File(filePath);//给记事本提供一个文件路径
        //我们现在是从内存里面写入记事本，叫做输出
        try {
            OutputStream outputStream = new FileOutputStream(file);//创建输出流
            //        OutputStream提供一个输出接口，是一个超类，有说有输出流的共同属性和方法
//        abstract  就是抽象的意思
//        FileOutputStream干事情的，实现接口，子类
//        提现Java的三大特性  多态     继承，封装，多态（抽象）


//        throws FileNotFoundException异常：一般情况下我们不把异常抛出到方法上，
//        而是直接解决异常，用try catch，哪里有异常，就在哪里处理。
            CompanyModel companyModel = new CompanyModel();
            outputStream.write(Arrays.toString(companyModel.getCpImgs()).getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(Arrays.toString(companyModel.getCpInfos()).getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(Arrays.toString(companyModel.getCpInfo1s()).getBytes());
            outputStream.write("@@".getBytes());

            ImgModel imgModel = new ImgModel();
            outputStream.write(Arrays.toString(imgModel.getImgHeafs()).getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(Arrays.toString(imgModel.getImgNames()).getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(Arrays.toString(imgModel.getImgs()).getBytes());
            outputStream.write("@@".getBytes());
        } catch (Exception e) {//io流有问题
            e.printStackTrace();
        }
    }

    /**
     * 得到数据（IO流里面）
     * 封装首页简介数据到model
     *
     * @return
     */
    public List<ImgDto> getCompanyModel() {
        String imgs = WriteNote.getReadModelString(filePath);
        //split 字符串转换为数组
        String[] imgsStrings = imgs.split("@@");
     /*   for (int i = 0; i < companyModels.length; i++) {
           System.out.println(i + "---" + companyModels[i]);
       }*/
//        需要将每一个字符串前后的中括号去掉
        String cpImg = imgsStrings[0];
        String infoString = imgsStrings[1];
        String info1string = imgsStrings[2];

/*
        String imgHeaf = imgsStrings[3];
        String imgName = imgsStrings[4];
        String imgcace = imgsStrings[5];
*/

        cpImg = cpImg.substring(1,cpImg.length()-1);
        infoString = infoString.substring(1,infoString.length()-1);
        info1string = info1string.substring(1,info1string.length()-1);

 /*       imgHeaf = imgHeaf.substring(1,imgHeaf.length()-1);
        imgName = imgName.substring(1,imgName.length()-1);
        imgcace = imgcace.substring(1,imgcace.length()-1);
*/
        //去掉逗号
        String[] cpimgs = cpImg.split(",");
        String[] infoStrings = infoString.split(",");
        String[] info1strings = info1string.split(",");

 /*       String[] imgHeafs = imgHeaf.split(",");
        String[] imgNames = imgName.split(",");
        String[] imgcaces = imgcace.split(",");

*/

        //封装
        List<ImgDto> list = new ArrayList<>();
        for (int i = 0; i <cpimgs.length ; i++) {
            ImgDto imgDto = new ImgDto();
            imgDto.setCpImg(cpimgs[i]);
            imgDto.setCpInfo(infoStrings[i]);
            imgDto.setCpInfo1(info1strings[i]);

            list.add(imgDto);
        }

        return list;
    }

    /**
     * 得到数据（IO流里面）
     * 封装首页小案例数据到model
     *
     * @return
     */
    public List<ImgDto> getImgModel() {
        String imgs = WriteNote.getReadModelString(filePath);
        //split 字符串转换为数组
        String[] imgsStrings = imgs.split("@@");
     /*   for (int i = 0; i < companyModels.length; i++) {
           System.out.println(i + "---" + companyModels[i]);
       }*/
        String imgHeaf = imgsStrings[3];
        String imgName = imgsStrings[4];
        String imgcace = imgsStrings[5];


        imgHeaf = imgHeaf.substring(1,imgHeaf.length()-1);
        imgName = imgName.substring(1,imgName.length()-1);
        imgcace = imgcace.substring(1,imgcace.length()-1);

        String[] imgHeafs = imgHeaf.split(",");
        String[] imgNames = imgName.split(",");
        String[] imgcaces = imgcace.split(",");


        //封装
        List<ImgDto> imglist = new ArrayList<>();
        for (int i = 0; i <imgHeafs.length ; i++) {
            ImgDto imgDto = new ImgDto();
            imgDto.setImgHeaf(imgHeafs[i]);
            imgDto.setImgName(imgNames[i]);
            imglist.add(imgDto);
        }

        return imglist;
    }
    /**
     * 得到数据（IO流里面）
     * 封装首页大案例数据到model
     *
     * @return
     */
    public List<ImgDto> getImgModel1() {
        String imgs = WriteNote.getReadModelString(filePath);
        //split 字符串转换为数组
        String[] imgsStrings = imgs.split("@@");
     /*   for (int i = 0; i < companyModels.length; i++) {
           System.out.println(i + "---" + companyModels[i]);
       }*/
        String imgcace = imgsStrings[5];
        imgcace = imgcace.substring(1,imgcace.length()-1);
        String[] imgcaces = imgcace.split(",");
        //封装
        List<ImgDto> caselist = new ArrayList<>();
        for (int i = 0; i <imgcaces.length ; i++) {
            ImgDto imgDto = new ImgDto();
            imgDto.setImg(imgcaces[i]);
            caselist.add(imgDto);
        }

        return caselist;
    }
    public static void main(String[] args) {
       ImgIO imgIO = new ImgIO();
       imgIO.writeCompanyModel();
    }

}
