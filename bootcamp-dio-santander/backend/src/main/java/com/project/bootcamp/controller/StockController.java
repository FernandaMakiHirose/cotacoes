package com.project.bootcamp.controller;

import com.project.bootcamp.model.dto.StockDTO;
import com.project.bootcamp.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/*importante para o fronend, é bom usar quando vai ligar com algo externo*/
@CrossOrigin

/*segue as questões rest*/
@RestController

/*é possível acessá-lo com esse path*/
@RequestMapping(value = "/stock")
public class StockController {

    /*PASSO 13 - fazendo a conexão com o service*/
    @Autowired /*fecha o ciclo*/
    private StockService service;

    /*está inserindo, então é um post
    vai enviar os dados no formato json e vai produzir um json*/
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    /* ResponseEntity: é uma resposta do StockDTO, 
    save: é um insert na base de dados
    @RequestBody: vai enviar através dele o StockDTO*/
    public ResponseEntity<StockDTO> save(@Valid @RequestBody StockDTO dto) {

        /*criando um método save no service*/
        return ResponseEntity.ok(service.save(dto));
    }

    /*é um put, porque vai fazer uma alteração, só vai retornar o json*/
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> update(@Valid @RequestBody StockDTO dto) {

        /*criando um método update no service*/
        return ResponseEntity.ok(service.update(dto));
    }

    /*vai querer deletar o id*/
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> delete(@PathVariable(value = "id") Long id) {
        /*criando um método delete no service*/
        return ResponseEntity.ok(service.delete(id));
    }

    /*está pegando algo, então é o get*/
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    /*vai retornar uma lista do StockDTO*/
    public ResponseEntity<List<StockDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    /*vai pegar pelo id, vai retornar o json*/
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> findById(@PathVariable(value = "id") Long id) {

        /*vai passar o id*/
        return ResponseEntity.ok(service.findById(id));
    }

    /*vai retornar uma lista em estoque de DTO apenas de hoje, vai retornar um json*/
    @GetMapping(value = "/today", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StockDTO>> findByCurrentDate() {
        /*criando um método de encontrar a data atual no service*/
        return ResponseEntity.ok(service.findByCurrentDate());
    }
}
