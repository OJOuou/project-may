package com.project.projectmay.review.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.projectmay.review.repository.ReviewRepository;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
@RequestMapping(value="/review")
public class ReviewController {
	
	
	@Autowired
	ReviewRepository reviewRepository;
	
	@GetMapping("/reviewList")
	public String viewReviewList(Model model) {
		
		model.addAttribute("list", reviewRepository.selectReviewList());
		
		return "review/reviewList";
		
		
	}
	
}
