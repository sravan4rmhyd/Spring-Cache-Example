package com.example;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class StudentRepositoryImpl implements StudentRepository{

	@Override
	@Cacheable(cacheNames="students",key="#studentId")
	public Student getStudentById(int studentId) {
		log();
        return new Student(1,"fname","lname", "student@gmail.com");
	}

	private void log() {
		System.out.println("calling original method");
	}
	
	@Override
	@CacheEvict(cacheNames="students",key="#studentId",beforeInvocation=true)
	public void removeStudentById(int studentId) {
		
	}
}
