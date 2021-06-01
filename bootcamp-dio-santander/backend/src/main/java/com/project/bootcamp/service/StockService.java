package com.project.bootcamp.service;

import com.project.bootcamp.exceptions.BusinessException;
import com.project.bootcamp.exceptions.NotFoundException;
import com.project.bootcamp.mapper.StockMapper;
import com.project.bootcamp.model.Stock;
import com.project.bootcamp.model.dto.StockDTO;
import com.project.bootcamp.repository.StockRepository;
import com.project.bootcamp.util.MessageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/*PASSO 13 - criando o service*/

@Service
public class StockService {

    @Autowired
    private StockMapper mapper;

    /*vai gerar as instâncias do repository*/
    @Autowired
    private StockRepository repository;

    /*é necessário transformar o DTO em entidade para que o banco de dados entenda e e faça um insert, essa transformação se chama mapper*/
    @Transactional /*vai abrir a transação, vai fazer o insert e vai fechar a transação*/
    public StockDTO save(StockDTO dto) {
        /*Optional nos ajuda com as condicionais, ele vai fazer um select, vai montar um where com nome e a data*/
        Optional<Stock> optionalEntity = repository.findByNameAndDate(dto.getName(), dto.getDate());
        /*verificação, se estiver algum dado dentro, vai retornar uma exceção e a mensagem do porque aconteceu*/
        if (optionalEntity.isPresent()) {
            /*vai passar a mensagem, não pode passar a mensagem diretamente aqui*/
            throw new BusinessException(MessageUtils.ACTIVE_ALREADY_EXISTS);
        }
        /*fez o insert da entidade que acabou de mapear*/
        Stock active = mapper.toEntity(dto);
        repository.save(active);
        return mapper.toDto(active);
    }

    @Transactional
    /*vai fazer o update e retornar o DTO*/
    public StockDTO update(StockDTO dto) {
        Optional<Stock> optionalEntity = repository.findByName(dto.getName(), dto.getId(), dto.getDate());
        if (optionalEntity.isPresent()) {
            throw new BusinessException(MessageUtils.ACTIVE_ALREADY_EXISTS);
        }
         /*fez o insert da entidade que acabou de mapear*/
        Stock active = mapper.toEntity(dto);
        repository.save(active);
        return mapper.toDto(active);
    }

    @Transactional

    /*vai retornar o objeto que ele deletou e um json, criou o id por parâmetro e vai receber o id pela url*/
    public StockDTO delete(Long id) {
        StockDTO activeDTO = findById(id);
        repository.deleteById(activeDTO.getId());
        return activeDTO;
    }

    /*essa transação é só para select*/
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    /*vai retornar uma lista do STOCK DTO*/
    public List<StockDTO> findAll() {

        /*vai fazer o select e o findall*/
        List<Stock> list = repository.findAll();
        if (list.isEmpty()) {
            throw new NotFoundException();
        }
        /*vai transformar a lista de entidade em uma lista DTO*/
        return mapper.toDto(list);
    }

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public StockDTO findById(Long id) {
        /*mandou um id, mas não conseguiu encontrar, então vai retornar uma exceção*/
        return repository.findById(id)
                .map(mapper::toDto)
                .orElseThrow(NotFoundException::new);
    }

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<StockDTO> findByCurrentDate() {
        /*vai tentar buscar o id, se deu certo vai retornar o id através do mapper e vai retornar o id em DTO, se não retornou nada cai no else e retorna uma exceção*/
        return repository.findByCurrentDate()
                .map(mapper::toDto)
                .orElseThrow(NotFoundException::new);
    }
}
