<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>联系我们</title>
    <link rel="stylesheet" href="../css/common.css">
    <script src="../js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="//api.map.baidu.com/api?v=2.0&ak=yK9gvz3np1wD07tuAnoGG99F52GsPnAj"></script>
    <link rel="stylesheet" href="../css/index.css">
    <link rel="stylesheet" href="../css/employee.css">
    <link rel="stylesheet" href="../css/callUs.css">
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
            <c:forEach items="${callUsModelList}" var="model">
                <div title="${$model.id}">${model.name}</div>

            </c:forEach>
           <%-- <div>集团简介</div>
            <div>集团荣誉</div>
            <div>发展历程</div>
            <div>核心优势</div>
            <div>企业文化</div>--%>
        </div>
    </div>
</div>
<!--中间部分-->
<div class="callus-content">
    <div id="ditu" class="ditu"></div>
    <div>
        <c:forEach items="${callimgList}" var="model">
            <div><img src="${model.img}" height="80" width="80"/></div>
        </c:forEach>
       <%-- <div><img src="../img/location.png" height="80" width="80"/></div>
        <div><img src="../img/call.png" height="80" width="80"/></div>
        <div><img src="../img/message.png" height="80" width="80"/></div>--%>
    </div>
    <div>
        <div>${callUsModel.adr}</div>
        <div>客服中心:${callUsModel.phone}
            <p>邮箱:${callUsModel.email}</p>
        </div>
        <div>邮箱:${callUsModel.email}</div>
    </div>
        <%--<div>四川省成都市孵化园</div>--%>
        <%--<div>客服中心: 028-00000000--%>
            <%--<p>邮箱:admin@163.com</p>--%>
        <%--</div>--%>
        <%--<div>邮箱:admin@163.com</div>--%>
    <%--</div>--%>
</div>
<!--尾部分-->
<jsp:include page="foot.jsp"></jsp:include>
</div>
<script type="text/javascript">

    // var map = new BMap.Map("ditu");    // 创建Map实例
    // map.centerAndZoom(new BMap.Point(104.066284, 30.579038), 11);  // 初始化地图,设置中心点坐标和地图级别
    // //添加地图类型控件
    // map.addControl(new BMap.MapTypeControl({
    //     mapTypes: [
    //         BMAP_NORMAL_MAP,
    //         BMAP_HYBRID_MAP
    //     ]
    // }));
    // map.setCurrentCity("成都");          // 设置地图显示的城市 此项是必须设置的
    // map.enableScrollWheelZoom(true);     //开启鼠标滚轮缩放
    // map.centerAndZoom("孵化园", 15);      // 初始化地图,用城市名设置地图中心点
    // var top_left_control = new BMap.ScaleControl({anchor: BMAP_ANCHOR_TOP_LEFT});// 左上角，添加比例尺
    // var top_left_navigation = new BMap.NavigationControl();  //左上角，添加默认缩放平移控件
    // var top_right_navigation = new BMap.NavigationControl({
    //     anchor: BMAP_ANCHOR_TOP_RIGHT,
    //     type: BMAP_NAVIGATION_CONTROL_SMALL
    // }); //右上角，仅包含平移和缩放按钮
    // /*缩放控件type有四种类型:
    // BMAP_NAVIGATION_CONTROL_SMALL：仅包含平移和缩放按钮；BMAP_NAVIGATION_CONTROL_PAN:仅包含平移按钮；BMAP_NAVIGATION_CONTROL_ZOOM：仅包含缩放按钮*/
    //
    // //添加控件和比例尺
    // map.addControl(top_left_control);
    // map.addControl(top_left_navigation);
    // map.addControl(top_right_navigation);

    // 百度地图API功能
    var map = new BMap.Map("ditu");// 创建Map实例
    var point = new BMap.Point(104.0664031000,30.5793108400);// 初始化地图,设置中心点坐标和地图级别
    map.centerAndZoom(point, 20);
    map.enableScrollWheelZoom(true);     //开启鼠标滚轮缩放
    var opts1 = {offset: new BMap.Size(100, 5)}
    //var opts2 = { offset: new BMap.Size(260, 100) }
    map.addControl(new BMap.NavigationControl());
    map.addControl(new BMap.ScaleControl(opts1));
    map.addControl(new BMap.GeolocationControl());
    var marker = new BMap.Marker(point); // 创建标注
    map.addOverlay(marker);    // 将标注添加到地图中
    var companyName = {
        width: 80,     // 信息窗口宽度
        height: 30,     // 信息窗口高度
        title: "万息科技"  // 信息窗口标题
    }
    var infoWindow = new BMap.InfoWindow("万息科技", companyName);  // 创建信息窗口对象
    map.openInfoWindow(infoWindow, map.getCenter());      // 打开信息窗口
</script>
</body>

</html>
