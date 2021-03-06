package com.cn.wanxi.model;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.List;

/**
 * @author l-xin
 * @create 2020-05-24 16:06
 */
public class ProductLayoutModel {
    private String img1 = "../img/b1.jpg";
    private String img2 = "../img/b2.jpg";
    private String img3 = "../img/jj.jpg";
    private String img4 = "../img/b4.jpg";
    private String img5 = "../img/b5_8mbz.jpg";

    private String title1 = "地产开发";
    private String title2 = "商业运营";
    private String title3 = "物业管理";
    private String title4 = "金融服务";
    private String title5 = "全球战略";


    private String text1 = "<p><span>集团旗下房地产开发公司,拥有中国一-级开发资质。 在多年的开发建设中，建立起标准化、科学化、系统化的质量管理体系，形成过程质量控制和创优机制。2004</span></p>\n" +
            "                <p>年起，公司全面实施精品战略，大规模整合优势资源，与国内外房地产相关行业龙头企业强强合作, 真正实现了满屋名牌的精品产品。公司先后开发御景半岛、华府、</p>\n" +
            "                <p>名都、城、绿洲、金碧天下等系列项目500多个，先后获得100多项**殊荣，产品已经成为全国享有广泛知名度和美誉度的强势品牌。</p>";
    private String text2 = "<p><span>集团旗下建筑设计院，拥有建筑工程专业甲级，建筑装饰、幕墙、轻型钢结构、智能化、照明、消防等专项甲级设计资质。具有规划、建筑、结构、设备等专业设计</span></p>\n" +
            "                <p>人员近600人，其中一级注册建筑师、-级注册结构工程师、注册公用设备工程师等注册人员60余人。已独立承担超高层地标、商业综合体、大型居住区、酒店、饮</p>\n" +
            "                <p>食、健康、运动、娱乐、会议、高级写字楼等综合性高品质设计工程600多项,并与美国Gensler. 美国PCPA、 美国HOK、美国BCJ、 美国TT. 美国PB、美国</p>\n" +
            "                <p>AECOM、英国TFP、英国AEDAS、 英国Atkins. 英国PLP、英国Arup、香港巴马丹拿、香港许李严等国际知名企业开展紧密合作。</p>";
    private String text3 = "<p><span>商业地产，顾名思义，作为商业用途的地产， 故又名做商铺地产。以区别于以居住功能为主的住宅房地产，以工业生产功能为主的工业地产等。商业地产广义上通</span></p>\n" +
            "                <p>常指用于各种零售、批发、餐饮、娱乐、健身、休闲等经营用途的房地产形式，从经营模式、功能和用途上区别于普通住宅、公寓、别墅等房地产形式。以办公为主要</p>\n" +
            "                <p>用途的地产，属商业地产范畴，也可以单列。国外用的比较多的词汇是零售地产的概念。泛指用于零售业的地产形式，是狭义的商业地产。</p>\n" +
            "                <p><span>传统房地产开发商在商业地产领域多没有经验，急需与作为商业地产运营商这样的商业地产外脑合作。于是，中国商业地产从投资、开发、运营-把抓的形式，逐渐</span></p>\n" +
            "                <p>迈向更加科学、成熟的分工:开发者负责投资，运营商负责项目从定位、招商到开业运营的一切专业运营管理。</p>\n" +
            "                <p><span>在各大城市的核心地块用地空间逐步减少的情况下，随着新型城镇化政策的进-步贯彻和推行，城市郊区的新板块成为商业地产下- -波热点区域。这极大地推进了以</span></p>\n" +
            "                <p>目的性消费为主的郊区型零售业态的迅猛发展。比如红星美凯龙、奥特莱斯等。</p>";
    private String text4 = "    <p><span>物业酒店管理集团有限公司(以下简称物业)隶属于置业集团，注册资金5000万元人民币，物业集团在全国设有30余个分支机构，其中有5家国家-级资质物业管理</span></p>\n" +
            "                    <p>企业。物业为中国百强物业管理企业之一。在2013年中国物业管理协 会组织的全国物业企业综合实力200强评选中名列第21位。</p>\n" +
            "                    <p><span>物业较早于1996年12月在北京成立，是首批国家-级资质物业管理企业。物业依托品牌，践行央企责任,恪守规范和诚信的经营准则，以诚相携，以信立业，塑造</span></p>\n" +
            "                    <p>服务企业公信力。公司依托自有的五星级酒店，较早提出将酒店服务理念导入物业服务，成功助推旗下物业项目服务水平的飞跃,践行“让生活更美好\"的物业服务理</p>\n" +
            "                    <p>念，带给客户恒久价值体验。</p>\n" +
            "                    <p><span>经过十余载发展，物业业务已涉及住宅、商业、办公楼、城市综合体、星级商务酒店、度假酒店、文化广场等多种类型的物业经营管理服务，公司120多个项目分布</span></p>\n" +
            "                    <p>在全国20多个省市,在管面积已达2000万平方米,标志性项目包括已经获得全国物业管理示范称号的北京新大厦、上海证券大厦、 广州中信广场等商用项目和一批高端</p>\n" +
            "                    <p>住宅项目。</p>";
    private String text5 = "     <p><span>金融集团是由世界500强中国集团打造的金融产业旗舰，立足于产融结合的创新型发展模式，致力构建集银行、保险。互联网金融等多元业务为-体的全牌照金融</span></p>\n" +
            "                    <p>控股集团。金融集团是由世界500强中国集团打造的金融产业旗规，立足于产融结合的创新型发展模式，致力构建集银行、保险、互联网金融等多元业务为- 体的全牌</p>\n" +
            "                    <p>照金融控股集团。</p>\n" +
            "                    <p><span>集团旗下已拥有人寿保险有限公司、互联网金融集团、金融投资有限公司、金融资产管理有限公司，同时是盛京银行(HK.02066) 第一大股东。目前，人寿规模保</span></p>\n" +
            "                    <p>费已跻身全国寿险20强，总资产超700亿。集团旗下已拥有人寿保险有限公司、互联网金融集团、金融投资有限公司、 金融资产管理有限公司，同时是盛京银行</p>\n" +
            "                    <p>(HK.02066)第一大股东。目前，人寿规模保费已跻身全国寿险20强，总资产超700亿。</p>\n" +
            "                    <p><span>同时，已完成“互联网+”金融平台及综合社区服务平台的建设。金服(HDFAX.COM)拥有互联网支付、基金支付、预付卡、基金销售、保险经纪、保理、融资租</span></p>\n" +
            "                    <p>赁、小贷，私募基金等相关金融牌照及业务经营资质，致力于成为中国互联网金融信息平台的领军者。</p>";

    private  String text6 = " <p><span>中国中国，全球梦想。</span></p>\n" +
            "                    <p><span>中国置业作为中国中国集团唯一海外上市房企，在精耕中国的同时，积极响应国家走出去号召，先后前往澳大利亚、缅甸、斯里兰卡、西班牙、葡萄牙、 英国进行</span></p>\n" +
            "                    <p>实地考察，学习国外房地产开发先进经验，调研海外房地产市场，谋求拓展海外，布局全球。</p>\n" +
            "                    <p><span>中国置业集团2014年2月底通过投标方式获取香港启德项目，由中国置业(香港)有限公司具体负责项目运作。成功获取的香港启德项目,是公司*境外控股操盘</span></p>\n" +
            "                    <p>项目，正在进行规划设计及开工前准备，目前进展良好。</p>\n" +
            "                    <p><span>中国置业集团2014年2月底通过投标方式获取香港启德项目，由中国置业(香港)有限公司具体负责项目运作。成功获取的香港启德项目，是公司**境外控股操盘</span></p>\n" +
            "                    <p>项目，正在进行规划设计及开工前准备，目前进展良好。</p>";
    /*private String img;
    private String title;
    private String text;

    private String[] imgs = {"../img/b1.jpg"," ","../img/b2.jpg","../img/jj.jpg","../img/b4.jpg","../img/b5_8mbz.jpg"};
    private String[] titles={"地产开发"," ","商业运营","物业管理","金融服务","全球战略"};
    private String[] texts={"<div><span class=\"productLt-mid-tx\">房地产开发公司[中国-级资质]</span></div>\n" +
            "            <div>\n" +
            "                <p><span>集团旗下房地产开发公司,拥有中国一-级开发资质。 在多年的开发建设中，建立起标准化、科学化、系统化的质量管理体系，形成过程质量控制和创优机制。2004</span></p>\n" +
            "                <p>年起，公司全面实施精品战略，大规模整合优势资源，与国内外房地产相关行业龙头企业强强合作, 真正实现了满屋名牌的精品产品。公司先后开发御景半岛、华府、</p>\n" +
            "                <p>名都、城、绿洲、金碧天下等系列项目500多个，先后获得100多项**殊荣，产品已经成为全国享有广泛知名度和美誉度的强势品牌。</p>\n" +
            "            </div>",
            "<div><span class=\"productLt-mid-tx\">建筑设计院[中国甲级资质]</span></div>\n" +
                    "            <div>\n" +
                    "                <p><span>集团旗下建筑设计院，拥有建筑工程专业甲级，建筑装饰、幕墙、轻型钢结构、智能化、照明、消防等专项甲级设计资质。具有规划、建筑、结构、设备等专业设计</span></p>\n" +
                    "                <p>人员近600人，其中一级注册建筑师、-级注册结构工程师、注册公用设备工程师等注册人员60余人。已独立承担超高层地标、商业综合体、大型居住区、酒店、饮</p>\n" +
                    "                <p>食、健康、运动、娱乐、会议、高级写字楼等综合性高品质设计工程600多项,并与美国Gensler. 美国PCPA、 美国HOK、美国BCJ、 美国TT. 美国PB、美国</p>\n" +
                    "                <p>AECOM、英国TFP、英国AEDAS、 英国Atkins. 英国PLP、英国Arup、香港巴马丹拿、香港许李严等国际知名企业开展紧密合作。</p>\n" +
                    "            </div>",
            "<p><span>商业地产，顾名思义，作为商业用途的地产， 故又名做商铺地产。以区别于以居住功能为主的住宅房地产，以工业生产功能为主的工业地产等。商业地产广义上通</span></p>\n" +
                    "                <p>常指用于各种零售、批发、餐饮、娱乐、健身、休闲等经营用途的房地产形式，从经营模式、功能和用途上区别于普通住宅、公寓、别墅等房地产形式。以办公为主要</p>\n" +
                    "                <p>用途的地产，属商业地产范畴，也可以单列。国外用的比较多的词汇是零售地产的概念。泛指用于零售业的地产形式，是狭义的商业地产。</p>\n" +
                    "                <p><span>传统房地产开发商在商业地产领域多没有经验，急需与作为商业地产运营商这样的商业地产外脑合作。于是，中国商业地产从投资、开发、运营-把抓的形式，逐渐</span></p>\n" +
                    "                <p>迈向更加科学、成熟的分工:开发者负责投资，运营商负责项目从定位、招商到开业运营的一切专业运营管理。</p>\n" +
                    "                <p><span>在各大城市的核心地块用地空间逐步减少的情况下，随着新型城镇化政策的进-步贯彻和推行，城市郊区的新板块成为商业地产下- -波热点区域。这极大地推进了以</span></p>\n" +
                    "                <p>目的性消费为主的郊区型零售业态的迅猛发展。比如红星美凯龙、奥特莱斯等。</p>",
            " <p><span>物业酒店管理集团有限公司(以下简称物业)隶属于置业集团，注册资金5000万元人民币，物业集团在全国设有30余个分支机构，其中有5家国家-级资质物业管理</span></p>\n" +
                    "                    <p>企业。物业为中国百强物业管理企业之一。在2013年中国物业管理协 会组织的全国物业企业综合实力200强评选中名列第21位。</p>\n" +
                    "                    <p><span>物业较早于1996年12月在北京成立，是首批国家-级资质物业管理企业。物业依托品牌，践行央企责任,恪守规范和诚信的经营准则，以诚相携，以信立业，塑造</span></p>\n" +
                    "                    <p>服务企业公信力。公司依托自有的五星级酒店，较早提出将酒店服务理念导入物业服务，成功助推旗下物业项目服务水平的飞跃,践行“让生活更美好\"的物业服务理</p>\n" +
                    "                    <p>念，带给客户恒久价值体验。</p>\n" +
                    "                    <p><span>经过十余载发展，物业业务已涉及住宅、商业、办公楼、城市综合体、星级商务酒店、度假酒店、文化广场等多种类型的物业经营管理服务，公司120多个项目分布</span></p>\n" +
                    "                    <p>在全国20多个省市,在管面积已达2000万平方米,标志性项目包括已经获得全国物业管理示范称号的北京新大厦、上海证券大厦、 广州中信广场等商用项目和一批高端</p>\n" +
                    "                    <p>住宅项目。</p>",
            " <p><span>金融集团是由世界500强中国集团打造的金融产业旗舰，立足于产融结合的创新型发展模式，致力构建集银行、保险。互联网金融等多元业务为-体的全牌照金融</span></p>\n" +
                    "                    <p>控股集团。金融集团是由世界500强中国集团打造的金融产业旗规，立足于产融结合的创新型发展模式，致力构建集银行、保险、互联网金融等多元业务为- 体的全牌</p>\n" +
                    "                    <p>照金融控股集团。</p>\n" +
                    "                    <p><span>集团旗下已拥有人寿保险有限公司、互联网金融集团、金融投资有限公司、金融资产管理有限公司，同时是盛京银行(HK.02066) 第一大股东。目前，人寿规模保</span></p>\n" +
                    "                    <p>费已跻身全国寿险20强，总资产超700亿。集团旗下已拥有人寿保险有限公司、互联网金融集团、金融投资有限公司、 金融资产管理有限公司，同时是盛京银行</p>\n" +
                    "                    <p>(HK.02066)第一大股东。目前，人寿规模保费已跻身全国寿险20强，总资产超700亿。</p>\n" +
                    "                    <p><span>同时，已完成“互联网+”金融平台及综合社区服务平台的建设。金服(HDFAX.COM)拥有互联网支付、基金支付、预付卡、基金销售、保险经纪、保理、融资租</span></p>\n" +
                    "                    <p>赁、小贷，私募基金等相关金融牌照及业务经营资质，致力于成为中国互联网金融信息平台的领军者。</p>",
            " <p><span>中国中国，全球梦想。</span></p>\n" +
                    "                    <p><span>中国置业作为中国中国集团唯一海外上市房企，在精耕中国的同时，积极响应国家走出去号召，先后前往澳大利亚、缅甸、斯里兰卡、西班牙、葡萄牙、 英国进行</span></p>\n" +
                    "                    <p>实地考察，学习国外房地产开发先进经验，调研海外房地产市场，谋求拓展海外，布局全球。</p>\n" +
                    "                    <p><span>中国置业集团2014年2月底通过投标方式获取香港启德项目，由中国置业(香港)有限公司具体负责项目运作。成功获取的香港启德项目,是公司*境外控股操盘</span></p>\n" +
                    "                    <p>项目，正在进行规划设计及开工前准备，目前进展良好。</p>\n" +
                    "                    <p><span>中国置业集团2014年2月底通过投标方式获取香港启德项目，由中国置业(香港)有限公司具体负责项目运作。成功获取的香港启德项目，是公司**境外控股操盘</span></p>\n" +
                    "                    <p>项目，正在进行规划设计及开工前准备，目前进展良好。</p>"};


    //数据封装
    private List<ProductLayoutModel> list = new ArrayList<>();

    public List<ProductLayoutModel> getList() {
        for (int i = 0; i <imgs.length ; i++) {
            ProductLayoutModel productLayoutModel = new ProductLayoutModel();
            productLayoutModel.setImg(imgs[i]);
            productLayoutModel.setTitle(titles[i]);
            productLayoutModel.setText(texts[i]);
            list.add(productLayoutModel);
        }
        return list;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String[] getImgs() {
        return imgs;
    }

    public void setImgs(String[] imgs) {
        this.imgs = imgs;
    }

    public String[] getTitles() {
        return titles;
    }

    public void setTitles(String[] titles) {
        this.titles = titles;
    }

    public String[] getTexts() {
        return texts;
    }

    public void setTexts(String[] texts) {
        this.texts = texts;
    }*/

    public String getImg1() {
        return img1;
    }

    public String getImg2() {
        return img2;
    }

    public String getImg3() {
        return img3;
    }

    public String getImg4() {
        return img4;
    }

    public String getImg5() {
        return img5;
    }

    public String getTitle1() {
        return title1;
    }

    public String getTitle2() {
        return title2;
    }

    public String getTitle3() {
        return title3;
    }

    public String getTitle4() {
        return title4;
    }

    public String getTitle5() {
        return title5;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public String getText3() {
        return text3;
    }

    public String getText4() {
        return text4;
    }

    public String getText5() {
        return text5;
    }

    public String getText6() {
        return text6;
    }
}
