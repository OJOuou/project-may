package com.project.projectmay.review.controller;


import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.projectmay.review.repository.ReviewRepository;
import com.project.projectmay.review.vo.ReviewVO;

import groovy.util.logging.Slf4j;



@Slf4j
@Controller
@RequestMapping(value="/review")
public class ReviewController {
	
	
	@Autowired
	ReviewRepository reviewRepository;
	
	@GetMapping("/reviewList")
	public String viewReviewList(Model model) {
		
		List<ReviewVO> list = reviewRepository.selectReviewList();
		System.out.println("list :: " + list.get(0));
		model.addAttribute("list", list);
		
		return "review/reviewList";
		
		
	}
	
	@PostMapping("/regist")
	@ResponseBody
	public HashMap<String, Object> registReview(@RequestBody ReviewVO reviewVO) throws Exception{
		HashMap<String, Object> returnMap = new HashMap<String, Object>();
		System.out.println("registReview :::  " + reviewVO);
		
		try {
			reviewRepository.insertReview(reviewVO);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		returnMap.put("code", "0000");
		returnMap.put("message", "success");
		
		
		return returnMap;
		
	}
	
}
