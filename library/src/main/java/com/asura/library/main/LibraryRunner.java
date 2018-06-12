package com.asura.library.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asura.library.handlers.StudentDetailsHandler;
import com.asura.library.models.StudentDetails;

public class LibraryRunner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Library.xml");

	    StudentDetailsHandler studentDetailsHandler = context.getBean("studentDetailsHandler",StudentDetailsHandler.class);

		StudentDetails studentDetails = new StudentDetails();
		
		String i = studentDetailsHandler.registerStudent(studentDetails);
		System.out.println(i);

	}

}
