package com.project.projectmay.review.vo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ReviewVO {
	
	private long storeSeq; 
	private String storeName;
	private String storeAddress;
	private String reviewStartDate; 
	private String reviewEndDate; 
	private String supportType;
	private String supportPrice;
	private String supportMenu;
	private String storeTel;
	private String bookingTel;
	private String command;
	private String holiday;
	private String bookingYn;
	
	
}
