<#import "../common/head.ftl" as default >

<@default.layout title="${words}">
<div class="contentContainer">
    <div class="content">
        <ul style="margin-top: 20px;">
            <#list userList as item>
                <li> ${item.userName} 的生日: ${item.createTime?string('yyyy-MM-dd HH:mm:ss.sss')}</li>
            </#list>
        </ul>
    </div>
</div>
</@default.layout>


