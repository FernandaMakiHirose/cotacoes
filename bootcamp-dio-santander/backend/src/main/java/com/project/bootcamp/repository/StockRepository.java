package com.project.bootcamp.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.bootcamp.model.Stock;

@Repository

/*é um repository com o jpa que disponibiliza diversas ações, vai dizer que é da entidade Stock e o tipo do id é um Long*/
public interface StockRepository extends JpaRepository<Stock, Long> {

    public Optional<Stock> findByNameAndDate(String name, LocalDate date);

    /*vai retornar o nome, a data e o id*/
    @Query("SELECT stock FROM Stock stock WHERE stock.name = :name AND stock.date = :date AND stock.id <> :id ")
    public Optional<Stock> findByName(String name, Long id, LocalDate date);

    /*vai retornar o Stock da data atual*/
    @Query("SELECT stock FROM Stock stock WHERE stock.date = CURRENT_DATE ")
    Optional<List<Stock>> findByCurrentDate();
}
