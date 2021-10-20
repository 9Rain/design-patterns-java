package com.dio.pokemontypeapi;

import com.dio.pokemontypeapi.model.Type;
import com.dio.pokemontypeapi.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class PokemonTypeApiApplication {

	public static void main(String[] args) { SpringApplication.run(PokemonTypeApiApplication.class, args); }

}
