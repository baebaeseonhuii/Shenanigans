package com.seonhui.app.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() throws Exception{
		return "member/login";
	}
}
