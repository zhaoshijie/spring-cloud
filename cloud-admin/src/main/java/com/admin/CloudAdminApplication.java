package com.admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author kaze 2017/10/29
 */
@SpringCloudApplication
@EnableAdminServer
@EnableTurbine
public class CloudAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudAdminApplication.class, args);
	}

}
