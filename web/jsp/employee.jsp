<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>人力资源</title>
    <link rel="stylesheet" href="../css/common.css">
    <script src="../js/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="../css/index.css">
    <link rel="stylesheet" href="../css/employee.css">
</head>
<body>
<!--头部分-->
<jsp:include page="head.jsp"></jsp:include>

<!--广告-->
<div class="company-mid">

    <div class="company-mid-ad">
        <div>
            <div>网站首页</div>
            <div>◎</div>
            <div>联系我们</div>

        </div>
        <div>
            <!-- <div>集团简介</div>
             <div>集团荣誉</div>
             <div>发展历程</div>
             <div>核心优势</div>
             <div>企业文化</div>-->
        </div>
    </div>
</div>
<!--中间部分-->
<!--公司简介-->
<div class="employee-mid">
    <div class="mid-company-info">
        <div>
            <c:forEach items="${cpList}" var="model">
                <div><img src="${model.cpImg}" height="90" width="90"/></div>
            </c:forEach>
            <%--    <div><img src="../img/r1.png" height="90" width="90"/></div>
                <div><img src="../img/r2.png" height="90" width="90"/></div>
                <div><img src="../img/r3.png" height="90" width="90"/></div>
                <div><img src="../img/r4.png" height="90" width="90"/></div>--%>
        </div>
        <div>
            <c:forEach items="${cpList}" var="model">
                <div>${model.cpInfo}</div>
            </c:forEach>
            <%--   <div>人才理念</div>
               <div>人员队伍</div>
               <div>员工培训</div>
               <div>人才招聘</div>--%>
        </div>
        <div>
            <c:forEach items="${cpList}" var="model">
                <div>${model.cpInfo1}
                </div>
            </c:forEach>
            <%-- <div>以才立，业以才兴。人才是企业发<p>
                 展的根本是发展的第一生产力。</p>
             </div>
             <div>人才是一条理性的河流，哪里有谷<p>
                 地，就向哪里汇聚。</p>
             </div>
             <div>人才是企业发展的根本，是推动企<p>
                 业跨越式发展的第一生产力。</p>
             </div>
             <div>完善人才队伍的结构和水平，保持<p>
                 组织的激情与活力。</p>
             </div>--%>
        </div>
     <%--   <div>
            <div><img src="../img/r1.png" height="90" width="90"/></div>
            <div><img src="../img/r2.png" height="90" width="90"/></div>
            <div><img src="../img/r3.png" height="90" width="90"/></div>
            <div><img src="../img/r4.png" height="90" width="90"/></div>
        </div>
        <div>
            <div>人才理念</div>
            <div>人员队伍</div>
            <div>员工培训</div>
            <div>人才招聘</div>
        </div>
        <div>
            <div>以才立，业以才兴。人才是企业发<p>
                展的根本是发展的第一生产力。</p>
            </div>
            <div>人才是一条理性的河流，哪里有谷<p>
                地，就向哪里汇聚。</p>
            </div>
            <div>人才是企业发展的根本，是推动企<p>
                业跨越式发展的第一生产力。</p>
            </div>
            <div>完善人才队伍的结构和水平，保持<p>
                组织的激情与活力。</p>
            </div>
        </div>--%>
    </div>
</div>
<!--尾部分-->
<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>
