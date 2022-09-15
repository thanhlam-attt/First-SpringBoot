package com.ThanhBegin.Begin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.ThanhBegin"}) // Quét tất cả package có tên com.ThanhBegin
public class BeginApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeginApplication.class, args);
	}

}
