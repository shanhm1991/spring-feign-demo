package org.springframework.feign.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.feign.annotation.FeignScan;

/**
* 
* @author shanhm1991@163.com
* 
*/
@FeignScan(basePackages="org.springframework.feign.demo")
@SpringBootApplication
public class FeignDemoBoot {
	public static void main( String[] args ) {
		SpringApplication.run(FeignDemoBoot.class, args);
    }
}
