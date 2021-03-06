<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>公司荣誉</title>
    <link rel="stylesheet" href="../css/common.css">
    <script src="../js/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="../css/companyInfo.css">
    <link rel="stylesheet" href="../css/companyHonor.css">
    <link rel="stylesheet" href="../css/lunbo3D.css">
    <script src="../js/lunbo3D.js"></script>

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
            <div>集团概况</div>
            <div>◎</div>
            <div>集团简介</div>
        </div>
        <div>
            <c:forEach items="${listInfo}" var="model">
                <div title="${$model.id}">${model.name}</div>
            </c:forEach>
          <%--  <div>集团简介</div>
            <div>集团荣誉</div>
            <div>发展历程</div>
            <div>核心优势</div>
            <div>企业文化</div>--%>
        </div>
    </div>
</div>
<!--中间部分-->
<div class="container">
    <div class="carouse" id="carouse">
        <div class="pic1"><img src="${companyHonorModel.imgHonor}" height="175" width="252"/></div>
        <div class="pic2"><img src="${companyHonorModel.imgHonor}" height="175" width="252"/></div>
        <div class="pic3"><img src="${companyHonorModel.imgHonor}" height="175" width="252"/></div>
        <div class="pic4"><img src="${companyHonorModel.imgHonor}" height="175" width="252"/></div>
        <div class="pic5"><img src="${companyHonorModel.imgHonor}" height="175" width="252"/></div>
        <div class="pic6"><img src="${companyHonorModel.imgHonor}" height="175" width="252"/></div>
        <div class="pic7"><img src="${companyHonorModel.imgHonor}" height="175" width="252"/></div>
        <div class="pic8"><img src="${companyHonorModel.imgHonor}" height="175" width="252"/></div>
        <div class="pic9"><img src="${companyHonorModel.imgHonor}" height="175" width="252"/></div>
        <%--<div class="pic1"><img src="../img/5.jpg" height="175" width="252"/></div>
        <div class="pic2"><img src="../img/5.jpg" height="175" width="252"/></div>
        <div class="pic3"><img src="../img/5.jpg" height="175" width="252"/></div>
        <div class="pic4"><img src="../img/5.jpg" height="175" width="252"/></div>
        <div class="pic5"><img src="../img/5.jpg" height="175" width="252"/></div>
        <div class="pic6"><img src="../img/5.jpg" height="175" width="252"/></div>
        <div class="pic7"><img src="../img/5.jpg" height="175" width="252"/></div>
        <div class="pic8"><img src="../img/5.jpg" height="175" width="252"/></div>
        <div class="pic9"><img src="../img/5.jpg" height="175" width="252"/></div>--%>
    </div>
</div>
<div class="btn-group">
    <button id="prev">上一个</button>
    <button id="next">下一个</button>
</div>
<!--尾部分-->
<jsp:include page="foot.jsp"></jsp:include>
</div>
<script>
    var prevBut = document.getElementById("prev");
    var nextBut = document.getElementById("next");
    var carouse = document.getElementsByClassName("carouse")
    var state = 1;  //id的变化状态

    prevBut.addEventListener("click",function() {
        prev();
    }) ;

    nextBut.addEventListener("click",function() {
        next();
    }) ;



    function prev(){
        if( state == 1||state == 21){
            state = 29;
            carouse.item(0).id = 'carouse'+state;
        }else if(state == 2||state == 22){
            state = 21;
            carouse.item(0).id = 'carouse'+state;
        }else if(state == 3 || state == 23){
            state = 22;
            carouse.item(0).id = 'carouse'+state;
        }else if(state == 4 || state == 24){
            state = 23;
            carouse.item(0).id = 'carouse'+state;
        }else if(state == 5||state == 25){
            state = 24;
            carouse.item(0).id = 'carouse'+state;
        }else if(state == 6 || state == 26){
            state = 25;
            carouse.item(0).id = 'carouse'+state;
        }else if(state == 7 || state == 27){
            state = 26;
            carouse.item(0).id = 'carouse'+state;
        }else if(state == 8||state == 28){
            state = 27;
            carouse.item(0).id = 'carouse'+state;
        }else if(state == 9 || state == 29){
            state = 28;
            carouse.item(0).id = 'carouse'+state;
        }else if(state == 10 || state == 30){
            state = 29;
            carouse.item(0).id = 'carouse'+state;
        }
    }

    function next() {
        if( state == 1||state == 21){
            state = 1;
            carouse.item(0).id = 'carouse'+state;
            state++;
        }else if(state == 2||state == 22){
            state = 2;
            carouse.item(0).id = 'carouse'+state;
            state++;
        }else if(state == 3 || state == 23){
            state = 3;
            carouse.item(0).id = 'carouse'+state;
            state++;
        }else if(state == 4 || state == 24){
            state = 4;
            carouse.item(0).id = 'carouse'+state;
            state++;
        }else if(state == 5||state == 25){
            state = 5;
            carouse.item(0).id = 'carouse'+state;
            state++;
        }else if(state == 6 || state == 26){
            state = 6;
            carouse.item(0).id = 'carouse'+state;
            state++;
        }else if(state == 7 || state == 27){
            state = 7;
            carouse.item(0).id = 'carouse'+state;
            state++;
        }else if(state == 8||state == 28){
            state = 8;
            carouse.item(0).id = 'carouse'+state;
            state++;
        }else if(state == 9 || state == 29){
            state = 9;
            carouse.item(0).id = 'carouse'+state;
            state++;
        }else if(state == 10 || state == 30){
            state = 1;
            carouse.item(0).id = 'carouse'+state;
        }
    }
</script>
</body>
</html>