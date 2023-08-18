package com.project.projectmay.bookstore.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/bookstore")
@Controller
public class BookstoreController {

	
	@GetMapping("")
	public String viewBookstore(HttpServletRequest reqeust) throws Exception {
		return "bookstore/view/main/main";
	}
	
	@GetMapping("/sales/bookDetail")
	public String viewSalesBookDetail(HttpServletRequest reqeust) throws Exception {
		return "bookstore/view/sales/bookDetail";
	}
	
	@GetMapping("/join")
	public String viewJoin(HttpServletRequest reqeust) throws Exception {
		return "bookstore/view/join/join";
	}
}
