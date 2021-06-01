package com.project.bootcamp.exceptions;
/*vai retornar a mensagem de resposta*/
public class ExceptionResponse {

    private String message;

    /*construtor que vai receber a mensagem e vai propagar ela*/
    public ExceptionResponse(String message){
        this.message = message;
    }

    /*isso é um getter da mensagem*/

    public String getMessage() {
        return message;
    }
}
