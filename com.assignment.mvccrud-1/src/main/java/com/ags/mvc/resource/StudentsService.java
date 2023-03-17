package com.ags.mvc.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

//import com.example.demoo.model.Student;
import com.ags.mvc.model.Students;

@Service
public class StudentsService {

	List<Students> students = new ArrayList<Students>(Arrays.asList(
			new Students("A1","Haryy","CSE"),new Students("A2","Potter","ECE"),new Students("A3","Chimper","EEE")));
	public List<Students> getAll(){
		return students;
	}
	
	public Students getStudentById(String Id) {
		Students s = students.stream()
				.filter(student -> Id.equals(student.getId()))
				.findAny()
				.orElse(null);
		return s;
	}

	public void addStudent(Students student) {
		// TODO Auto-generated method stub
		students.add(student);
	}

	public void updateStudent(String Id, Students student) {
		// TODO Auto-generated method stub
		for(Students s: students) {
			if(Id.equals(s.getId()))
			{
				s.setDepartment(student.getDepartment());
				s.setName(student.getName());
			}
		}
	}

	public void deleteStudent(String Id) {
		// TODO Auto-generated method stub
		for(Students s: students) {
			if(Id.equals(s.getId()))
			{
				students.remove(s);
				break;
			}
		}
	}
}
