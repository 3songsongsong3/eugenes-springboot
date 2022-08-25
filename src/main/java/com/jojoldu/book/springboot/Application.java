package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// 스프링 부트의 자동 설정, 스프링 빈 읽기와 생성을 모두 자동으로 설정된다
// @SpringBootApplication이 있는 위치부터 설정을 읽어가기 때문에 , 이 클래스는 항상 프로젝트의 최상단에 위치하여야 함.
@EnableJpaAuditing  // JPA auditing 어노테이션들을 모두 활성화할 수 있도록 한다.
@SpringBootApplication
public class Application {
    public static void main(String args[]) {
        // 내부에서 WAS 실행
        SpringApplication.run(Application.class, args);
    }
}
