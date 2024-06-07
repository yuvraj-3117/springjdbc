package com.springcorejdbc.dao;



import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

import com.springcorejdbc.entitites.Student;

public class StudentDaoImple implements StudentDao {
	private JdbcTemplate jdbcTemplate;
	private PreparedStatementSetter id;

//insert
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query = "insert into student(id,name,city)values(?,?,?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}
	// update

	public int change(Student student) {

		String query = "update student set name=?, city=? where id =?";
		int update = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return update;

	}

//delete op
	@Override
	public int delete(int studentId) {
		// TODO Auto-generated method stub
		String query = "delete from student where id=?";
		int update = this.jdbcTemplate.update(query, studentId);
		return update;
	}

	// seelct op
	@Override
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub

		// selectr single sutdent data
		String query = "select * from student where id=?";
		RowMapper <Student>  rowMapper = new RowMapperImpl(); //rowmaaperkaa object bnaya or woh ek interface toh ek class crrate ki rommapperimpl or uska object bnaauya
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;

	}

}
