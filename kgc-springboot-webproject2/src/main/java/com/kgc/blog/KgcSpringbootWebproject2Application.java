package com.kgc.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //BaseTimeEntity AUDITING 활성화
@SpringBootApplication
public class KgcSpringbootWebproject2Application {

	public static void main(String[] args) {
		SpringApplication.run(KgcSpringbootWebproject2Application.class, args);
	}

}
