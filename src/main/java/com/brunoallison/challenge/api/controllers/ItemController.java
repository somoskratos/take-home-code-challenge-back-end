package com.brunoallison.challenge.api.controllers;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.brunoallison.challenge.api.models.Itens;
import com.brunoallison.challenge.api.services.ItemService;

@RestController
public class ItemController {

	private ItemService itemService;

	public ItemController() {
		this.itemService = new ItemService();
	}

	@PostMapping("/rest/icms")
	public ResponseEntity<Itens> realizarCalculos(@Valid @RequestBody Itens itens) {
		return ResponseEntity.ok(this.itemService.realizarCalculos(itens));
	}

}
