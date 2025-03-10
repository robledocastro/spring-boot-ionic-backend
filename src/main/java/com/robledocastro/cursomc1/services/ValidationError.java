package com.robledocastro.cursomc1.services;

import java.util.ArrayList;
import java.util.List;

import com.robledocastro.cursomc1.resources.exceptions.FieldMessage;
import com.robledocastro.cursomc1.resources.exceptions.StandardError;

public class ValidationError extends StandardError{
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessage> errors = new ArrayList<>();
	
	public ValidationError(Integer status, String msg, Long timeStamp) {
		super(status, msg, timeStamp);
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void addError(String fieldName, String message) {
		errors.add(new FieldMessage(fieldName, message));
	}
	
}
