package com.cn.wanxi.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author l-xin
 * @create 2020-05-23 20:57
 */
public class CompanyModel {
    //公司信息
    private String logo = "../img/logo1.png";
    //公司名称
    private String name = "胡氏万州房地产集团";
    //联系电话'
    private  String phone = " <span> 028- 80000000</span>\n" +
            "            <span><p>联系在线客服</p></span>\n" +
            "            <p> 现在就向客服顾问咨询您要了解的问题</p>";
    //公司主页信息
    private  String indexInfo = " <p> <span>让我们更近一些\n" +
            "            ，您可以</span></p>\n" +
            "            <p>马上拨打企业专线客服顾问正在在线等您</p>";

    //公众号
    private String weChart = "../img/icon.jpg";
//-------------------首页公司概况--------------------------------
    private String bgtext = "<span>宇宙房地产集团</span>\n" +
        "                <p>宇宙房地产集团股份有限公司成立于1986年，1990年进\n" +
        "                    入房地产行业，经过三十余年的发展，已成为国内领先\n" +
        "                    的房地产公司。2016年公司首次跻身《财富》“世界\n" +
        "                    500强”，位列榜单第370位。</p>";
    //-------------------首页公司概况图片--------------------------------
    private String cpImg;
    private String[] cpImgs = {"../img/r1.png","../img/r2.png","../img/r3.png","../img/r4.png",};

    //-------------------首页公司概况介绍--------------------------------
    private String cpInfo;
    private String cpInfo1;

    private String[] cpInfos = {"人才理念","人员队伍","员工培训","人才招聘"};

    private String[] cpInfo1s = {"以才立，业以才兴。人才是企业发<p>\n" +
            "                    展的根本是发展的第一生产力。</p>","人才是一条理性的河流，哪里有谷<p>\n" +
            "                    地，就向哪里汇聚。</p>","人才是企业发展的根本，是推动企<p>\n" +
            "                    业跨越式发展的第一生产力。</p>","完善人才队伍的结构和水平，保持<p>\n" +
            "                    组织的激情与活力。</p>"};

    //-------------------首页公司概况封装--------------------------------
    private List<CompanyModel> cpList = new ArrayList<>();

    public List<CompanyModel> getCpList() {
        for (int i = 0; i <cpImgs.length ; i++) {
            CompanyModel companyModel = new CompanyModel();
            companyModel.setCpImg(cpImgs[i]);

            companyModel.setCpInfo(cpInfos[i]);
            companyModel.setCpInfo1(cpInfo1s[i]);

            cpList.add(companyModel);

        }
        return cpList;
    }

    public String getCpImg() {
        return cpImg;
    }

    public void setCpImg(String cpImg) {
        this.cpImg = cpImg;
    }

    public String[] getCpImgs() {
        return cpImgs;
    }

    public void setCpImgs(String[] cpImgs) {
        this.cpImgs = cpImgs;
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

    public String[] getCpInfos() {
        return cpInfos;
    }

    public void setCpInfos(String[] cpInfos) {
        this.cpInfos = cpInfos;
    }

    public String[] getCpInfo1s() {
        return cpInfo1s;
    }

    public void setCpInfo1s(String[] cpInfo1s) {
        this.cpInfo1s = cpInfo1s;
    }

    public String getBgtext() {
        return bgtext;
    }

    public String getLogo() {
        return logo;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getIndexInfo() {
        return indexInfo;
    }

    public String getWeChart() {
        return weChart;
    }
}
