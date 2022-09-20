package com.example.demo.member.mapper;

import java.util.List;

import com.example.demo.member.MemberVO;

public interface MemberMapper {
	
	List<MemberVO> memberSelectList();
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);

}
