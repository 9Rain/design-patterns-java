package com.dio.designpatternsimplementation.service;

import com.dio.designpatternsimplementation.model.Pokemon;


public interface PokemonService {

	Iterable<Pokemon> findAll();

	Pokemon findById(Long id);

	void save(Pokemon pokemon);

	void update(Long id, Pokemon pokemon);

	void deleteById(Long id);

}
