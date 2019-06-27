<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="top.jsp"/>

<section id="content" class="table-layout animated fadeIn">
    <div class="tray tray-center">
        <div class="content-header">
            <h2> 车位列表 </h2>
            <p class="lead"></p>
        </div>
        <div class="admin-form theme-primary mw1000 center-block" style="padding-bottom: 175px;">
            <div class="panel  heading-border">
                <div class="panel-menu">
                    <div class="row">
                        <div class="hidden-xs hidden-sm col-md-3">
                            <div class="btn-group">
                                <button type="button" class="btn btn-default light">
                                    <i class="fa fa-refresh"></i>
                                </button>
                                <button type="button" class="btn btn-default light">
                                    <i class="fa fa-trash"></i>
                                </button>
                                <button type="button" class="btn btn-default light">
                                    <i class="fa fa-plus"
                                       onclick="javascript:window.location.href='/parkSpace/to_add';"></i>
                                </button>
                            </div>
                        </div>
                        <div class="col-xs-12 col-md-9 text-right">
                            <div class="btn-group">
                                <button type="button" class="btn btn-default light">
                                    <i class="fa fa-chevron-left"></i>
                                </button>

                                <button type="button" class="btn btn-default light">
                                    <i class="fa fa-chevron-right"></i>
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="panel-body pn">
                    <table id="message-table" class="table admin-form theme-warning tc-checkbox-1">
                        <thead>
                        <tr class="">
                            <th class="text-center hidden-xs">Select</th>
                            <th class="hidden-xs">楼层</th>
                            <th class="hidden-xs">区域</th>
                            <th class="hidden-xs">车位号</th>
                            <th class="hidden-xs">状态</th>

                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${pageInfo.list}" var="space">
                            <tr class="message-unread">
                                <td class="hidden-xs">
                                    <label class="option block mn">
                                        <input type="checkbox" name="mobileos" value="FR">
                                        <span class="checkbox mn"></span>
                                    </label>
                                </td>
                                <td>${space.floor}</td>
                                <td>${space.area}</td>
                                <td>${space.spaceId}</td>
                                <td>
                                    <c:if test="${space.status == 0}">空闲</c:if>
                                    <c:if test="${space.status == 1}">占用</c:if>
                                    <c:if test="${space.status == 2}">预定</c:if>
                                </td>

                                <td>
                                    <a href="/parkSpace/to_update?id=${space.id}">编辑</a>
                                    <a href="/parkSpace/remove?id=${space.id}">删除</a>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    <p>当前 ${pageInfo.pageNum }页,总${pageInfo.pages }
                        页,总 ${pageInfo.total } 条记录
                    </p>
                    <a href="list?pageNo=${pageInfo.getFirstPage()}">首页</a>
                    <c:if test="${pageInfo.hasPreviousPage }">
                        <a href="list?pageNo=${pageInfo.pageNum-1}">上一页</a>
                    </c:if>

                    <c:if test="${pageInfo.hasNextPage }">
                        <a href="list?pageNo=${pageInfo.pageNum+1}">下一页</a>
                    </c:if>

                    <a href="list?pageNo=${pageInfo.getLastPage()}">末页</a>
                </div>
            </div>
        </div>
    </div>
</section>

<jsp:include page="bottom.jsp"/>