package com.brunoallison.challenge.api.models;

public class ICMS {

	private Double baseDeCalculo;
	private Double fatorDeReducaoDaBaseDeCalculo;
	private Double aliquota;
	private Double valorICMS;

	public ICMS() {

	}

	public void calculaBaseDeCalculo(Double valorItens) {
		Double reducao = (valorItens * this.fatorDeReducaoDaBaseDeCalculo) / 100;
		this.baseDeCalculo = valorItens - reducao;
	}

	public void calculaValorICMS(Double valorItens) {
		this.valorICMS = (this.aliquota * this.baseDeCalculo) / 100;
	}

	public Double getBaseDeCalculo() {
		return Helpers.formataDecimalParaDuasCasas(baseDeCalculo);
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
		return Helpers.formataDecimalParaDuasCasas(valorICMS);
	}

	public void setValorICMS(Double valorICMS) {
		this.valorICMS = valorICMS;
	}

}
