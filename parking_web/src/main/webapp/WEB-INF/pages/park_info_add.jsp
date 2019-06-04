<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="top.jsp"/>
<section id="content" class="table-layout animated fadeIn">
    <div class="tray tray-center">
        <div class="content-header">
            <h2> 添加车位 </h2>
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
                                <label for="spaceId" class="field prepend-icon">
                                    <form:input path="cardId" cssClass="gui-input" placeholder="卡号..."/>
                                    <label for="spaceId" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>

                            <div class="col-md-6">
                                <label for="spaceId" class="field prepend-icon">
                                    <form:input path="spaceId" cssClass="gui-input" placeholder="车位号..."/>
                                    <label for="spaceId" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>

                        </div>

                        <div class="section row">

                            <div class="col-md-6">
                                <label for="spaceId" class="field prepend-icon">
                                    <form:input path="carId" cssClass="gui-input" placeholder="车牌..."/>
                                    <label for="spaceId" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>

                            <div class="col-md-6">
                                <label for="parkIn" class="field prepend-icon">
                                    <input type="datetime-local" id="parkIn"
                                           value="<fmt:formatDate value="${parkIn}" pattern="yyyy-MM-dd"/>"
                                           name="parkIn" cssClass="gui-input" placeholder="进入时间..."/>
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
