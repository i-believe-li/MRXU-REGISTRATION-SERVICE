package com.mrxu.cloud.registration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 使用Eureka来设置服务中心
 *     -- Eureka 服务端
 * @author ifocusing-xuzhiwei
 * @since 2018/3/6
 */
@EnableEurekaServer
@SpringBootApplication
public class RegistrationServiceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(RegistrationServiceApplication.class).web(true).run();
    }
}
