package com.brunoallison.challenge.api.services;

import com.brunoallison.challenge.api.models.Itens;

public class ItemService {
	
	public Itens realizarCalculos(Itens itens) {
		itens.getItens().forEach((item) -> {
			Double valorItens = item.getValorUnitario() * item.getQuantidade();
			
            item.getTributos().getIcms().calculaBaseDeCalculo(valorItens);
            item.getTributos().getIcms().calculaValorICMS(valorItens);
        });
		
		return itens;
	}

}
