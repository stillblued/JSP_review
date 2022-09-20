package com.example.demo.member;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Getter;

@Getter
public class CustomUser extends User {
	
	private MemberVO member;
		
	
	public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
		// 
	}
	
	// id pwd만 넘겨주면 시큐리티가 알아서 처리
	public CustomUser(MemberVO vo) {
		super(vo.getMemberId(), vo.getMemberPwd(), Collections.singletonList(new SimpleGrantedAuthority(vo.getMemberAuthor())));
	}
}
