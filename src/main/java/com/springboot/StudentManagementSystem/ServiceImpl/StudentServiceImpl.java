package com.springboot.StudentManagementSystem.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.StudentManagementSystem.Exception.ResourceNotFoundException;
import com.springboot.StudentManagementSystem.Model.Student;
import com.springboot.StudentManagementSystem.Repository.StudentRepository;
import com.springboot.StudentManagementSystem.Service.StudentService;
@Service
public class StudentServiceImpl implements StudentService
{
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) 
	{
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public Student saveStudent(Student student) 
	{
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudent() {

		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(long id) {
		Student student=studentRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Id Is Not Found Exception"));
		return student;
	}

	@Override
	public Student updateStudent(Student student, long id) {
		Student existingstudent=studentRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Id Is Not Found Exception"));
		existingstudent.setFirstname(student.getFirstname());
		existingstudent.setLastname(student.getLastname());
		existingstudent.setMail(student.getMail());
		studentRepository.save(existingstudent);
		return existingstudent;
	}

	@Override
	public void deleteStudent(long id) {
		Student student=studentRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Id Is Not Found Exception"));
		studentRepository.deleteById(id);
	}

}
