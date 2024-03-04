package com.ty.hospitalbootapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ty.hospitalbootapp.dto.ResponseStructure;

@ControllerAdvice
public class HospitalAppExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(value = IdNotFoundException.class)
	public ResponseEntity<ResponseStructure<String>> handleIdNotFoundException(IdNotFoundException exception) {
		ResponseStructure<String> structure = new ResponseStructure<String>();
		structure.setBody("ID NOT FOUND");
		structure.setCode(HttpStatus.NOT_FOUND.value());
		structure.setMessage("Not Found");
		return new ResponseEntity<ResponseStructure<String>>(structure, HttpStatus.NOT_FOUND);
	}
}
