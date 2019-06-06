<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="top.jsp"/>
<section id="content" class="table-layout animated fadeIn">
    <div class="tray tray-center">
        <div class="content-header">
            <h2> 停车费 </h2>
            <p class="lead"></p>
        </div>
        <div class="admin-form theme-primary mw1000 center-block" style="padding-bottom: 175px;">
            <div class="panel heading-border">
                <form:form action="/parkInfo/update" modelAttribute="parkInfo" id="admin-form" name="addForm">
                    <div class="panel-body bg-light">
                        <div class="section-divider mt20 mb40">
                            <span> 费用信息 </span>
                        </div>

                        <div class="section row">
                            <form:hidden path="id"/>
                            <form:hidden path="parkSpaceId"/>
                            <div class="col-md-6">
                                <label for="parkIn" class="field-label text-muted fs18 mb10">进入时间</label>
                                <label for="parkIn" class="field prepend-icon">
                                    <form:input path="parkIn" cssClass="gui-input"  readonly="true" placeholder="车位号..."/>
                                    <label for="parkIn" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>

                            <div class="col-md-6">
                                <label for="parkOut" class="field-label text-muted fs18 mb10">离开时间</label>
                                <label for="parkOut" class="field prepend-icon">
                                    <form:input path="parkOut" cssClass="gui-input"  readonly="true" placeholder="车位号..."/>
                                    <label for="parkIn" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>

                        </div>

                        <div class="section row">

                            <div class="col-md-6">
                                <label for="carId" class="field-label text-muted fs18 mb10">车牌</label>
                                <label for="carId" class="field prepend-icon">
                                    <form:input path="carId" cssClass="gui-input"  readonly="true"/>
                                    <label for="carId" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>

                            <div class="col-md-6">
                                <label for="fee" class="field-label text-muted fs18 mb10">停车费</label>
                                <label for="fee" class="field prepend-icon">
                                    <form:input path="fee" cssClass="gui-input"  readonly="true" placeholder="车位号..."/>
                                    <label for="fee" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>



                        </div>


                        <div class="panel-footer text-right">
                            <button type="submit" class="button"> 提交</button>
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
