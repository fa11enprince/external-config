# external-config
Spring Bootの外部設定値(application.properties, application.yml)の検証コード  

### 前提条件
- Java8 & Spring Boot 2 & lombok
- MySQLがポート3307とMariaDBがポート3306にインストールされていること
- MySQLとMariaDBのユーザがroot/rootであること
※ただし、application.ymlさえ書き換えれば問題ありません。  

環境変数
SPRING_PROFILES_ACTIVE
に
mysql or mariadb
をセットする

### 出力結果
SPRING_PROFILES_ACTIVEがmariadbのとき(要Eclipse再起動)
```
-------------------------------------------
active profiles : mariadb
spring.datasource.url : jdbc:mariadb://localhost:3306/mysql
spring.datasource.driverClassName : org.mariadb.jdbc.Driver
spring.datasource.tomcat.max-age : 60000
spring.jpa.properties.hibernate.show_sql : false
-------------------------------------------
app.myProperty.ipAddress : 127.0.0.1
app.myProperty.port : 8080
-------------------------------------------
```

SPRING_PROFILES_ACTIVEがmysqlのとき(要Eclipse再起動)
```
-------------------------------------------
active profiles : mysql
spring.datasource.url : jdbc:mysql://localhost:3307/mysql
spring.datasource.driverClassName : com.mysql.jdbc.Driver
spring.datasource.tomcat.max-age : 60000
spring.jpa.properties.hibernate.show_sql : false
-------------------------------------------
app.myProperty.ipAddress : 127.0.0.1
app.myProperty.port : 8080
-------------------------------------------
