package com.dio.designpatternsimplementation.repository;

import com.dio.designpatternsimplementation.model.Pokemon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends CrudRepository<Pokemon, Long> {

}