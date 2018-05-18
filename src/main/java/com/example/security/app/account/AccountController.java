package com.example.security.app.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class AccountController {

	@RequestMapping("loginForm")
	String loginForm() {
		return "login/loginForm";
	}
}
