package com.project.bootcamp.controller;

import com.project.bootcamp.model.dto.StockDTO;
import com.project.bootcamp.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin

/*segue as questões rest*/
@RestController

/*é possível acessá-lo com esse path*/
@RequestMapping(value = "/stock")
public class StockController {

    @Autowired
    private StockService service;

    /*está inserindo, então é um post
    vai enviar os dados no formato json e vai produzir um json*/
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    /* ResponseEntity: é uma resposta do StockDTO, 
    save: é um insert na base de dados
    @RequestBody: vai enviar através dele o StockDTO*/
    public ResponseEntity<StockDTO> save(@Valid @RequestBody StockDTO dto) {
        return ResponseEntity.ok(service.save(dto));
    }




    /*é um put, porque vai fazer uma alteração, só vai retornar o json*/
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> update(@Valid @RequestBody StockDTO dto) {
        return ResponseEntity.ok(service.update(dto));
    }





    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> delete(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok(service.delete(id));
    }




    /*está pegando algo, então é o get*/
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    /*vai retornar uma lista do StockDTO*/
    public ResponseEntity<List<StockDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }




    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> findById(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok(service.findById(id));
    }




    @GetMapping(value = "/today", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StockDTO>> findByCurrentDate() {
        return ResponseEntity.ok(service.findByCurrentDate());
    }
}
