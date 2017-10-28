package com.zuul;

import com.netflix.zuul.FilterProcessor;
import com.zuul.filter.MyFilterProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author kaze 2017/10/28
 */
@SpringBootApplication
@EnableZuulProxy
public class CloudZuulApplication {

	public static void main(String[] args) {
		FilterProcessor.setProcessor(new MyFilterProcessor());
		SpringApplication.run(CloudZuulApplication.class, args);
	}

}
