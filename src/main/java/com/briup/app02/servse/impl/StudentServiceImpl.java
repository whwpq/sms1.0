package com.briup.app02.servse.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.student;
import com.briup.app02.dao.StudentMapper;
import com.briup.app02.servse.IStudentService;
@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private StudentMapper studentMapper;
	@Override
	public List<student> findall() throws Exception {
		//调用studentMapper查找所有学生
		List<student> list=studentMapper.findall();
		return list;
	}
	@Override
	public student findById(long id) throws Exception {
		student Student=studentMapper.findById(id);
		return Student;
	}
	@Override
	public void save(student Student) throws Exception {
		studentMapper.save(Student);
		
	}
	public void update(student Student) throws Exception {
			studentMapper.update(Student);
		
	}
	@Override
	public void deletebyId(long id) throws Exception {
		/*1.通过id查找判断学生是否存在,
		如果该学生存在，执行删除操作，如果该学生不存在，抛出异常*/
		student Student =studentMapper.findById(id);
		if(Student!=null){
			studentMapper.deletebyId(id);
		}else
		{
			throw new Exception("要删除的学生不存在"); 
		}
		
		
	}
	
}
