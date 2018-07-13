package com.briup.app02.servse;

import java.util.List;

import com.briup.app02.bean.student;

public interface IStudentService {
	List<student>findall()throws Exception;
	student findById(long id) throws Exception;
	void save(student Student) throws Exception;
	void update(student Student) throws Exception;
	void deletebyId(long id) throws Exception;
	}
