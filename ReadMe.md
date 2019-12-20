For start project set postgres properties in application.properties
spring.datasource.url=jdbc:postgresql://localhost/your db
spring.datasource.username=your username
spring.datasource.password=your password

For read Swagger docs run application and go url
json :    http://localhost:8080/v2/api-docs
html-ui :   http://localhost:8080/swagger-ui.html


Sql script for create DataBase :
db.migration/V1__init_DB.sql
WSD shema :
shema.xsd


Main page :
localhost:8080/greeting