package com.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author kaze 2017/10/28
 */
@SpringCloudApplication
@EnableZuulProxy
public class CloudZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudZuulApplication.class, args);
	}

}
