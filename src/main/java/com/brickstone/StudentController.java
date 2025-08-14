package com.brickstone;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@RequestMapping("students")
	public List<Student> getStudents(){
		List<Student> studs = new ArrayList<>();
		Student s1 = new Student();
		s1.setSid(101);
		s1.setSname("Atul");
		s1.setTech("Java");
		
		Student s2 = new Student();
		s2.setSid(102);
		s2.setSname("Avani");
		s2.setTech("Spring");
		
		Student s3 = new Student();
		s3.setSid(103);
		s3.setSname("Mahesh");
		s3.setTech("Python");
		
		studs.add(s1);
		studs.add(s2);
		studs.add(s3);
		return studs;
	}
}
