<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>产品案例</title>
    <link rel="stylesheet" href="../css/common.css">
    <script src="../js/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="../css/index.css">
    <link rel="stylesheet" href="../css/productCase.css">

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
            <div>精品楼盘</div>

        </div>
        <div>
            <c:forEach items="${caseModelList}" var="model">
                <div title="${model.id}">${model.name}</div>
            </c:forEach>
     <%--       <div title="">集团简介</div>
            <div>集团荣誉</div>
            <div>发展历程</div>
            <div>核心优势</div>
            <div>企业文化</div>--%>
        </div>
    </div>
</div>
<!--中间部分-->
<div class="product-case-mid">
    <!--案例简介-->
    <div class="product-case-mid-info">
        <div>
            <c:forEach items="${caseList}" var="model">
                <div><img src="${model.img}" height="600" width="960"/></div>
            </c:forEach>
            <%--<div><img src="../img/1.jpg" height="600" width="960"/></div>--%>
            <%--<div><img src="../img/2.jpg" height="600" width="960"/></div>--%>
            <%--<div><img src="../img/3.jpg" height="600" width="960"/></div>--%>
        </div>
        <div>
            <c:forEach items="${caseList}" var="model">
                <div>${model.title}"</div>
            </c:forEach>
           <%-- <div>绿城深蓝中心</div>
            <div>御海首府</div>
            <div>天泰阳光水岸</div>--%>
        </div>
        <div>
            <c:forEach items="${caseList}" var="model">
                <div>
                        ${model.info}
                </div>
            </c:forEach>
            <%--<div>水电规划设计，是中国电建集团的核心业务板块之一，<p>
                承担了我国80%以上河流及水电站的规划设计</p>
            </div>
            <div>电力系统中各种电压的变电所及输配电线路组成的整<p>
                体，称为电力网，简称电网。</p>
            </div>
            <div>大亚湾核电站是中国大陆第一-座大型商用核电站,也是<p>
                大陆首座使用国外技术和资金建设的核电站。。</p>
            </div>--%>
        </div>
    </div>
    <!--案例简介-->
    <div class="product-case-mid-info">
        <div>
            <c:forEach items="${caseList}" var="model">
                <div><img src="${model.img}" height="600" width="960"/></div>
            </c:forEach>
            <%--<div><img src="../img/1.jpg" height="600" width="960"/></div>--%>
            <%--<div><img src="../img/2.jpg" height="600" width="960"/></div>--%>
            <%--<div><img src="../img/3.jpg" height="600" width="960"/></div>--%>
        </div>
        <div>
            <c:forEach items="${caseList}" var="model">
                <div>${model.title}"</div>
            </c:forEach>
            <%-- <div>绿城深蓝中心</div>
             <div>御海首府</div>
             <div>天泰阳光水岸</div>--%>
        </div>
        <div>
            <c:forEach items="${caseList}" var="model">
                <div>
                        ${model.info}
                </div>
            </c:forEach>
            <%--<div>水电规划设计，是中国电建集团的核心业务板块之一，<p>
                承担了我国80%以上河流及水电站的规划设计</p>
            </div>
            <div>电力系统中各种电压的变电所及输配电线路组成的整<p>
                体，称为电力网，简称电网。</p>
            </div>
            <div>大亚湾核电站是中国大陆第一-座大型商用核电站,也是<p>
                大陆首座使用国外技术和资金建设的核电站。。</p>
            </div>--%>
        </div>
    </div>

    <div class="product-case-mid-page">
        <!--分页-->
        <div class="page-icon">
            <span class="page-disabled"><i></i>上一页</span>
            <span class="page-current">1</span>
            <a href="#">2</a>
            <a href="#">3</a>
            <a href="#">4</a>
            <a href="#">5</a>
            <a href="#">6</a>
            <a href="#">7</a>
            ……
            <a href="#">199</a>
            <a href="#">200</a>
            <a class="page-next" href="#">下一页<i></i></a>
        </div>
    </div>
</div>
<!--尾部分-->
<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>