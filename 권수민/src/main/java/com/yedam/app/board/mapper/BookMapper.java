package com.yedam.app.board.mapper;

import java.util.List;

import com.yedam.app.board.service.BookVO;

public interface BookMapper {
	// 도서목록조회
	public List<BookVO> selectAll();
	
	// 도서정보 등록
	public int insertInfo(BookVO bookVO);
	
	// 마지막 도서 번호 조회
	public int selectInfo(BookVO bookVO);
	
	// 도서대여현황 조회
	public List<BookVO> selectRent();
}
