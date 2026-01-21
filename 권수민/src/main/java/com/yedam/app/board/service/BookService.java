package com.yedam.app.board.service;

import java.util.List;

public interface BookService {
	// 도서목록조회
	public List<BookVO> findAll();
	
	// 도서정보 등록
	public int addInfo(BookVO bookVO);
	
	// 마지막 도서 번호 조회
	public int findLastBno(BookVO bookVO);
	
	// 도서대여현황 조회
	public List<BookVO> findRent();
}
