package com.api.amqp;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author kaze 2017/10/29
 */
@SpringCloudApplication
public class CloudApiAmqpApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudApiAmqpApplication.class, args);
	}

}
