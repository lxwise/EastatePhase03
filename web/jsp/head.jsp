<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div class="index-head" id="headHtml">
    <!--公司信息logo-->
    <div class="index-logo">
        <div><img src="${companyModel.logo}" height="64" width="64"/></div>
        <div>${companyModel.name}</div>
    </div>
    <div class="index-hr"></div>
    <!--公司导航-->
    <div class="index-nav">

        <ul>
         <c:forEach var="model" items="${navModelList}">
             <a href="${model.href}"><li>${model.name}</li></a>
         </c:forEach>
            <%--<a href="index.html"><li>网站首页</li></a>
            <a href="company.html"><li>集团概况</li></a>
            <a href="productLayout.html"><li>产业布局</li></a>
            <a href="productCase.html"><li>精品楼盘</li></a>
            <a href="news.html"><li>新闻中心</li></a>
            <a href="employee.html"><li>人力资源</li></a>
            <a href="callUs.html" ><li>联系我们</li></a>--%>
        </ul>
    </div>
</div>
</body>
</html>
