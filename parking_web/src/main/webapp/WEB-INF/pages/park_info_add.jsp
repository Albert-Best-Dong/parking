<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<jsp:include page="top.jsp"/>
<section id="content" class="table-layout animated fadeIn">
    <div class="tray tray-center">
        <div class="content-header">
            <h2> 添加停车信息 </h2>
            <p class="lead"></p>
        </div>
        <div class="admin-form theme-primary mw1000 center-block" style="padding-bottom: 175px;">
            <div class="panel heading-border">
                <form:form action="/parkInfo/add" modelAttribute="parkInfo" id="admin-form" name="addForm">
                    <div class="panel-body bg-light">
                        <div class="section-divider mt20 mb40">
                            <span> 基本信息 </span>
                        </div>

                        <div class="section row">

                            <div class="col-md-6">
                                <label for="cardId" class="field-label text-muted fs18 mb10">卡号</label>
                                <label for="cardId" class="field prepend-icon">
                                    <form:input path="cardId" cssClass="gui-input"/>
                                    <label for="cardId" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>


                            <div class="col-md-6">
                                <label for="parkSpaceId" class="field-label text-muted fs18 mb10">停车位</label>
                                <label for="parkSpaceId" class="field select">
                                    <form:select  path="parkSpaceId" cssClass="gui-input" placeholder="请选择楼层...">
                                        <c:forEach items="${pslist}" var="ps">
                                            <form:option value="${ps.id}">${ps.floor}&nbsp;${ps.area}&nbsp;${ps.spaceId}</form:option>
                                        </c:forEach>

                                    </form:select>
                                    <i class="arrow double"></i>
                                </label>
                            </div>

                        </div>

                        <div class="section row">

                            <div class="col-md-6">
                                <label for="carId" class="field-label text-muted fs18 mb10">车牌号</label>
                                <label for="carId" class="field prepend-icon">
                                    <form:input path="carId" cssClass="gui-input" placeholder="车牌..."/>
                                    <label for="carId" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>

                            <div class="col-md-6">
                                <label for="parkIn" class="field-label text-muted fs18 mb10">进入时间</label>
                                <label for="parkIn" class="field prepend-icon">
                                    <form:input path="parkIn"
                                           value=""
                                           name="parkIn" class="gui-input" placeholder="进入时间..."/>
                                    <label for="parkIn" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>

                        </div>

                        <div class="panel-footer text-right">
                            <button type="submit" class="button"> 保存</button>
                            <button type="button" class="button" onclick="javascript:window.history.go(-1);"> 返回
                            </button>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</section>

<jsp:include page="bottom.jsp"/>

<script type="text/javascript">
    window.onload=function () {

        document.getElementById("parkIn").value = getParkIn();
    }
    function getParkIn(){
        var parkIn=new Date();

        return dateFtt("yyyy-MM-dd hh:mm:ss",parkIn);
    }


    /**************************************时间格式化处理************************************/
    function dateFtt(fmt,date)
    { //author: meizz
        var o = {
            "M+" : date.getMonth()+1,                 //月份
            "d+" : date.getDate(),                    //日
            "h+" : date.getHours(),                   //小时
            "m+" : date.getMinutes(),                 //分
            "s+" : date.getSeconds(),                 //秒
            "q+" : Math.floor((date.getMonth()+3)/3), //季度
            "S"  : date.getMilliseconds()             //毫秒
        };
        if(/(y+)/.test(fmt))
            fmt=fmt.replace(RegExp.$1, (date.getFullYear()+"").substr(4 - RegExp.$1.length));
        for(var k in o)
            if(new RegExp("("+ k +")").test(fmt))
                fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
        return fmt;
    }
</script>