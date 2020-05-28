package com.cn.wanxi.io;

import com.cn.wanxi.domain.NavDto;
import com.cn.wanxi.domain.NewsDto;
import com.cn.wanxi.model.NavModel;
import com.cn.wanxi.model.NewsModel;
import com.cn.wanxi.util.WriteNote;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author l-xin
 * @create 2020-05-28 9:45
 */
public class NavIO {
    private String filePath = "D:\\liuxin\\QQdownload\\wanxi\\eastate\\Nav.txt";//定义一个存记事本的路径
    /* 引入构造方法,构造方法：在加载当前类的时候执行*/
    public NavIO() {
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
            NavModel navModel = new NavModel();
            outputStream.write(Arrays.toString(navModel.getHrefs()).getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(Arrays.toString(navModel.getNames()).getBytes());
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
    public List<NavDto> getCompanyModel() {
        String navs = WriteNote.getReadModelString(filePath);
        //split 字符串转换为数组
        String[] navss = navs.split("@@");
     /*   for (int i = 0; i < companyModels.length; i++) {
           System.out.println(i + "---" + companyModels[i]);
       }*/
//        需要将每一个字符串前后的中括号去掉
        String heafs = navss[0];
        String names = navss[1];
        heafs = heafs.substring(1,heafs.length()-1);
        names = names.substring(1,names.length()-1);
        //去掉逗号
        String[] heafss = heafs.split(",");
        String[] namess = names.split(",");

        //封装
        List<NavDto> navlist = new ArrayList<>();
        for (int i = 0; i <heafss.length ; i++) {
            NavDto navDto = new NavDto();
            navDto.setHref(heafss[i]);
            navDto.setName(namess[i]);
            navlist.add(navDto);
        }

        return navlist;
    }

    public static void main(String[] args) {
       NavIO navIO = new NavIO();
        navIO.writeCompanyModel();
    }

}
