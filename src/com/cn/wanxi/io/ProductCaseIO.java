package com.cn.wanxi.io;

import com.cn.wanxi.domain.CompanyInfoDto;
import com.cn.wanxi.domain.ProductCaseDto;
import com.cn.wanxi.model.CompanyHonorModel;
import com.cn.wanxi.model.CompanyInfoModel;
import com.cn.wanxi.model.ProductCaseModel;
import com.cn.wanxi.util.WriteNote;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author l-xin
 * @create 2020-05-28 12:22
 */
public class ProductCaseIO {


    private String filePath = "D:\\liuxin\\QQdownload\\wanxi\\eastate\\CompanyCase.txt";//定义一个存记事本的路径
    /* 引入构造方法,构造方法：在加载当前类的时候执行*/
    public ProductCaseIO() {
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
            ProductCaseModel caseModel = new ProductCaseModel();
            outputStream.write(Arrays.toString(caseModel.getImgs()).getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(Arrays.toString(caseModel.getTitles()).getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(Arrays.toString(caseModel.getInfos()).getBytes());
            outputStream.write("@@".getBytes());

        } catch (Exception e) {//io流有问题
            e.printStackTrace();
        }
    }

    /**
     * 得到数据（IO流里面）
     * 封装首页新闻数据到model
     *公司也
     * @return
     */
    public List<ProductCaseDto> getCompanyModel() {
        String productCase = WriteNote.getReadModelString(filePath);
        //split 字符串转换为数组
        String[] productCases = productCase.split("@@");
     /*   for (int i = 0; i < companyModels.length; i++) {
           System.out.println(i + "---" + companyModels[i]);
       }*/
//        需要将每一个字符串前后的中括号去掉
        String img = productCases[0];
        String title = productCases[1];
        String info = productCases[2];


        img = img.substring(1,img.length()-1);
        title = title.substring(1,title.length()-1);
        info = info.substring(1,info.length()-1);
        //去掉逗号
        String[] imgs = img.split(",");
        String[] titles = title.split(",");
        String[] infos = info.split(",");
        //封装
        List<ProductCaseDto> caseList = new ArrayList<>();
        for (int i = 0; i <imgs.length ; i++) {
            ProductCaseDto caseDto = new ProductCaseDto();
            caseDto.setImg(imgs[i]);
            caseDto.setTitle(titles[i]);
            caseDto.setInfo(infos[i]);

            caseList.add(caseDto);
        }

        return caseList;
    }

    public static void main(String[] args) {
        ProductCaseIO ProductCaseIO = new ProductCaseIO();
        ProductCaseIO.writeCompanyModel();
    }

}
