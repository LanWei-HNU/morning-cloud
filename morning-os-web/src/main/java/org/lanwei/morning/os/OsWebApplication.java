package org.lanwei.morning.os;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ImportResource;

/**
 * @author lanwei 2018-03-18
 */
@EnableEurekaClient

@SpringBootApplication(scanBasePackages = {"org.lanwei.morning"})
@ImportResource({"classpath*:morning-config/applicationContext-mybatis.xml"})
public class OsWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(OsWebApplication.class, args);
    }
}
