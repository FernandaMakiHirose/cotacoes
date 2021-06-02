package com.project.bootcamp.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*PASSO 11 - mapeando as entidades*/
/*definindo a entidade da tabela criada no banco de dados*/
@Entity
@Table(name = "tb_stock")
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) /*vai incrementar esses dados de maneira automática toda vez que fizer um insert*/
	@Column(name = "id") /*dado do banco de dados*/
	private Long id; /*atributo do backend*/

	@Column(name = "name") 
	private String name;

	@Column(name = "price") 
	private Double price;

	@Column(name = "variation") 
	private Double variation; 

	@Column(name = "date") 
	private LocalDate date; 

	/*abaixo temos a criação dos getter e setter*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getVariation() {
		return variation;
	}

	public void setVariation(Double variation) {
		this.variation = variation;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
