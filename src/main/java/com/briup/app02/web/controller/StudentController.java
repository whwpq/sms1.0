package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.student;
import com.briup.app02.servse.IStudentService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private IStudentService studentService;
	//http://127.0.0.1:8080/student/findAllStundent
	@GetMapping("FindAllStudent")
	public MsgResponse findAllStudent(){
		try {
			List<student> list=studentService.findall();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("saveStudent")
	public MsgResponse saveStudent(student Student){
		try {
			studentService.save(Student);
			return MsgResponse.success("保存成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("updateStudent")
	public MsgResponse updateStudent(student Student){
		try {
			studentService.update(Student);
			return MsgResponse.success("修改成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("deleteStudent")
	public MsgResponse deleteStudent(long id){
		try {
			// 调用service层代码删除学生信息
			studentService.deletebyId(id);
			// 如果删除成功返回成功信息
			return MsgResponse.success("删除成功", null);
		} catch (Exception e) {
			/* 先打印错误信息，让后台开发者知道问题所在
			返回错误信息，让前端开发者知道错误所在*/
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping("findStudentById")
	public MsgResponse findStundentById(long id){
		try {
			student Student=studentService.findById(id);
			return MsgResponse.success("查找成功", Student);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}		
	}
}
