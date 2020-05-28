package com.cn.wanxi.io;

import com.cn.wanxi.domain.CompanyDto;
import com.cn.wanxi.domain.CompanyInfoDto;
import com.cn.wanxi.domain.NewsDto;
import com.cn.wanxi.model.CompanyHonorModel;
import com.cn.wanxi.model.CompanyInfoModel;
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
 * @create 2020-05-28 9:04
 */
public class CompanyInfoIO {

    private String filePath = "D:\\liuxin\\QQdownload\\wanxi\\eastate\\CompanyInfo.txt";//定义一个存记事本的路径
    /* 引入构造方法,构造方法：在加载当前类的时候执行*/
    public CompanyInfoIO() {
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
            CompanyInfoModel infoModel = new CompanyInfoModel();
            outputStream.write(Arrays.toString(infoModel.getHeafs()).getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(Arrays.toString(infoModel.getImgs()).getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(Arrays.toString(infoModel.getInfos()).getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(Arrays.toString(infoModel.getInfoTexts()).getBytes());
            outputStream.write("@@".getBytes());

            outputStream.write(Arrays.toString(infoModel.getIds()).getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(Arrays.toString(infoModel.getNames()).getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(Arrays.toString(infoModel.getImgInfos()).getBytes());
            outputStream.write("@@".getBytes());

            outputStream.write(infoModel.getTextInfo1().getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(infoModel.getTextInfo2().getBytes());
            outputStream.write("@@".getBytes());
            outputStream.write(infoModel.getTextInfo3().getBytes());
            outputStream.write("@@".getBytes());
            CompanyHonorModel honorModel = new CompanyHonorModel();
            outputStream.write(honorModel.getImg().getBytes());
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
    public List<CompanyInfoDto> getCompanyModel() {
        String companyInfo = WriteNote.getReadModelString(filePath);
        //split 字符串转换为数组
        String[] companyInfos = companyInfo.split("@@");
     /*   for (int i = 0; i < companyModels.length; i++) {
           System.out.println(i + "---" + companyModels[i]);
       }*/
//        需要将每一个字符串前后的中括号去掉
        String heafs = companyInfos[0];
        String imgs = companyInfos[1];
        String infos = companyInfos[2];
        String infoTexts = companyInfos[3];

        heafs = heafs.substring(1,heafs.length()-1);
        imgs = imgs.substring(1,imgs.length()-1);
        infos = infos.substring(1,infos.length()-1);
        infoTexts = infoTexts.substring(1,infoTexts.length()-1);
        //去掉逗号
        String[] heafss = heafs.split(",");
        String[] imgss = imgs.split(",");
        String[] infoss = infos.split(",");
        String[] infoTextss = infoTexts.split(",");

        //封装
        List<CompanyInfoDto> infoList = new ArrayList<>();
        for (int i = 0; i <heafss.length ; i++) {
            CompanyInfoDto infoDto = new CompanyInfoDto();
           infoDto.setHeaf(heafss[i]);
           infoDto.setImg(imgss[i]);
           infoDto.setInfo(infoss[i]);
           infoDto.setInfoText(infoTextss[i]);

           infoList.add(infoDto);
        }

        return infoList;
    }

    /**
     * 得到数据（IO流里面）
     * 企业导航
     *
     * @return
     */
    public List<CompanyInfoDto> getCompanyModel1() {
        String companyInfo = WriteNote.getReadModelString(filePath);
        //split 字符串转换为数组
        String[] companyInfos = companyInfo.split("@@");
     /*   for (int i = 0; i < companyModels.length; i++) {
           System.out.println(i + "---" + companyModels[i]);
       }*/
//        需要将每一个字符串前后的中括号去掉
        String ids = companyInfos[4];
        String names = companyInfos[5];

        ids = ids.substring(1,ids.length()-1);
        names = names.substring(1,names.length()-1);

        //去掉逗号
        String[] idss = ids.split(",");
        String[] namess = names.split(",");
        //封装
        List<CompanyInfoDto> infoList1 = new ArrayList<>();
        for (int i = 0; i <idss.length ; i++) {
            CompanyInfoDto infoDto = new CompanyInfoDto();
                infoDto.setId(Integer.parseInt(idss[i].trim()));
                infoDto.setName(namess[i]);

            infoList1.add(infoDto);
        }

        return infoList1;
    }

    /**
     * 轮播
     * @return
     */
    public List<CompanyInfoDto> getCompanyModel2() {
        String companyInfo = WriteNote.getReadModelString(filePath);
        //split 字符串转换为数组
        String[] companyInfos = companyInfo.split("@@");
     /*   for (int i = 0; i < companyModels.length; i++) {
           System.out.println(i + "---" + companyModels[i]);
       }*/
//        需要将每一个字符串前后的中括号去掉
        String imgInfos = companyInfos[6];
        imgInfos = imgInfos.substring(1,imgInfos.length()-1);
        //去掉逗号
        String[] imgInfoss = imgInfos.split(",");

        //封装
        List<CompanyInfoDto> infoList2 = new ArrayList<>();
        for (int i = 0; i <imgInfoss.length ; i++) {
            CompanyInfoDto infoDto = new CompanyInfoDto();
         infoDto.setImgInfo(imgInfoss[i]);

            infoList2.add(infoDto);
        }

        return infoList2;
    }

    /**
     * 文字
     * @return
     */
    public CompanyInfoDto getCompanyModel3() {
        String companyInfo = WriteNote.getReadModelString(filePath);
        //split 字符串转换为数组
        String[] companyInfos = companyInfo.split("@@");
        CompanyInfoDto infoDto = new CompanyInfoDto();
//        companyDto.setAddress(companyModels[0]);
        infoDto.setTextInfo1(companyInfos[7]);
        infoDto.setTextInfo2(companyInfos[8]);
        infoDto.setTextInfo3(companyInfos[9]);
        infoDto.setImgHonor(companyInfos[10]);

        return infoDto;
    }

    public static void main(String[] args) {
        CompanyInfoIO companyInfoIO = new CompanyInfoIO();
        companyInfoIO.writeCompanyModel();
    }

}
