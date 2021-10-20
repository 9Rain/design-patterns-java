package com.dio.pokemontypeapi.repository;

import com.dio.pokemontypeapi.model.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TypeRepository {

    private static List<Type> types;

    public static Optional<Type> findByName(String typeName) {
        if(types == null) {
            initializeTypes();
        }

        var askedType = types.stream().filter(
            type -> type.getName().equals(typeName)
        ).collect(Collectors.toList());

        if(askedType.size() == 0) {
            return Optional.empty();
        }

        return Optional.of(askedType.get(0));
    }

    private static void initializeTypes() {
        types = Arrays.asList(
            getElectricType(),
            getFireType(),
            getWaterType(),
            getGrassType()
        );
    }

    private static Type getElectricType() {
        return new Type(
            "electric",
            Arrays.asList("ground"),
            Arrays.asList("flying", "water")
        );
    }

    private static Type getFireType() {
        return new Type(
                "fire",
                Arrays.asList("ground", "rock", "water"),
                Arrays.asList("bug", "grass", "ice")
        );
    }

    private static Type getWaterType() {
        return new Type(
                "water",
                Arrays.asList("electric", "grass"),
                Arrays.asList("fire", "ground", "rock")
        );
    }

    private static Type getGrassType() {
        return new Type(
                "grass",
                Arrays.asList("bug", "fire", "flying", "ice", "poison"),
                Arrays.asList("ground", "rock", "water")
        );
    }


}
