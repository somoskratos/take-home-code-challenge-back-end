package com.brunoallison.challenge.api.models;

import java.text.DecimalFormat;

public class Helpers {

	public static Double formataDecimalParaDuasCasas(Double valor) {
		DecimalFormat df = new DecimalFormat("0.00");

		String novoValorString = df.format(valor);
		Double novoValorDouble = Double.parseDouble(novoValorString.replaceAll(",", "."));

		return novoValorDouble;
	}

}
