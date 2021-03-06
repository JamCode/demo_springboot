package com.wanghan.demo;

import com.wanghan.demo.api.ApplicationPreparedEventListener;
import com.wanghan.demo.api.ApplicationReadyEventListener;
import com.wanghan.demo.api.ApplicationStartedEventListener;
import com.wanghan.demo.dao.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@MapperScan(basePackages = "com.wanghan.demo.dao")
@SpringBootApplication(scanBasePackages = {"com.cfets.springboot", "com.wanghan.demo"})
public class DemoApplication {

	public static void main(String[] args) {

		//SpringApplication.run(DemoApplication.class, args);

		SpringApplication springApplication = new SpringApplication(DemoApplication.class);




		springApplication.addListeners(new ApplicationStartedEventListener());
		springApplication.addListeners(new ApplicationPreparedEventListener());
		springApplication.addListeners(new ApplicationReadyEventListener());

		springApplication.run(args);
		//System.out.println(ctx.getBean(UserMapper.class));


	}

}

