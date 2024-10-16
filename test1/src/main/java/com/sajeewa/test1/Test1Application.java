package com.sajeewa.test1;

import com.sajeewa.test1.problem.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Test1Application {



	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);

		TestProblems testProblems = new TestProblems();
		testProblems.testAllProblems();
	}

}
