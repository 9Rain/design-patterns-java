package com.dio.designpatternsimplementation.controller;

import com.dio.designpatternsimplementation.model.Pokemon;
import com.dio.designpatternsimplementation.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/pokemon")
public class PokemonController {

    @Autowired
	private PokemonService pokemonService;

	@GetMapping
	public ResponseEntity<Iterable<Pokemon>> findAll() {
		return ResponseEntity.ok(pokemonService.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Pokemon> findById(@PathVariable Long id) {
		return ResponseEntity.ok(pokemonService.findById(id));
	}

	@PostMapping
	public ResponseEntity<Pokemon> save(@RequestBody Pokemon pokemon) {
		pokemonService.save(pokemon);
		return ResponseEntity.ok(pokemon);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Pokemon> update(@PathVariable Long id, @RequestBody Pokemon pokemon) {
		pokemonService.update(id, pokemon);
		return ResponseEntity.ok(pokemon);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Long id) {
		pokemonService.deleteById(id);
		return ResponseEntity.ok().build();
	}
}
