package com.cn.wanxi.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author l-xin
 * @create 2020-05-24 15:52
 */
public class CompanyInfoModel {
    //---------------------公司信息也---------------------------------
    private String img;
    private  String info;
    private  String infoText;
    private String heaf;
    private String[] heafs = {"companyInfo","companyHonor","#","#","#"};
    private String[] imgs = {"../img/k1.png","../img/k2.png","../img/k3.png","../img/k4.png","../img/k5.png"};
    private  String[] infos = {"集团简介","集团荣誉","发展历程","核心优势","企业文化"};
    private  String[]infoTexts = {"集地产、金融、健康、旅游及体育<p>\n" +
            "                为--体的世界500强企业集团</p>","致力于打造中国老百姓:负担得起的<p>\n" +
            "                高性价比精品住宅</p>","到2020年，将实现总资产超3万<p>\n" +
            "                亿、年销售规模超6000亿。</p>","行标准化运营模式，集团总部通过<p>\n" +
            "                紧密型集团化管理</p>","以诚信为核心的企业文化将伴随铸<p>\n" +
            "                造百年的全过程。</p>"};
    //数据封装
    private List<CompanyInfoModel> list = new ArrayList<>();

    public List<CompanyInfoModel> getList() {
        for (int i = 0; i < imgs.length; i++) {
            CompanyInfoModel companyInfoModel = new CompanyInfoModel();
            companyInfoModel.setImg(imgs[i]);
            companyInfoModel.setHeaf(heafs[i]);
            companyInfoModel.setInfo(infos[i]);
            companyInfoModel.setInfoText(infoTexts[i]);
            list.add(companyInfoModel);
        }
        return list;
    }

    //-----------------集团简介导航--------------------------
    private  int id;
    private String name;

    private int[] ids = {1,2,3,4,5};
    private String[] names = {"集团简介","集团荣誉","发展历程","核心优势","企业文化"};

    private List<CompanyInfoModel> listInfo =new ArrayList<>();

    public List<CompanyInfoModel> getListInfo() {
        for (int i = 0; i < ids.length; i++) {
            CompanyInfoModel companyInfoModel = new CompanyInfoModel();
            companyInfoModel.setId(ids[i]);
            companyInfoModel.setName(names[i]);
            listInfo.add(companyInfoModel);

        }
        return listInfo;

    }
//---------------------集团简介图片------------------------------------
    private String infoImg = "../img/b2.jpg";
    public int getId() {
        return id;
    }
//------------------------集团简介文字---------------------------------------

    private String textInfo1 = "<p><span>集团旗下房地产开发公司,拥有中国一级开发资质。在多年的开发建设中，建立起标准化、科学化、系统化的质量管理体系,形成过程质量控制和创优机</span></p>\n" +
            "               <p> 制。2004年起，公司全面实施精品战略，大规模整合优势资源，与国内外房地产相关行业龙头企业强强合作，真正实现了满屋名牌的精品产品。公司先后开发</p>\n" +
            "               <p>御景半岛、华府、名都、城、绿洲、金碧天下等系列项目500多个,先后获得100多项**殊荣，产品已经成为全国享有广泛知名度和美誉度的强势品牌。</p>";
    private String textInfo2 = "   <p><span>集团旗下建筑设计院，拥有建筑工程专业甲级，建筑装饰、幕墙、轻型钢结构、智能化、照明、消防等项甲级设计资质。具有规划、建筑、结构、设备等</span></p>\n" +
            "               <p> 专业设计人员近600人，其中一级注册建筑师、一级注册结构工程师、注册公用设备工程师等注册人员60余人。已独立承担超高层地标、商业综合体、大型居住</p>\n" +
            "               <p>区、酒店、饮食、健康、运动、娱乐、会议、高级写字楼等综合性高品质设计工程600多项，并与美国Gensler、美国PCPA、美国HOK、美国BCJ、美国TT、</p>\n" +
            "               <p>美国PB、美国AECOM、英国TFP、英国AEDAS、英国Atkins、英国PLP、英国Arup、香港巴马丹拿、香港许李严等国际知名企业开展紧密合作。</p>";
    private String textInfo3 = "    <p><span>集团旗下的建筑工程公司,拥有房屋建筑施工总承包特级资质、市政公用工程施工总承包-级资质，已形成了集建筑施工、市政工程、装饰装修和园林古建</span></p>\n" +
            "               <p> 筑施工等多种资质为- -体的经济实体。公司拥有一支综合能力过硬的专业化队伍，现有专业技术人员5000余人，其中一级注册建造师、注册造价师300余人,</p>\n" +
            "               <p>具有中、高级职称的1000余人。可承担各类I业与民用建筑、高层建筑、设备安装、市政、高级装饰装修等工程。</p>";

//------------------------集团简介轮播图片---------------------------------------
    private String imgInfo;
    private String[] imgInfos={"../img/1.jpg","../img/2.jpg","../img/3.jpg","../img/4.jpg"};
    private List<CompanyInfoModel> imgInfoList = new ArrayList<>();

    public List<CompanyInfoModel> getImgInfoList() {
        for (int i = 0; i < imgInfos.length; i++) {
            CompanyInfoModel companyInfoModel = new CompanyInfoModel();
            companyInfoModel.setImgInfo(imgInfos[i]);
            imgInfoList.add(companyInfoModel);
        }
        return imgInfoList;
    }

    public String getImgInfo() {
        return imgInfo;
    }

    public void setImgInfo(String imgInfo) {
        this.imgInfo = imgInfo;
    }

    public String[] getImgInfos() {
        return imgInfos;
    }

    public void setImgInfos(String[] imgInfos) {
        this.imgInfos = imgInfos;
    }

    public String getTextInfo1() {
        return textInfo1;
    }

    public void setTextInfo1(String textInfo1) {
        this.textInfo1 = textInfo1;
    }
    public String getHeaf() {
        return heaf;
    }

    public void setHeaf(String heaf) {
        this.heaf = heaf;
    }

    public String[] getHeafs() {
        return heafs;
    }

    public void setHeafs(String[] heafs) {
        this.heafs = heafs;
    }
    public String getTextInfo2() {
        return textInfo2;
    }

    public void setTextInfo2(String textInfo2) {
        this.textInfo2 = textInfo2;
    }

    public String getTextInfo3() {
        return textInfo3;
    }

    public void setTextInfo3(String textInfo3) {
        this.textInfo3 = textInfo3;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getIds() {
        return ids;
    }

    public void setIds(int[] ids) {
        this.ids = ids;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfoText() {
        return infoText;
    }

    public void setInfoText(String infoText) {
        this.infoText = infoText;
    }

    public String[] getImgs() {
        return imgs;
    }

    public void setImgs(String[] imgs) {
        this.imgs = imgs;
    }

    public String[] getInfos() {
        return infos;
    }

    public void setInfos(String[] infos) {
        this.infos = infos;
    }

    public String[] getInfoTexts() {
        return infoTexts;
    }

    public void setInfoTexts(String[] infoTexts) {
        this.infoTexts = infoTexts;
    }
}
