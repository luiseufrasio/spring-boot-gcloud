package com.boaglio.casadocodigo.model;

import javax.persistence.*;

@Entity
public class Propriedade {

	@Id
	private String nome;
	
	private String valor;
	
	private String descricao;
	
	private String categoria;
	
	private String subcategoria;
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getValor() {
		return this.valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getSubcategoria() {
		return this.subcategoria;
	}
	
	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
	}
	
}
