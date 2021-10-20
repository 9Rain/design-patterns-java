package com.dio.pokemontypeapi.service;

import com.dio.pokemontypeapi.model.Type;
import com.dio.pokemontypeapi.repository.TypeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TypeService {

    public Optional<Type> findByName(String typeName) {
        return TypeRepository.findByName(typeName);
    }
}
