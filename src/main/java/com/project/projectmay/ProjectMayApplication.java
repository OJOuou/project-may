package com.project.projectmay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan(basePackages = {"com.project.projectmay.**.repository"})
@SpringBootApplication
public class ProjectMayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectMayApplication.class, args);
	}

}
