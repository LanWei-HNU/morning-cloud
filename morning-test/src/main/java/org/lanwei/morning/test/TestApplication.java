package org.lanwei.morning.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author lanwei 2018-03-20
 */
@ComponentScan(basePackages = {"org.lanwei.morning"})
@Configuration
@EnableAutoConfiguration
@ImportResource({"classpath*:/applicationContext-mybatis.xml"})
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
