package com.project.bootcamp.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
PASSO 5 - definindo as ações no banco de dados
*/

@Entity
@Table(name = "tb_stock")
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id") /*ação no banco de dados*/
	private Long id; /*nome da ação*/

	@Column(name = "name") /*ação no banco de dados*/
	private String name; /*nome da ação*/

	@Column(name = "price") /*ação no banco de dados*/
	private Double price; /*nome da ação*/

	@Column(name = "variation") /*ação no banco de dados*/
	private Double variation; /*nome da ação*/

	@Column(name = "date") /*ação no banco de dados*/
	private LocalDate date; /*nome da ação*/

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
