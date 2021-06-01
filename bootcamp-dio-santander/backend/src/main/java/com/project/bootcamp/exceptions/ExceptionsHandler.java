package com.project.bootcamp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/*PASSO 17 - quando acontecer algum problema vai cair aqui, vai tratar questões de response*/
@ControllerAdvice
public class ExceptionsHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    protected ResponseEntity<ExceptionResponse> handleSecurity(NotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ExceptionResponse(ex.getMessage()));
    }

    /*vai criar um ExpectionHandler, quando acontecer um problema no service automaticamente vai tratar esse método*/
    @ExceptionHandler(BusinessException.class)
    /*vai tratar uma segurança do BusinessException*/
    protected ResponseEntity<ExceptionResponse> handleSecurity(BusinessException ex) {
        /*vai retornar um 422, processou a informação e deu um problema, vai colocar no body a mensagem*/
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(new ExceptionResponse(ex.getMessage()));
    }

    /*vai retornar um 404 e vai receber um NotFoundException*/
    @ExceptionHandler(Exception.class)
    protected ResponseEntity<ExceptionResponse> handleSecurity(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ExceptionResponse(ex.getMessage()));
    }
}
