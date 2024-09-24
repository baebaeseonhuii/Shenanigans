package com.seonhui.app.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository memberRepository;
	
	public MemberVO memberJoin(MemberVO memberVO) throws Exception{
		memberVO = memberRepository.save(memberVO);
		
		return memberVO;
	}
	
}
