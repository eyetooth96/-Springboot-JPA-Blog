package com.cosblog.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller //스프링이 com.cos.blog 패키지 이하를 스캔해서 모든 파일을 메모리에 new하는것은 아닌 
            // 특정 어노테이션이 붙어있는 클래스 파일들을 new해서 (IoC)스프링컨테이너에 관리해준다. 

//@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
@RestController
public class BlogControllerTest {
@GetMapping("/")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
	
}
