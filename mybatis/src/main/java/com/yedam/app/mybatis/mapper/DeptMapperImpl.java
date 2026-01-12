package com.yedam.app.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yedam.app.mybatis.common.MybatisSqlSessionFactory;
import com.yedam.app.mybatis.service.DeptVO;
import com.yedam.app.mybatis.service.EmpVO;

public class DeptMapperImpl implements DeptMapper{
	private SqlSessionFactory factory = MybatisSqlSessionFactory.getSqlSessionFactory();

	@Override
	public List<DeptVO> selectAll() {
		try (SqlSession session = factory.openSession()) {
			List<DeptVO> list = session.selectList("com.yedam.app.mybatis.mapper.DeptMapper.selectAll");
			return list;
		}
	}

	@Override
	public DeptVO selectInfo(DeptVO dept) {
		try (SqlSession session = factory.openSession()) {
			DeptVO find = session.selectOne("com.yedam.app.mybatis.mapper.DeptMapper.selectInfo", dept);
			return find;
		}
	}

	@Override
	public int insertInfo(DeptVO dept) {
		try (SqlSession session = factory.openSession(true)) { // true 넣어야 auto commit 가능
			int result = session.insert("com.yedam.app.mybatis.mapper.DeptMapper.insertInfo", dept);
			return result;
		}
	}

	@Override
	public int updateInfo(DeptVO dept) {
		try (SqlSession session = factory.openSession(true)) { // true 넣어야 auto commit 가능
			int result = session.update("com.yedam.app.mybatis.mapper.DeptMapper.updateInfo", dept);
			return result;
		}
	}

	@Override
	public int deleteInfo(int deptId) {
		try (SqlSession session = factory.openSession(true)) { // true 넣어야 auto commit 가능
			int result = session.update("com.yedam.app.mybatis.mapper.DeptMapper.deleteInfo", deptId);
			return result;
		}
	}

}
