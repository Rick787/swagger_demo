package com.rick.demologicweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.rick")
@MapperScan("com.rick.demoLogic.mapper")
public class DemoLogicWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoLogicWebApplication.class, args);
	}
}
