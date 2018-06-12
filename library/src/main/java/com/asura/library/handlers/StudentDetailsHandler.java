package com.asura.library.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asura.library.dao.StudentDetailsDao;
import com.asura.library.models.StudentDetails;

@Controller
@RequestMapping("/student")
public class StudentDetailsHandler {

	@Autowired
	private StudentDetailsDao studentDetailsDao;
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("studentDetails", new StudentDetails());
		return "index";
	}
	
	@RequestMapping("/register")
	public String registerStudent(StudentDetails studentDetails) {
		studentDetailsDao.registerStudent(studentDetails);
		return "";
	}
}
