package com.example;

public interface StudentRepository {
	Student getStudentById(int studentId);
	void removeStudentById(int studentId);
}
