<#import "parts/common.ftl" as c>
<@c.page>
<#if purch??>
<div>
    <h3><span class="badge badge-warning">Топ клиент за полгода : ${purch}</span></h3>
</div>
</#if>
<#if item??>
<div>
    <h3><span class="badge badge-warning">Топ товар за месяц : ${item}</span></h3>
</div>
</#if>
<#if item18??>
<div>
    <h3><span class="badge badge-warning">Товар,который чаще всего покупают в 18 лет : ${item18}</span></h3>
</div>
</#if>
<#if purchaselist??>
<div>
    <h3><span class="badge badge-warning">Список покупок за неделю </span></h3>
</div>
<#list purchaselist as p>
<ul class="list-group">
    <li><a href="" class="badge badge-secondary mb-1">Покупатель : ${p.name} ${p.lastName} Дата : ${p.purchaseDate}</a></li>
</#list>
</ul>
</#if>
<li><a href="/greeting" class="badge badge-secondary mb-1">на главную</a></li>
</@c.page>