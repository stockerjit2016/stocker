package com.kimchi.stocker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test2Controller {

	@RequestMapping("test")
	public String wow() {
		// TODO : 비지니스
		return "home";
	}
}
