package com.brunoallison.challenge.api.models;

public class ICMS {
	private Double baseDeCalculo;
	private Double fatorDeReducaoDaBaseDeCalculo;
	private Double aliquota;
	private Double valorICMS;
	
	public ICMS() {
		super();
	}

	public Double getBaseDeCalculo() {
		return baseDeCalculo;
	}
	
	public void setBaseDeCalculo(Double baseDeCalculo) {
		this.baseDeCalculo = baseDeCalculo;
	}
	
	public Double getFatorDeReducaoDaBaseDeCalculo() {
		return fatorDeReducaoDaBaseDeCalculo;
	}
	
	public void setFatorDeReducaoDaBaseDeCalculo(Double fatorDeReducaoDaBaseDeCalculo) {
		this.fatorDeReducaoDaBaseDeCalculo = fatorDeReducaoDaBaseDeCalculo;
	}
	
	public Double getAliquota() {
		return aliquota;
	}
	
	public void setAliquota(Double aliquota) {
		this.aliquota = aliquota;
	}
	
	public Double getValorICMS() {
		return valorICMS;
	}
	
	public void setValorICMS(Double valorICMS) {
		this.valorICMS = valorICMS;
	}

}
