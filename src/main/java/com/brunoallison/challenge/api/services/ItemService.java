package com.brunoallison.challenge.api.services;

import java.util.List;

import com.brunoallison.challenge.api.models.Item;

public class ItemService {

	public List<Item> realizarCalculos(List<Item> itens) {
		for(Item item : itens){
			item.calculaICMS();
		}
		return itens;
	}

}
