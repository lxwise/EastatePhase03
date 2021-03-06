<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>公司简介</title>
    <link rel="stylesheet" href="../css/common.css">
    <script src="../js/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="../css/companyInfo.css">

</head>
<body>
<!--头部分-->
<!--头部分-->
<jsp:include page="head.jsp"></jsp:include>

<!--广告-->
<div class="company-mid">

    <div class="company-mid-ad">
        <div>
            <div>网站首页</div>
            <div>◎</div>
            <div>集团概况</div>
            <div>◎</div>
            <div>集团简介</div>
        </div>
        <div>
            <c:forEach items="${listInfo}" var="model">
                <div title="${$model.id}">${model.name}</div>

            </c:forEach>
            <%--<div>集团简介</div>--%>
            <%--<div>集团荣誉</div>--%>
            <%--<div>发展历程</div>--%>
            <%--<div>核心优势</div>--%>
            <%--<div>企业文化</div>--%>
        </div>
    </div>
</div>
<!--中间部分-->
<div class="companyInfo-mid">
    <!--图片-->
    <div>
        <%--<div><img src="${companyInfoModel.InfoImg}"/></div>--%>
        <div><img src="../img/b2.jpg"/></div>
    </div>
    <!--文字-->
   <div>
     <%--  <c:forEach items="${textList}" var="model">
           ${model.textInfo}
       </c:forEach>--%>
       <div>
           <div><span class="companyInfo-mid-tx">房地产开发公司[中国-级资质]</span></div>
           <div>
               ${companyInfoModel.textInfo1}
               <%--<p><span>集团旗下房地产开发公司,拥有中国一级开发资质。在多年的开发建设中，建立起标准化、科学化、系统化的质量管理体系,形成过程质量控制和创优机</span></p>
               <p> 制。2004年起，公司全面实施精品战略，大规模整合优势资源，与国内外房地产相关行业龙头企业强强合作，真正实现了满屋名牌的精品产品。公司先后开发</p>
               <p>御景半岛、华府、名都、城、绿洲、金碧天下等系列项目500多个,先后获得100多项**殊荣，产品已经成为全国享有广泛知名度和美誉度的强势品牌。</p>--%>
           </div>
       </div>
       <div>
           <div><span class="companyInfo-mid-tx">建筑设计院【中国甲级资质】</span></div>
           <div>
               ${companyInfoModel.textInfo2}
              <%-- <p><span>集团旗下建筑设计院，拥有建筑工程专业甲级，建筑装饰、幕墙、轻型钢结构、智能化、照明、消防等项甲级设计资质。具有规划、建筑、结构、设备等</span></p>
               <p> 专业设计人员近600人，其中一级注册建筑师、一级注册结构工程师、注册公用设备工程师等注册人员60余人。已独立承担超高层地标、商业综合体、大型居住</p>
               <p>区、酒店、饮食、健康、运动、娱乐、会议、高级写字楼等综合性高品质设计工程600多项，并与美国Gensler、美国PCPA、美国HOK、美国BCJ、美国TT、</p>
               <p>美国PB、美国AECOM、英国TFP、英国AEDAS、英国Atkins、英国PLP、英国Arup、香港巴马丹拿、香港许李严等国际知名企业开展紧密合作。</p>--%>
           </div>
       </div>
       <div>
           <div><span class="companyInfo-mid-tx">建筑工程公司[中国特级资质]</span></div>
           <div>
               ${companyInfoModel.textInfo3}
        <%--       <p><span>集团旗下的建筑工程公司,拥有房屋建筑施工总承包特级资质、市政公用工程施工总承包-级资质，已形成了集建筑施工、市政工程、装饰装修和园林古建</span></p>
               <p> 筑施工等多种资质为- -体的经济实体。公司拥有一支综合能力过硬的专业化队伍，现有专业技术人员5000余人，其中一级注册建造师、注册造价师300余人,</p>
               <p>具有中、高级职称的1000余人。可承担各类I业与民用建筑、高层建筑、设备安装、市政、高级装饰装修等工程。</p>--%>
           </div>
       </div>
   </div>

    <!--轮播-->
    <div class="companyInfo-mid-img">
        <c:forEach items="${imgInfoList}" var="model">
            <img src="${model.imgInfo}" height="600" width="960"/>
        </c:forEach>
      <%--  <img src="../img/1.jpg" height="600" width="960"/>
        <img src="../img/2.jpg" height="600" width="960"/>
        <img src="../img/3.jpg" height="600" width="960"/>
        <img src="../img/4.jpg" height="600" width="960"/>--%>
    </div>
</div>

<!--尾部分-->
<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>
