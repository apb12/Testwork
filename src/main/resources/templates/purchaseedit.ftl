<#import "parts/common.ftl" as c>
<@c.page>

<div>
    <h1> <span class="badge badge-warning">Редактирование покупок</span></h1>
</div>
<form action="/crud/save"method="post">

    <div class="input-group mb-2">
        <div class="input-group-prepend">
            <label class="input-group-text" for="inputGroupSelect01" >Товар</label>
        </div>
        <select class="custom-select" id="inputGroupSelect01" name="item">
            <option selected>${purchase.purchaseItem.name}</option>
            <#list item as it>
            <option value="${it.name}">${it.name}</option>
        </#list>
        </select>


        <div class="input-group mb-2">
        <div class="input-group-prepend">
            <span class="input-group-text">Имя</span>
        </div>
        <input class="form-control form-control" type="text" value="${purchase.name}" name="name">
        </div>

        <div class="input-group mb-2">
        <div class="input-group-prepend">
            <span class="input-group-text">Фамилия</span>
        </div>
        <input class="form-control form-control" type="text" value="${purchase.lastName}" name="lastName">
        </div>
        <div class="input-group mb-2">
            <div class="input-group-prepend">
                <span class="input-group-text">Возраст</span>
            </div>
            <input class="form-control form-control" type="text" value="${purchase.age}" name="age">
        </div>
        <div class="input-group mb-2">
            <div class="input-group-prepend">
                <span class="input-group-text">Количество</span>
            </div>
            <input class="form-control form-control" type="text" value="${purchase.count}" name="count">
        </div>

        <div class="input-group mb-2">
            <div class="input-group-prepend">
                <span class="input-group-text">Сумма</span>
            </div>
            <input class="form-control form-control" type="text" value="${purchase.amount}" name="amount">
        </div>

        <div class="input-group mb-2">
            <div class="input-group-prepend">
                <span class="input-group-text">Дата</span>
            </div>
            <input class="form-control form-control" type="text" value="${purchase.purchaseDate?string[yyyy-mm-dd hh:mm:ss]}" name="purchaseDate">
        </div>
        <input type="hidden" name="id" value="${purchase.id}"/>
<input class="btn btn-outline-primary btn-lg" type="submit" value="Сохранить">
    </div>
</form>
<form action="/crud/delete"method="post">
    <input type="hidden" name="id" value="${purchase.id}"/>
    <input class="btn btn-outline-primary btn-lg" type="submit" value="Удалить">
</form>

</@c.page>