package com.dongli.sprinboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SprinbootApplication {

	public static void main(String[] args) {
		//web程序调用顺序:
		//1.启动SpringBoot程序
		//2.启动Spring容器
		//3.启动内嵌Tomcat
		SpringApplication.run(SprinbootApplication.class, args);
	}
}
