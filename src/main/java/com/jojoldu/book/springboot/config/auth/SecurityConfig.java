package com.jojoldu.book.springboot.config.auth;

import com.jojoldu.book.springboot.domain.user.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@RequiredArgsConstructor
// 스프링 시큐리티 설정 활성화
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final CustomOAuth2UserService customOAuth2UserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .headers().frameOptions().disable() // h2-console 화면 사용하기 위해 해당 옵션들을 disable
                .and()
                //.authorizeRequests() // URL별 권한 설정 antMatchers 옵션 사용 가능
                // 권한 관리 대상 지정
                // URL, HTTP 메소드별로 관리가 가능
                //.antMatchers("/", "/video/**","/css/**", "/images/**", "/js/**", "/h2-console/**", "/profile").permitAll()
                //.antMatchers("/api/v1/**").hasRole(Role.USER.name())
                //.anyRequest().authenticated() // 설정된 값들 이외의 나머지 URL, authenticated()옵션으로  나머지 URL은 인증이 필요하도록 함
                //.and()
                .logout()
                .logoutSuccessUrl("/") // 로그 아웃 설정시 해당 URL로 이동
                .and()
                .oauth2Login() // OAuth2 로그인 기능에 대한 여러 설정의 진입점
                .userInfoEndpoint() // OAuth2 로그인 성공 이후 사용자 정보를 가져올때의 설정
                .userService(customOAuth2UserService); // 소셜 로그인 성공 시 후속 조치를 진행할 UserInterface 의 구현체를 등록
    }
}