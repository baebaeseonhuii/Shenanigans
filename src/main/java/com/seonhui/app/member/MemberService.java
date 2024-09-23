package com.seonhui.app.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	private MemberMapper memberMapper;
	
	public int memberJoin(MemberVO memberVO) throws Exception{
		int result = memberMapper.memberJoin(memberVO);
		
		return result;
	}
	
}
