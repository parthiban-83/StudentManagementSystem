package com.springboot.StudentManagementSystem.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name",nullable = false)
	private String firstname;

	@Column(name="Last_name",nullable = false)
	private String lastname;

	@Column(name="E-Mail",nullable = false,unique = true)
	private String mail;

}
