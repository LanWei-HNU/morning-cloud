morning-cloud(Make jar no war)
======

项目包含：
===================
    1. 基础服务：
                 服务发现    已完成    ms-dicover: eureka
                 内部路由    已完成    ms-gateway: zuul (目前正在考虑使用集成了reactor-netty的Spring cloud gateway替代)
                 配置中心    未完成    ms-config: Spring cloud config
    2. 业务相关：
                 商城主站    已完成    morning-os-web: 面向C端的服务
                 后台管理    未完成    morning-cms-web: 项目框架：jeeSide4.0
                 单点登录    已完成    morning-sso-server: spring security+jwt
                 客服系统    未完成    待定
                 物流服务    未完成    待定
                  
开发日志：
======
    2018年3月25日：
                   目前已集成的插件: mybatis,mybatis-generator
                   morning-os-web与morning-sso-server可完成单点登录,由于jwt并未提供直接注销token的方法，系统登出暂缓实现
                   morning-test单元测试模块尚未完善
    2018年4月15日：
                    新增ms-config配置服务器
                   