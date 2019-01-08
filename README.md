# external-config
Spring Boot�̊O���ݒ�l(application.properties, application.yml)�̌��؃R�[�h  

### �O�����
- Java8 & Spring Boot 2
- MySQL���|�[�g3307��MariaDB���|�[�g3306�ɃC���X�g�[������Ă��邱��
- MySQL��MariaDB�̃��[�U��root/root�ł��邱��
���������Aapplication.yml��������������Ζ�肠��܂���B  

���ϐ�
SPRING_PROFILES_ACTIVE
��
mysql or mariadb
���Z�b�g����

### �o�͌���
SPRING_PROFILES_ACTIVE��mariadb�̂Ƃ�(�vEclipse�ċN��)
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

SPRING_PROFILES_ACTIVE��mysql�̂Ƃ�(�vEclipse�ċN��)
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