package com.yedam.app.board.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BookVO {
	// book_tbl_06
	private Integer bookNo;
	private String bookName;
	private String bookCoverimg;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date bookDate;
	private Integer bookPrice;
	private String bookPublisher;
	private String bookInfo;
	
	// rent_tbl_06
	private Integer rentNo;
	//private Integer bookNo; // 공통컬럼
	private Integer rentPrice;
	private Date rentDate;
	private char rentStatus;
}
