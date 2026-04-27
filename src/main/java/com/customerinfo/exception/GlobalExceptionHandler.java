package com.customerinfo.exception;




import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	// helps to handle exception 
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
 public ErrorResponse handleValidationException(MethodArgumentNotValidException exp,HttpServletRequest request) {
	Map<String,String> errors = new HashMap<>();
	exp.getBindingResult().getFieldErrors().
	forEach(error->errors.put(error.getField(),error.getDefaultMessage()));//method to wraps validation exception
	 return new ErrorResponse(LocalDateTime.now(), HttpStatus.BAD_REQUEST.value(), "Bad Request", "validation failed", request.getRequestURI(), errors);
	 
 }
	
	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorResponse handleResourceNotFound(ResourceNotFoundException exp,HttpServletRequest request) {
		
		return new ErrorResponse(
				LocalDateTime.now(),
				HttpStatus.NOT_FOUND.value(),
				"Not Found",
				exp.getMessage(),
				request.getRequestURI(),
				null
				);
	}
	@ExceptionHandler(HttpMessageNotReadableException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorResponse handleInvalidJson(HttpMessageNotReadableException exp,
	HttpServletRequest request)
	{
	return new ErrorResponse(
	LocalDateTime.now(),
	HttpStatus.BAD_REQUEST.value(),
	"Bad Request",
	"JSON Format Data Mismatch - Input Missing",
	request.getRequestURI(),
	null
	);
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorResponse handleGlobalException(Exception exp,
	HttpServletRequest request)
	{

	return new ErrorResponse(
	LocalDateTime.now(),
	HttpStatus.INTERNAL_SERVER_ERROR.value(),
	"Internal Server Error",
	exp.getMessage(),
	request.getRequestURI(),
	null);
	}


	
	
}



