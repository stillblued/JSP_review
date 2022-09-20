package com.example.demo;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.member.service.UsersService;

import lombok.AllArgsConstructor;


@EnableWebSecurity	//Spring Security를 적용하는 어노테이션
@AllArgsConstructor	//생성자를 만들어줌
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	private final UsersService userService;	// getter setter가 아닌 생성자 방식으로 초기화
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// security-context의 <security:authentication-manager>를 자바 베이스 기반으로
		super.configure(auth);
		auth.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// security-context의 <security:http>
		super.configure(http);
		http.authorizeRequests()
			.antMatchers("/top").permitAll()
			.antMatchers("/admin/**").hasAuthority("ROLE_ADMIN")
			.and()
			.formLogin().loginPage("/login")
						.usernameParameter("id")
						//.successHandler(new CustomLoginSuccessHandler())
						.defaultSuccessUrl("/top")
			.and()
			.logout().logoutUrl("/logout")
			.and()
			.csrf().disable();
			
						
						
	}
	
}
