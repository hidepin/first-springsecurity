package com.example.security.app.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {

	@RequestMapping
	String loginForm() {
		return "login/loginForm";
	}
}
