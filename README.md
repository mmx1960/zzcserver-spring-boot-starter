# zzcserver-spring-boot-starter
个人服务器框架[zzc-server](https://github.com/mmx1960/zzc-server)的springboot-starter

## 功能
1. 集成了zzcserver1.0.2版本
2. 可自定义化一些配置

## 使用方法
* maven引入
```
   <dependency>
       <groupId>cn.94zichao</groupId>
       <artifactId>zzcserver-spring-boot-starter</artifactId>
       <version>1.0.0</version>
   </dependency>
```

* application.properties

    配置前缀为zzc.server
```
    #自定义端口
    zzc.server.listenPort=19999
```