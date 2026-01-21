package com.yedam.app.board.service;

import java.util.Date; // yyyy/MM/dd

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data // @Getter/Setter/ToString/EqualsAndHashCode/NoArgsConstructor
public class BoardVO {
	private Integer bno;   // Not Null, PK
	private String title;  // Not Null
	private String contents;
	private String writer; // Not Null
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date regdate;  // Not Null
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedate; // Default SYSDATE
	private String image;
}
