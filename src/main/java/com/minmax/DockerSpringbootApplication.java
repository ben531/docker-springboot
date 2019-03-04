package com.minmax;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(value = { "com.minmax.*" })
public class DockerSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringbootApplication.class, args);
	}

}
