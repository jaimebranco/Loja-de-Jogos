package com.GamesBoot.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id // Indicando que é a chave Primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
	private Long id;
	
	@NotBlank(message = "Esse campo é obrigatório")
	@Size(min = 5, max = 100, message = "Digite no mínimo 05 e no máximo 100 caracteres")
	private String nome;
	
	@NotNull(message = "O atributo Preço é obrigatório")
	@Column(precision = 5, scale = 2)
	private BigDecimal preco;
	
	@Column(nullable = false)
	@NotNull(message = "A data de Lançamento é obrigatória.")
	private LocalDate dataLancamento;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
