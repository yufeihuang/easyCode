package com.yfive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class EasyCodeLoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyCodeLoggerApplication.class, args);
	}
}
