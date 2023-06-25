package com.project.projectmay.review.repository;

import java.util.List;


import com.project.projectmay.review.vo.ReviewVO;


public interface ReviewRepository {

	List<ReviewVO> selectReviewList();

	void insertReview(ReviewVO reviewVO);

	
}
