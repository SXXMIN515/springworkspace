package com.yedam.app.mybatis.common;

import java.util.List;

import com.yedam.app.mybatis.mapper.DeptMapper;
import com.yedam.app.mybatis.mapper.DeptMapperImpl;
import com.yedam.app.mybatis.mapper.EmpMapper;
import com.yedam.app.mybatis.mapper.EmpMapperImpl;
import com.yedam.app.mybatis.service.DeptVO;
import com.yedam.app.mybatis.service.EmpVO;

public class MybatisExample {
	private static EmpMapper empMap = new EmpMapperImpl();
	private static DeptMapper deptMap = new DeptMapperImpl();

	public static void main(String[] args) {
		// employees
//		selectAll();
//		selectInfo();
//		insertInfo();
//		updateInfo();
//		deleteInfo();
		
		// departments
		selectDeptAll();
//		selectDeptInfo();
//		insertDeptInfo();
//		updateDeptInfo();
//		deleteDeptInfo();

	}

	// employees
	public static void selectAll() {
		List<EmpVO> list = empMap.selectAll();
		for (EmpVO emp : list) {
			System.out.println(emp);
		}
	}

	public static void selectInfo() {
		EmpVO emp = new EmpVO();
		emp.setEmployeeId(100);

		EmpVO findVO = empMap.selectInfo(emp);
		System.out.println(findVO);
	}

	public static void insertInfo() {
		EmpVO empVO = new EmpVO();
		empVO.setLastName("Hong");
		empVO.setEmail("hong@google.com");
		empVO.setJobId("IT_PROG");

		int result = empMap.insertInfo(empVO);
		System.out.println(result);
	}
	
	public static void updateInfo() {
		EmpVO emp = new EmpVO();
		emp.setEmployeeId(209);
		emp.setFirstName("kil-dong");
		emp.setSalary(1000);
		
		int result = empMap.updateInfo(emp);
		System.out.println(result);
	}
	
	public static void deleteInfo() {
		int result = empMap.deleteInfo(209);
		System.out.println(result);
	}
	

	// departments
	public static void selectDeptAll() {
		List<DeptVO> list = deptMap.selectAll();
		for (DeptVO dept : list) {
			System.out.println(dept);
		}
	}

	public static void selectDeptInfo() {
		DeptVO dept = new DeptVO();
		dept.setDepartmentId(370);

		DeptVO findVO = deptMap.selectInfo(dept);
		System.out.println(findVO);
	}

	public static void insertDeptInfo() {
		DeptVO dept = new DeptVO();
		dept.setDepartmentName("Yedam");

		int result = deptMap.insertInfo(dept);
		System.out.println(result);
	}
	
	public static void updateDeptInfo() {
		DeptVO dept = new DeptVO();
		dept.setDepartmentName("Spring");; 
		dept.setDepartmentId(470);
		
		int result = deptMap.updateInfo(dept);
		System.out.println(result);
	}
	
	public static void deleteDeptInfo() {
		int result = deptMap.deleteInfo(470);
		System.out.println(result);
	}
}
