package com.cn.wanxi.io;

import com.cn.wanxi.domain.CompanyInfoDto;
import com.cn.wanxi.domain.ProductLayoutDto;
import com.cn.wanxi.model.CompanyHonorModel;
import com.cn.wanxi.model.CompanyInfoModel;
import com.cn.wanxi.model.ProductLayoutModel;
import com.cn.wanxi.util.WriteNote;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author l-xin
 * @create 2020-05-28 11:20
 */
public class ProductLayoutIO {

    private String filePath = "D:\\liuxin\\QQdownload\\wanxi\\eastate\\ProductLayout.txt";//定义一个存记事本的路径
    /* 引入构造方法,构造方法：在加载当前类的时候执行*/
    public ProductLayoutIO() {
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
            ProductLayoutModel layoutModel = new ProductLayoutModel();

            outputStream.write(layoutModel.getImg1().getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(layoutModel.getImg2().getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(layoutModel.getImg3().getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(layoutModel.getImg4().getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(layoutModel.getImg5().getBytes());
            outputStream.write("@@".getBytes());

            outputStream.write(layoutModel.getTitle1().getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(layoutModel.getTitle2().getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(layoutModel.getTitle3().getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(layoutModel.getTitle4().getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(layoutModel.getTitle5().getBytes());
            outputStream.write("@@".getBytes());

            outputStream.write(layoutModel.getText1().getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(layoutModel.getText2().getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(layoutModel.getText3().getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(layoutModel.getText4().getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(layoutModel.getText5().getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(layoutModel.getText6().getBytes());
            outputStream.write("@@".getBytes());


        } catch (Exception e) {//io流有问题
            e.printStackTrace();
        }
    }

    /**
     * 文字
     * @return
     */
    public ProductLayoutDto getCompanyModel() {
        String productLayout = WriteNote.getReadModelString(filePath);
        //split 字符串转换为数组
        String[] productLayouts = productLayout.split("@@");
        ProductLayoutDto layoutDto = new ProductLayoutDto();
//        companyDto.setAddress(companyModels[0]);
        layoutDto.setImg1(productLayouts[0]);
        layoutDto.setImg2(productLayouts[1]);
        layoutDto.setImg3(productLayouts[2]);
        layoutDto.setImg4(productLayouts[3]);
        layoutDto.setImg5(productLayouts[4]);

        layoutDto.setTitle1(productLayouts[5]);
        layoutDto.setTitle2(productLayouts[6]);
        layoutDto.setTitle3(productLayouts[7]);
        layoutDto.setTitle4(productLayouts[8]);
        layoutDto.setTitle5(productLayouts[9]);

        layoutDto.setText1(productLayouts[10]);
        layoutDto.setText2(productLayouts[11]);
        layoutDto.setText3(productLayouts[12]);
        layoutDto.setText4(productLayouts[13]);
        layoutDto.setText5(productLayouts[14]);
        layoutDto.setText6(productLayouts[15]);

        return layoutDto;
    }

    public static void main(String[] args) {
        ProductLayoutIO layoutIO = new ProductLayoutIO();
        layoutIO.writeCompanyModel();
    }

}
