<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>新闻中心</title>
    <link rel="stylesheet" href="../css/common.css">
    <script src="../js/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="../css/index.css">
    <link rel="stylesheet" href="../css/news.css">
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
            <div>新闻中心</div>

        </div>
        <div>
            <c:forEach items="${sectionModelList}" var="model">
                <div title="${$model.id}">${model.name}</div>

            </c:forEach>
       <%--     <div>媒体聚焦</div>
            <div></div>
            <div>行业新闻</div>
            <div></div>
            <div>集团公告</div>--%>
        </div>
    </div>
</div>
<!--中间部分-->
<div class="news-mid">
    <c:forEach items="${newsList}" var="model">
        <div class="news-box">
            <div class="floatLeft">
                <img src="${model.newImg}" height="250" width="300"/>
            </div>
            <div class="news-zi">
                ${model.news}
             <%--   <div><span>[集团公告]</span>集团在藏**水电项目投产发电</div>
                <div><p>2016-09-04</p></div>
                <div>
                    <p>8月29日,电集团在藏**水电项目一西藏尼洋河多布水电站首台机组 (4号机)完成72小时试运行，正式投入商业运行。多布水电站是</p>
                    <p>尼洋河综合治理与保护控制性工程和优选项目，自治区”十二五”期间**开工并建成投产的重点内需水电项目,也是集团公司在藏**水电</p>
                    <p>项目。</p>
                </div>--%>
            </div>
        </div>
    </c:forEach>
  <%--  <div class="news-box">
        <div class="floatLeft">
            <img src="../img/1.jpg" height="250" width="300"/></div>
        <div class="news-zi">
            <div><span>[集团公告]</span>集团在藏**水电项目投产发电</div>
            <div><p>2016-09-04</p></div>
            <div>
                <p>8月29日,电集团在藏**水电项目一西藏尼洋河多布水电站首台机组 (4号机)完成72小时试运行，正式投入商业运行。多布水电站是</p>
                <p>尼洋河综合治理与保护控制性工程和优选项目，自治区”十二五”期间**开工并建成投产的重点内需水电项目,也是集团公司在藏**水电</p>
                <p>项目。</p>
            </div>
        </div>
    </div>
    <div class="news-box">
        <div class="floatLeft">
            <img src="../img/1.jpg" height="250" width="300"/></div>
        <div class="news-zi">
            <div><span>[集团公告]</span>集团在藏**水电项目投产发电</div>
            <div><p>2016-09-04</p></div>
            <div>
                <p>8月29日,电集团在藏**水电项目一西藏尼洋河多布水电站首台机组 (4号机)完成72小时试运行，正式投入商业运行。多布水电站是</p>
                <p>尼洋河综合治理与保护控制性工程和优选项目，自治区”十二五”期间**开工并建成投产的重点内需水电项目,也是集团公司在藏**水电</p>
                <p>项目。</p>
            </div>
        </div>
    </div>
    <div class="news-box">
        <div class="floatLeft">
            <img src="../img/1.jpg" height="250" width="300"/></div>
        <div class="news-zi">
            <div><span>[集团公告]</span>集团在藏**水电项目投产发电</div>
            <div><p>2016-09-04</p></div>
            <div>
                <p>8月29日,电集团在藏**水电项目一西藏尼洋河多布水电站首台机组 (4号机)完成72小时试运行，正式投入商业运行。多布水电站是</p>
                <p>尼洋河综合治理与保护控制性工程和优选项目，自治区”十二五”期间**开工并建成投产的重点内需水电项目,也是集团公司在藏**水电</p>
                <p>项目。</p>
            </div>
        </div>
    </div>
    <div class="news-box">
        <div class="floatLeft">
            <img src="../img/1.jpg" height="250" width="300"/></div>
        <div class="news-zi">
            <div><span>[集团公告]</span>集团在藏**水电项目投产发电</div>
            <div><p>2016-09-04</p></div>
            <div>
                <p>8月29日,电集团在藏**水电项目一西藏尼洋河多布水电站首台机组 (4号机)完成72小时试运行，正式投入商业运行。多布水电站是</p>
                <p>尼洋河综合治理与保护控制性工程和优选项目，自治区”十二五”期间**开工并建成投产的重点内需水电项目,也是集团公司在藏**水电</p>
                <p>项目。</p>
            </div>
        </div>
    </div>--%>
    <!--分页-->
    <div class="news-page">
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
