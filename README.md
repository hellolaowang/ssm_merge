(学习网址)[https://www.kancloud.cn/lizhenjie1992/framework/1007046]

### SSM整合
当springContext.xml文件配置以下项后,SqlMapConfig.xml文件可以进行删除,无须再使用.
~~~
<!--配置连接池-->
<bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource">
    <property name="driverClass" value="com.mysql.jdbc.Driver"/>
    <property name="jdbcUrl" value="jdbc:mysql://192.168.10.10:3306/ssm"/>
    <property name="user" value="homestead"/>
    <property name="password" value="secret"/>
</bean>
<!--配置SqlSessionFactory工厂-->
<bean id="sqlSessionFactoryBean" class="org.mybatis.spring.SqlSessionFactoryBean">
    <property name="dataSource" ref="dataSource"/>
</bean>
<!--配置AccountDao接口所在的包-->
<bean id="mapperScannerConfigurer" class="org.mybatis.spring.mapper.MapperScannerConfigurer">
    <property name="basePackage" value="com.like.dao"/>
</bean>
~~~
