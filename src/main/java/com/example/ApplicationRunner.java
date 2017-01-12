package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ApplicationRunner implements CommandLineRunner{

	private static final Logger logger = LoggerFactory.getLogger(ApplicationRunner.class);
	@Autowired
	private StudentRepository studentRepository;
	public static void main(String[] args) {
		SpringApplication.run(ApplicationRunner.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
	 	logger.info(".... Fetching books");
        logger.info("student-1234 -->" + studentRepository.getStudentById(1234));
        logger.info("student-4567 -->" + studentRepository.getStudentById(4567));
        logger.info("student-1234 -->" + studentRepository.getStudentById(1234));
        logger.info("student-4567 -->" + studentRepository.getStudentById(4567));
        logger.info("removing student-1234 from cache");
        studentRepository.removeStudentById(1234);
        logger.info("student-1234 -->" + studentRepository.getStudentById(1234));
        logger.info("student-1234 -->" + studentRepository.getStudentById(1234));
	}
}
