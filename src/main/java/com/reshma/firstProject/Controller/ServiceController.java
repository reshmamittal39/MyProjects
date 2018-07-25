package com.reshma.firstProject.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.reshma.firstProject.Service.StudentService;

@RestController
public class ServiceController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/students/{studentId}/courses")
	public List<String> retrieveCoursesForStudent(@PathVariable String studentId) {
		List<String> a  = new ArrayList<String>();
		return a;
	}
}
