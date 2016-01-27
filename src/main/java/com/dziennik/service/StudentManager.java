package com.dziennik.service;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.dziennik.domain.Student;


@Stateless
public class StudentManager {
	@PersistenceContext
	EntityManager em;
	
	public void addStudent(Student student) {
		student.setId(null);
		em.persist(student);
	}
	
	public void updateStudent(Student student) {
		Student stud = em.find(Student.class, student.getId());

		student.setImie(stud.getImie());
		student.setNazwisko(stud.getNazwisko());
		student.setPesel(stud.getPesel());
		
		em.persist(student);
		em.flush();
	}

	public void deletePerson(Student student) {
		student = em.find(Student.class, student.getId());
		em.remove(student);
	}

	@SuppressWarnings("unchecked")
	public List<Student> getAllStudents() {
		return em.createNamedQuery("student.all").getResultList();
	}

}
