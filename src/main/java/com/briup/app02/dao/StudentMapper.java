package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.student;

public interface StudentMapper {
	//查询所有学生信息
	List<student>findall();
	//通过id查询学生信息
	student findById(long id);
	//保存学生信息
	void save(student Student);
	//修改学生信息
	void update(student Student);
	//删除学生信息
	void deletebyId(long id);
}
