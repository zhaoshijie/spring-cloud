package com.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author kaze 2017/10/29
 */
@SpringBootApplication
@ServletComponentScan
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@MapperScan("com.api.mapper")
public class CloudApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudApiApplication.class, args);
	}

}