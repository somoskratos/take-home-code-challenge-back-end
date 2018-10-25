package com.brunoallison.challenge.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.brunoallison.challenge.api.models.Item;
import com.brunoallison.challenge.api.services.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;

	@PostMapping("/icms")
	public ResponseEntity<List<Item>> realizarCalculos(@RequestBody List<Item> itens) {
		return ResponseEntity.ok(this.itemService.realizarCalculos(itens));
	}
	
}
