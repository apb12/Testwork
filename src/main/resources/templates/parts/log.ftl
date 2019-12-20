<#macro login path>
<div>
    <form action="/login" method="post">
        <div class="input-group mb-2">
            <input type="text" class="form-control" name="username" placeholder="Логин">
        </div>
        <div class="input-group mb-2">
            <input type="password" class="form-control" name="password" placeholder="Пароль">
        </div>
        <input class="btn btn-outline-primary btn-lg" type="submit" value="Enter">
    </form>
</#macro>
<#macro logout>
<div>
    <form action="/logout" method="post">
        <button class="btn btn-primary" type="submit">Выход</button>
    </form>
</div>
</#macro>