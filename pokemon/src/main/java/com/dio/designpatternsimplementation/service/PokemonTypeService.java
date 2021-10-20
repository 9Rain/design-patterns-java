package com.dio.designpatternsimplementation.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "pokemontype", url = "http://localhost:8082")
public interface PokemonTypeService {

	@GetMapping("/api/v1/type/{typeName}/weakness")
	List<String> getWeaknesses(@PathVariable("typeName") String typeName);

    @GetMapping("/api/v1/type/{typeName}/strength")
	List<String> getStrengths(@PathVariable("typeName") String typeName);
}
