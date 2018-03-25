morning-cloud(Make jar no war)

项目包含：
    1. 基础服务：服务发现    已完成    eureka  
                 内部路由    已完成    zuul (目前正在考虑使用Spring cloud gateway替代)
                 配置中心    未完成    config(待选方案：携程Apollo或Spring cloud config )
    2. 业务相关：os 主站     已完成    C端服务
                  cms        未完成    项目框架：jeeSide4.0
                  SSO        已完成    Sigle Sign On: spring security+jwt
                  
开发日志：
    2018年3月25日：目前已集成的插件: mybatis,mybatis-generator
                   morning-os-web与morning-sso-server可完成单点登录
                   morning-test单元测试模块尚未完善
                   