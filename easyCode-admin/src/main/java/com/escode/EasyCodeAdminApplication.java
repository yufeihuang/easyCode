package com.escode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>启动类</p>
 *
 * @author yFive
 * @version 1.0
 * @Description {启动类}
 * @Company yFive
 * @date 2018/9/29 10:07
 */
@SpringBootApplication
@MapperScan("com.escode.domain.**.repository")
public class EasyCodeAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyCodeAdminApplication.class, args);
	}
}
