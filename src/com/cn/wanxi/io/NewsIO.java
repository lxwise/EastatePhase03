package com.cn.wanxi.io;

import com.cn.wanxi.domain.CompanyInfoDto;
import com.cn.wanxi.domain.ImgDto;
import com.cn.wanxi.domain.NewsDto;
import com.cn.wanxi.model.CompanyModel;
import com.cn.wanxi.model.ImgModel;
import com.cn.wanxi.model.NewsModel;
import com.cn.wanxi.model.NewsSectionModel;
import com.cn.wanxi.util.WriteNote;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author l-xin
 * @create 2020-05-27 17:44
 */
public class NewsIO {

    private String filePath = "D:\\liuxin\\QQdownload\\wanxi\\eastate\\news.txt";//定义一个存记事本的路径
    /* 引入构造方法,构造方法：在加载当前类的时候执行*/
    public NewsIO() {
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
            NewsModel newsModel = new NewsModel();
            outputStream.write(Arrays.toString(newsModel.getHomeNews()).getBytes());
            outputStream.write("@@".getBytes());

            outputStream.write(Arrays.toString(newsModel.getNewsImgs()).getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(Arrays.toString(newsModel.getNewss()).getBytes());
            outputStream.write("@@".getBytes());

            NewsSectionModel sectionModel = new NewsSectionModel();

            outputStream.write(Arrays.toString(sectionModel.getIds()).getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(Arrays.toString(sectionModel.getNames()).getBytes());
            outputStream.write("@@".getBytes());


        } catch (Exception e) {//io流有问题
            e.printStackTrace();
        }
    }

    /**
     * 得到数据（IO流里面）
     * 封装首页新闻数据到model
     *
     * @return
     */
    public List<NewsDto> getCompanyModel() {
        String homenews = WriteNote.getReadModelString(filePath);
        //split 字符串转换为数组
        String[] homenewss = homenews.split("@@");
     /*   for (int i = 0; i < companyModels.length; i++) {
           System.out.println(i + "---" + companyModels[i]);
       }*/
//        需要将每一个字符串前后的中括号去掉
        String hmNews = homenewss[0];

        hmNews = hmNews.substring(1,hmNews.length()-1);
        //去掉逗号
        String[] hmNewss = hmNews.split(",");

        //封装
        List<NewsDto> newlist = new ArrayList<>();
        for (int i = 0; i <hmNewss.length ; i++) {
            NewsDto newsDto = new NewsDto();
            newsDto.setHomeNew(hmNewss[0]);
            newlist.add(newsDto);
        }

        return newlist;
    }

    /**
     * 得到数据（IO流里面）
     * 封装首页新闻数据到model
     *
     * @return
     */
    public List<NewsDto> getCompanyModel1() {
        String Newpage = WriteNote.getReadModelString(filePath);
        //split 字符串转换为数组
        String[] Newpages = Newpage.split("@@");
      /*  for (int i = 0; i < Newpages.length; i++) {
           System.out.println(i + "---" + Newpages[i]);
       }*/
//        需要将每一个字符串前后的中括号去掉
        String imsNews = Newpages[1];
        imsNews = imsNews.substring(1,imsNews.length()-1);
        //去掉逗号
        String[] imsNewss = imsNews.split(",");

        String textNews = Newpages[2];
        textNews = textNews.substring(1,textNews.length()-1);
        //去掉逗号
        String[] textNewss = textNews.split(",");
       /*    for (int i = 0; i < textNewss.length; i++) {
           System.out.println(i + "---" + textNewss[i]);
       }*/
        //封装
        List<NewsDto> newlist1 = new ArrayList<>();
        for (int i = 0; i <imsNewss.length ; i++) {
            NewsDto newsDto = new NewsDto();
            newsDto.setNewImg(imsNewss[i]);
            newsDto.setNews(textNewss[i]);
            newlist1.add(newsDto);
        }

        return newlist1;
    }


    /**
     * 得到数据（IO流里面）
     * 企业导航
     *
     * @return
     */
    public List<NewsDto> getCompanyModel2() {
        String Newpage = WriteNote.getReadModelString(filePath);
        //split 字符串转换为数组
        String[] Newpages = Newpage.split("@@");
     /*   for (int i = 0; i < companyModels.length; i++) {
           System.out.println(i + "---" + companyModels[i]);
       }*/
//        需要将每一个字符串前后的中括号去掉
        String ids = Newpages[3];
        String names = Newpages[4];

        ids = ids.substring(1,ids.length()-1);
        names = names.substring(1,names.length()-1);

        //去掉逗号
        String[] idss = ids.split(",");
        String[] namess = names.split(",");
        //封装
        List<NewsDto> newList1 = new ArrayList<>();
        for (int i = 0; i <idss.length ; i++) {
            NewsDto newsDto = new NewsDto();
            newsDto.setId(Integer.parseInt(idss[i].trim()));
            newsDto.setName(namess[i]);

            newList1.add(newsDto);
        }

        return newList1;
    }

    public static void main(String[] args) {
      NewsIO newsIO = new NewsIO();
        newsIO.writeCompanyModel();
    }
}
