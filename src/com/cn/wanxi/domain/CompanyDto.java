package com.cn.wanxi.domain;

/**
 * @author l-xin
 * @create 2020-05-27 11:09
 */
public class CompanyDto {

    //公司信息
    private String logo;
    //公司名称
    private String name;
    //联系电话'
    private  String phone;
    //公司主页信息
    private  String indexInfo;

    //公众号
    private String weChart;

   // -------------------首页公司概况--------------------------------
    private String bgtext;


    public String getBgtext() {
        return bgtext;
    }

    public void setBgtext(String bgtext) {
        this.bgtext = bgtext;
    }


    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIndexInfo() {
        return indexInfo;
    }

    public void setIndexInfo(String indexInfo) {
        this.indexInfo = indexInfo;
    }

    public String getWeChart() {
        return weChart;
    }

    public void setWeChart(String weChart) {
        this.weChart = weChart;
    }
}
