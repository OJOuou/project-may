package com.project.projectmay.review.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.project.projectmay.review.vo.ReviewVO;


public interface ReviewRepository {

	List<ReviewVO> selectReviewList();

	
}
