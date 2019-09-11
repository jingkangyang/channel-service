package com.yjk.channel.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class ChannelApplication {
	public static void main(String[] args) {
		SpringApplication.run(ChannelApplication.class, args);
	}
}
