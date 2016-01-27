package com.dziennik.web;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.dziennik.domain.Student;
import com.dziennik.service.StudentManager;


@SessionScoped
@Named("studentnBean")
public class StudentFormBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Student student = new Student();
	private ListDataModel<Student> students = new ListDataModel<Student>();
	
	@Inject
	private StudentManager sm;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public ListDataModel<Student> getAllStudents() {
		students.setWrappedData(sm.getAllStudents());
		return students;
	}
	
	// Actions
	public String addStudent() {
		sm.addStudent(student);
		return "showStudents";
		//return null;
	}

	public String deletePerson() {
		Student personToDelete = students.getRowData();
		sm.deletePerson(personToDelete);
		return null;
	}

}
