package com.dio.designpatternsimplementation.service.implementation;


import java.util.List;
import java.util.Optional;

import com.dio.designpatternsimplementation.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.designpatternsimplementation.model.Pokemon;
import com.dio.designpatternsimplementation.service.PokemonService;
import com.dio.designpatternsimplementation.service.PokemonTypeService;

@Service
public class PokemonServiceImplementation implements PokemonService {

	@Autowired
	private PokemonRepository pokemonRepository;
	@Autowired
	private PokemonTypeService pokemonTypeService;

	@Override
	public Iterable<Pokemon> findAll() {
		return pokemonRepository.findAll();
	}

	@Override
	public Pokemon findById(Long id) {
		Optional<Pokemon> pokemon = pokemonRepository.findById(id);
		return pokemon.get();
	}

	@Override
	public void save(Pokemon pokemon) {
		salvarPokemonWithStrengthsAndWeaknesses(pokemon);
	}

	@Override
	public void update(Long id, Pokemon pokemon) {
		Optional<Pokemon> pokemonBd = pokemonRepository.findById(id);
		if (pokemonBd.isPresent()) {
			salvarPokemonWithStrengthsAndWeaknesses(pokemon);
		}
	}

	@Override
	public void deleteById(Long id) {
		pokemonRepository.deleteById(id);
	}

	private void salvarPokemonWithStrengthsAndWeaknesses(Pokemon pokemon) {
		String typeName = pokemon.getType();
		List<String> strengths = pokemonTypeService.getStrengths(typeName);
		List<String> weaknesses = pokemonTypeService.getWeaknesses(typeName);

		pokemon.setStrengths(strengths);
		pokemon.setWeaknesses(weaknesses);

		pokemonRepository.save(pokemon);
	}

}
