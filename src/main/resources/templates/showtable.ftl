<#import "parts/common.ftl" as c>
<@c.page>
<#if item??>
<div>
    <h3><span class="badge badge-warning">Список товаров</span></h3>
</div>
<#list item as it>
<ul class="list-group">
    <li class="badge badge-secondary mb-1"> Наименование товара :${it.name}</li>
</#list>
</ul>
</#if>
<#if purchase??>
<div>
    <h3><span class="badge badge-warning">Архив покупок</span></h3>
</div>
<#list purchase as p>
<ul class="list-group">
   <li> <a href="/crud/${p.id?c}" class="badge badge-secondary mb-1">Покупатель ${p.name} ${p.lastName} Дата ${p.purchaseDate}</a></li>
</#list>
</ul>
</#if>
</@c.page>