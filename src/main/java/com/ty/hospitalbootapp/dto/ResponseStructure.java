package com.ty.hospitalbootapp.dto;

public class ResponseStructure<T> {

	private int code;
	private String message;
	private T data;

	public T getBody() {
		return data;
	}

	public void setBody(T body) {
		this.data = body;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
