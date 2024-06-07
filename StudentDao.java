package com.springcorejdbc.dao;

import com.springcorejdbc.entitites.Student;

public interface StudentDao {
public   int insert(Student student);

public int change(Student student);

public int delete(int studentId);

public Student getStudent(int studentId);




}
