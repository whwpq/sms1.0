package com.briup.app02.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/test")
public class TextController {
	@GetMapping("hellow")
	public String hellow(){
		return "hellow word";
	}
	@GetMapping("two")
	public String two(){
		return "hellow word 你好世界";
	}
}
