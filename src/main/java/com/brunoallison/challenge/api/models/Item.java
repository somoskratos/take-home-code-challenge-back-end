package com.brunoallison.challenge.api.models;

public class Item {
	private String codigo;
	private String descricao;
	private Double valorUnitario;
	private Integer quantidade;
	private Tributos tributos;
	
	public Item() {
		super();
	}

	public void calculaICMS() {
		
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getValorUnitario() {
		return valorUnitario;
	}
	
	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Tributos getTributos() {
		return tributos;
	}

	public void setTributos(Tributos tributos) {
		this.tributos = tributos;
	}
	
}
