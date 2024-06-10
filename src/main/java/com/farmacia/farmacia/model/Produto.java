package com.farmacia.farmacia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table (name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo título é obrigatório!")
	@Size(min = 5, max = 500, message = "O atibuto título deve conter no mínimo 10 e no máximo 100 caracteres")
	private String nome;

	@NotNull(message= "O atributo preco é obrigatório")
	@Positive
	private Float preco;
	
	@NotBlank(message = "O atributo descrição é obrigatório!")
	@Size(min = 5, max = 1000, message = "O atibuto título deve conter no mínimo 10 e no máximo 100 caracteres")
	private String descricao;
	
	@NotBlank(message = "O atributo marca é obrigatório!")
	@Size(min = 5, max = 100, message = "O atibuto título deve conter no mínimo 10 e no máximo 100 caracteres")
	private String marca;
	
	
	@Size(max = 500)
	private String foto;
	
	@ManyToOne 
	@JsonIgnoreProperties("produto") 
	private Categoria categoria;

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

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

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

}
