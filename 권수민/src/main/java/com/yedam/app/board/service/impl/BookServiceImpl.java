package com.yedam.app.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yedam.app.board.mapper.BookMapper;
import com.yedam.app.board.service.BookService;
import com.yedam.app.board.service.BookVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
	private final BookMapper bookMapper;

	// 도서목록조회
	@Override
	public List<BookVO> findAll() {
		return bookMapper.selectAll();
	}

	// 도서정보 등록
	@Override
	public int addInfo(BookVO bookVO) {
		int result = bookMapper.insertInfo(bookVO);
		return result == 1 ? bookVO.getBookNo() : -1;
	}

	// 마지막 도서 번호 조회
	@Override
	public int findLastBno(BookVO bookVO) {
		return bookMapper.selectInfo(bookVO);
	}

	// 도서대여현황 조회
	@Override
	public List<BookVO> findRent() {
		return bookMapper.selectRent();
	}

}
