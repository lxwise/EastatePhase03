package com.cn.wanxi.io;

import com.cn.wanxi.domain.CallUsDto;
import com.cn.wanxi.domain.CompanyDto;
import com.cn.wanxi.domain.NavDto;
import com.cn.wanxi.model.CallUsModel;
import com.cn.wanxi.model.NavModel;
import com.cn.wanxi.util.WriteNote;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author l-xin
 * @create 2020-05-28 16:53
 */
public class CallUsIO {

    private String filePath = "D:\\liuxin\\QQdownload\\wanxi\\eastate\\CallUs.txt";//定义一个存记事本的路径
    /* 引入构造方法,构造方法：在加载当前类的时候执行*/
    public CallUsIO() {
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
            CallUsModel callUsModel = new CallUsModel();
            outputStream.write(callUsModel.getAdr().getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(callUsModel.getPhone().getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(callUsModel.getEmail().getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(Arrays.toString(callUsModel.getImgs()).getBytes());
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
    public List<CallUsDto> getCompanyModel() {
        String callus = WriteNote.getReadModelString(filePath);
        //split 字符串转换为数组
        String[] calluss = callus.split("@@");
     /*   for (int i = 0; i < companyModels.length; i++) {
           System.out.println(i + "---" + companyModels[i]);
       }*/
//        需要将每一个字符串前后的中括号去掉
        String imgs = calluss[3];
        imgs = imgs.substring(1,imgs.length()-1);
        //去掉逗号
        String[] imgss = imgs.split(",");

        //封装
        List<CallUsDto> imglist = new ArrayList<>();
        for (int i = 0; i <imgss.length ; i++) {
            CallUsDto callUsDto = new CallUsDto();
            callUsDto.setImg(imgss[i]);
            imglist.add(callUsDto);
        }

        return imglist;
    }

    /**
     * 得到数据（IO流里面）
     * 封装数据到model
     *
     * @return
     */
    public CallUsDto getCompanyModel1() {
        String callus = WriteNote.getReadModelString(filePath);
        //split 字符串转换为数组
        String[] callusss = callus.split("@@");
     /*   for (int i = 0; i < companyModels.length; i++) {
           System.out.println(i + "---" + companyModels[i]);
       }*/
        CallUsDto CallUsDto = new CallUsDto();
        CallUsDto.setAdr(callusss[0]);
        CallUsDto.setPhone(callusss[1]);
        CallUsDto.setEmail(callusss[2]);

        return CallUsDto;
    }


    public static void main(String[] args) {
        CallUsIO navIO = new CallUsIO();
        navIO.writeCompanyModel();
    }
}
