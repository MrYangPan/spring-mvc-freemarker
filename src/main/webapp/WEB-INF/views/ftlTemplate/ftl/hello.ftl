<#import "../common/head.ftl" as default >

<@default.layout title="${headObj}">
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading text-center">
            <h2>用户列表</h2>
        </div>
        <div class="panel-body">
            <table class="table table-hover">
                <thead>
                <tr>
                    <td>用户ID</td>
                    <td>用户名</td>
                    <td>手机号</td>
                    <td>积分</td>
                    <td>创建时间</td>
                </tr>
                </thead>
                <tbody>
                    <#list userList as user>
                    <tr>
                        <td>${user.userId}</td>
                        <td>${user.userName}</td>
                        <td>${user.userPhone}</td>
                        <td>${user.score}</td>
                    <#--${item.userName} 的生日: ${item.createTime?string('yyyy-MM-dd HH:mm:ss.sss')}-->
                        <td>${(user.createTime?string('yyyy-MM-dd HH:mm:ss.sss'))!}</td>
                    </tr>
                    </#list>
                </tbody>
            </table>
        </div>
    </div>
</div>
</@default.layout>


