<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>集团概况</title>
    <link rel="stylesheet" href="../css/common.css">
    <script src="../js/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="../css/company.css">

</head>
<body>
<!--头部分-->
<jsp:include page="head.jsp"></jsp:include>
<!--中间部分-->
<div class="company-mid">
    <!--广告-->
    <div class="company-mid-ad">
        <div>
            <div>网站首页</div>
            <div>◎</div>
            <div>集团概况</div>
        </div>
        <div>
            <!-- <div>集团简介</div>
             <div>集团荣誉</div>
             <div>发展历程</div>
             <div>核心优势</div>
             <div>企业文化</div>-->
        </div>
    </div>
    <!--公司简介-->
    <div class="mid-company-info">
        <div>
            <c:forEach items="${infoModelList}" var="model">
                <div><img src="${model.img}" height="90" width="90"/></div>
            </c:forEach>
         <%--   <div><img src="../img/k1.png" height="90" width="90"/></div>
            <div><img src="../img/k2.png" height="90" width="90"/></div>
            <div><img src="../img/k3.png" height="90" width="90"/></div>
            <div><img src="../img/k4.png" height="90" width="90"/></div>
            <div><img src="../img/k5.png" height="90" width="90"/></div>--%>
        </div>
        <div>
            <c:forEach items="${infoModelList}" var="model">
                <div><a href="${model.heaf}">${model.info}</a></div>
            </c:forEach>
       <%--     <div>集团简介</div>
            <div>集团荣誉</div>
            <div>发展历程</div>
            <div>核心优势</div>
            <div>企业文化</div>--%>
        </div>
        <div>
            <c:forEach items="${infoModelList}" var="model">
                <div>
                        ${model.infoText}
                </div>
            </c:forEach>
         <%--   <div>集地产、金融、健康、旅游及体育<p>
                为--体的世界500强企业集团</p>
            </div>

            <div>  致力于打造中国老百姓:负担得起的<p>
                高性价比精品住宅</p>
            </div>
            <div>到2020年，将实现总资产超3万<p>
                亿、年销售规模超6000亿。</p>
            </div>
            <div>行标准化运营模式，集团总部通过<p>
                紧密型集团化管理</p>
            </div>
            <div>以诚信为核心的企业文化将伴随铸<p>
                造百年的全过程。</p>
            </div>--%>
        </div>
    </div>
</div>
</div>
<!--尾部分-->
<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>
