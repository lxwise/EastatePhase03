<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>产品布局</title>
    <script src="../js/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="../css/common.css">
    <link rel="stylesheet" href="../css/productLayout.css">
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
            <div>产业布局</div>
        </div>
        <div>
            <!--<div>集团简介</div>
            <div>集团荣誉</div>
            <div>发展历程</div>
            <div>核心优势</div>
            <div>企业文化</div>-->
        </div>
    </div>
</div>
<!--中间部分-->
<div class="productLt-mid">
    <!--图片-->
    <div>
       <%-- <div><img src="../img/b1.jpg"/></div>--%>
           <div><img src="${productLayoutModel.img1}"/></div>
    </div>
    <!--文字-->
    <div class="productLt-zi">${productLayoutModel.title1}</div>
    <div>
        <div>
            <div><span class="productLt-mid-tx">房地产开发公司[中国-级资质]</span></div>
            <div>
                ${productLayoutModel.text1}
            </div>
        </div>
        <div>
            <div><span class="productLt-mid-tx">建筑设计院[中国甲级资质]</span></div>
            <div>
                ${productLayoutModel.text2}
            </div>
        </div>
    </div>
    <!--图片-->
    <div>
        <div><img src="${productLayoutModel.img2}"/></div>
    </div>
    <!--文字-->
    <div class="productLt-zi">${productLayoutModel.title2}</div>
    <div>
        <div>
            <div><span class="productLt-mid-tx"></span></div>
            <div>
                ${productLayoutModel.text3}
            </div>
        </div>
    </div>
    <div c>
        <!--图片-->
        <div>
            <div><img src="${productLayoutModel.img3}"/></div>
        </div>
        <!--文字-->
        <div class="productLt-zi">${productLayoutModel.title3}</div>
        <div>
            <div>
                <div><span class="productLt-mid-tx"></span></div>
                <div>
                    ${productLayoutModel.text4}
                </div>
            </div>
        </div>
        <!--图片-->
        <div>
            <div><img src="${productLayoutModel.img4}"/></div>
        </div>
        <!--文字-->
        <div class="productLt-zi">${productLayoutModel.title4}</div>
        <div>
            <div>
                <div><span class="productLt-mid-tx"></span></div>
                <div>
                    ${productLayoutModel.text5}
                </div>
            </div>
        </div>
        <!--图片-->
        <div>
            <div><img src="${productLayoutModel.img5}"/></div>
        </div>
        <!--文字-->
        <div class="productLt-zi">${productLayoutModel.title5}</div>
        <div>
            <div>
                <div><span class="productLt-mid-tx"></span></div>
                <div>
                    ${productLayoutModel.text6}
                </div>
            </div>
        </div>
    </div>

</div>
<!--尾部分-->
<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>

