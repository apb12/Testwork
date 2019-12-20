<#import "parts/common.ftl" as c>
<@c.page>
<div>
    <h3><span class="badge badge-warning">Таблицы</span></h3>
</div>
<div class="list-group">
    <li><a href="/show/item" class="badge badge-secondary mb-1"> Товары</a></li>
    <li><a href="/show/purchase" class="badge badge-secondary mb-1"> Покупки </a></li>
</div>
<div>
    <h3><span class="badge badge-warning">Отчеты по покупкам</span></h3>
</div>
<div class="list-group">
    <li><a href="/analytics/purch" class="badge badge-secondary mb-1">Топ покупатель за полгода</a></li>
    <li><a href="/analytics/allweek" class="badge badge-secondary mb-1">Список покупок за последю неделю</a></li>
    <li><a href="/analytics/bestitem" class="badge badge-secondary mb-1">Топ товар за месяц</a></li>
    <li><a href="/analytics/best18" class="badge badge-secondary mb-1">Топ товар 18 летних</a></li>
</div>
</@c.page>