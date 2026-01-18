package com.yedam.app.dept.service;

import lombok.Data;

@Data
public class DeptVO {
	private Integer departmentId;      // Not Null, PK
	private String departmentName; // Not Null
	private Integer managerId;           // FK
	private Integer locationId;            //  FK
}
