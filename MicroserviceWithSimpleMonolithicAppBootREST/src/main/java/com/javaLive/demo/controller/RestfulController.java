package com.javaLive.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfulController {

	@RequestMapping("/")
	public String getMesssage() {

		return "Hi";
	}

	@RequestMapping(value = "/add/{num1}/{num2}", method = RequestMethod.GET)
	public ResponseEntity<?> add(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
		Double result = num1 + num2;
		System.out.println("Welcome to JavaLive!!!\n" + "Enterd values are " + num1 + " and " + num2 + "\n"
				+ "Arithmetic operation selected is addition.\n" + "Result is " + result);
		return new ResponseEntity<Double>(result, HttpStatus.OK);
	}

	@RequestMapping(value = "/sub/{num1}/{num2}", method = RequestMethod.GET)
	public ResponseEntity<?> substract(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
		Double result = num1 - num2;
		System.out.println("Welcome to JavaLive!!!\n" + "Enterd values are " + num1 + " and " + num2 + "\n"
				+ "Arithmetic operation selected is substraction.\n" + "Result is " + result);
		return new ResponseEntity<Double>(result, HttpStatus.OK);
	}

	@RequestMapping(value = "/mul/{num1}/{num2}", method = RequestMethod.GET)
	public ResponseEntity<?> multiply(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
		Double result = num1 * num2;
		System.out.println("Welcome to JavaLive!!!\n" + "Enterd values are " + num1 + " and " + num2 + "\n"
				+ "Arithmetic operation selected is multiplication.\n" + "Result is " + result);
		return new ResponseEntity<Double>(result, HttpStatus.OK);
	}

	@RequestMapping(value = "/div/{num1}/{num2}", method = RequestMethod.GET)
	public ResponseEntity<?> division(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
		Double result = num1 / num2;
		System.out.println("Welcome to JavaLive!!!\n" + "Enterd values are " + num1 + " and " + num2 + "\n"
				+ "Arithmetic operation selected is division.\n" + "Result is " + result);
		return new ResponseEntity<Double>(result, HttpStatus.OK);
	}
}
