package com.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @author kaze 2017/10/29
 */
@SpringCloudApplication
@EnableZipkinServer
public class CloudZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudZipkinApplication.class, args);
	}

}
