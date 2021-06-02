package com.project.bootcamp.exceptions;

/*PASSO 15 - vai dizer que a classe criada é uma exceção*/
public class BusinessException extends RuntimeException{
    /*construtor recebe a mensagem*/
    public BusinessException(String message){
        super(message);
    }
}
