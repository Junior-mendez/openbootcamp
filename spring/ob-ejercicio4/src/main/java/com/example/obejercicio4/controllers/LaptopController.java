package com.example.obejercicio4.controllers;

import com.example.obejercicio4.entities.Laptop;
import com.example.obejercicio4.repository.LaptopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Laptop>> findAll(){
        return ResponseEntity.ok(laptopRepository.findAll());
    }

    @PostMapping("/laptop")
    public ResponseEntity<Laptop> create(@RequestBody Laptop laptop){
        return ResponseEntity.ok(laptopRepository.save(laptop));
    }
}
