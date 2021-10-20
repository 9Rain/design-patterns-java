package com.dio.pokemontypeapi.controller;

import com.dio.pokemontypeapi.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/type/")
@CrossOrigin(origins = "http://localhost:8081")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @GetMapping("{typeName}/weakness")
    public ResponseEntity<List<String>> getWeaknesses(@PathVariable("typeName") String typeName) {
        var type = typeService.findByName(typeName);
        if(type.isPresent()) {
            var weaknesses = type.get().getWeaknesses();
            return ResponseEntity.ok(weaknesses);
        }
        else return ResponseEntity.notFound().build();
    }

    @GetMapping("{typeName}/strength")
    public ResponseEntity<List<String>> getStrengths(@PathVariable("typeName") String typeName) {
        var type = typeService.findByName(typeName);
        if(type.isPresent()) {
            var strengths = type.get().getStrengths();
            return ResponseEntity.ok(strengths);
        }
        else return ResponseEntity.notFound().build();
    }
}
