package com.brunoallison.challenge.api.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class ErrosRequisicaoController extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException methodEx,
			HttpHeaders header, HttpStatus status, WebRequest request) {
		String erro = "Os valores informados não são válidos.";

		return new ResponseEntity(erro, HttpStatus.BAD_REQUEST);
	}

	@Override
	protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers,
			HttpStatus status, WebRequest wr) {
		String erro = "Ocorreu um erro desconhecido ao calcular a tributação.";

		return new ResponseEntity(erro, HttpStatus.BAD_REQUEST);
	}

}
