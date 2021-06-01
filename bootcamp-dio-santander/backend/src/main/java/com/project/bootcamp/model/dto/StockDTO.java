package com.project.bootcamp.model.dto;

import java.time.LocalDate;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

/* PASSO 9 - validação
@NotNull: torna os campos obrigatórios, não precisou colocar no ID porque o banco de dados vai deixar ele nulo
@DecimalMin: é o valor mínimo que pode ser recebido
@Digits -> integer: é o máximo de caractere que pode ser recebido
@Digits -> fraction: é o máximo de caractere depois da vírgula que pode ser recebido
*/

/*passando dados do banco de dados e adicionando getter e setter*/
public class StockDTO {

    private Long id;

    @NotNull
    private String name;

    @NotNull
    @DecimalMin(value = "0.00")
    @Digits(integer = 6, fraction = 2)
    private Double price;

    @NotNull
    @Digits(integer = 3, fraction = 2)
    private Double variation;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate date;

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
