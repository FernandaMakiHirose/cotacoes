package com.project.bootcamp.mapper;

import com.project.bootcamp.model.Stock;
import com.project.bootcamp.model.dto.StockDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StockMapper {

    /*recebeu o DTO da requisição, transformou em entidade e retornou ela*/
    public Stock toEntity(StockDTO dto) {
        Stock stock = new Stock();
        stock.setId(dto.getId());
        stock.setName(dto.getName());
        stock.setDate(dto.getDate());
        stock.setPrice(dto.getPrice());
        stock.setVariation(dto.getVariation());
        return stock;
    }

    /*está convertendo entidade em DTO*/
    public StockDTO toDto(Stock active) {
        StockDTO stockDTO = new StockDTO();
        stockDTO.setId(active.getId());
        stockDTO.setName(active.getName());
        stockDTO.setDate(active.getDate());
        stockDTO.setPrice(active.getPrice());
        stockDTO.setVariation(active.getVariation());
        return stockDTO;
    }

    /*o DTO recebe uma lista de entidade que vai retornar uma lista de DTO, vai percorrer a lista de entidade item a item, vai mandar para o DTO já convertido e depois vai transformar em uma lista de retorno
    */
    public List<StockDTO> toDto(List<Stock> list) {
        return list.stream().map(this::toDto).collect(Collectors.toList());
    }
}
