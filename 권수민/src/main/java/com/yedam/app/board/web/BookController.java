package com.yedam.app.board.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yedam.app.board.service.BookService;
import com.yedam.app.board.service.BookVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BookController {
	private final BookService bookService;
	
	// 도서목록조회
	@GetMapping("bookList")
	public String bookList(Model model) {
		List<BookVO> list = bookService.findAll();
		model.addAttribute("books", list);
		return "book/list";
	}
	
	// 도서정보 등록
	// => 페이지
	@GetMapping("bookInsert")
	public String bookInsert(BookVO bookVO, Model model) {
		int bno = bookService.findLastBno(bookVO);
		model.addAttribute("newBno", bno);
		return "book/insert";
	}
	
	// => 처리
	@PostMapping("bookInsert")
	public String bookInsert(BookVO bookVO) {
		bookService.addInfo(bookVO);
		return "redirect:/bookList";
	}
	
	// 도서대여현황 조회
	@GetMapping("rentList")
	public String rentList(Model model) {
		List<BookVO> list = bookService.findRent();
		model.addAttribute("rents", list);
		return "book/rentList";
	}
}
