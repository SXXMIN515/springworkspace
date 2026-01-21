package com.yedam.app.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yedam.app.board.mapper.BoardMapper;
import com.yedam.app.board.service.BoardService;
import com.yedam.app.board.service.BoardVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
	private final BoardMapper boardMapper;
	
	// 직접 생성자 만들어도 상관없음
//	public BoardServiceImpl(BoardMapper boardMapper) {
//		this.boardMapper = boardMapper;
//	}
	
	// 게시글 전체조회
	@Override
	public List<BoardVO> findAll() {
		return boardMapper.selectAll();
	}

	// 게시글 상세조회
	@Override
	public BoardVO findByBno(BoardVO boardVO) {
		return boardMapper.selectInfo(boardVO);
	}

	// 게시글 등록
	@Override
	public int addInfo(BoardVO boardVO) {
		int result = boardMapper.insertInfo(boardVO);
		return result == 1 ? boardVO.getBno() : -1; // -1인 이유 : 나올 수 없는 경우이기 때문에 
	}

}
