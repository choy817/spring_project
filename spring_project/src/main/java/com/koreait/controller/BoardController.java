package com.koreait.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
public class BoardController {
	@GetMapping("/list")
	public void list() {
	}
	@GetMapping("/write")
	public void write() {
		
	}
	@GetMapping("/view")
	public void view() {
		
	}
}
