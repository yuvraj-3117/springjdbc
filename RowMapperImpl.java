package com.springcorejdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springcorejdbc.entitites.Student;
//iska object bnega
public class RowMapperImpl implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		//resulset se data nikkala or student ke object me dala or student obj retrn kr diya
		Student student = new Student();
		student.setId(rs.getInt(1));//fiest colomb id he id se hi student kaa data nikALNA HE
		student.setName(rs.getString(2));
		student.setCity(rs.getString(3));
		return student;
	}

}
