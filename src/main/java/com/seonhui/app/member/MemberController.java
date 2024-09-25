package com.seonhui.app.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	private MemberService memberService;

	@GetMapping("join")
	public void memberJoin() throws Exception {
		
	}
	
	@PostMapping("join")
	public String memberJoin(MemberVO memberVO) throws Exception {
		memberVO = memberService.memberJoin(memberVO);
		log.info("member id: {}", memberVO.getMemberId());
		
		return "redirect:/member/login";
	}
	
	@GetMapping("login")
	public void memberLogin() throws Exception {
		
	}
	
	@PostMapping("login")
	public void memberLogin(MemberVO memberVO) throws Exception {
		
	}
}
