package com.seonhui.app.chat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat/*")
public class ChatController {

	@GetMapping("chatView")
	public void chatView() throws Exception{
		
	}
}
