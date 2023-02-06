package com.example.ejercicio7.controllers;

import com.example.ejercicio7.entities.Laptop;
import com.example.ejercicio7.repository.LaptopRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final Logger log = LoggerFactory.getLogger(LaptopController.class);

    @GetMapping("/findAll")
    public ResponseEntity<List<Laptop>> findAll(){
        return ResponseEntity.ok(laptopRepository.findAll());
    }

    @GetMapping("/findOneById/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable Long id){
        return laptopRepository.findById(id).map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }
    @PostMapping("/create")
    public ResponseEntity<Laptop> create(@RequestBody Laptop laptop){
        if(laptop.getId()!=null){
            log.warn("La laptop no debe contener id para crear.");
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(laptopRepository.save(laptop)) ;
    }

    @PutMapping("/update")
    public ResponseEntity<Laptop> update(@RequestBody Laptop laptop){
        if(laptop.getId()==null){
            log.warn("La laptop debe contener id para actualizar.");
            return ResponseEntity.badRequest().build();
        }
        if(!laptopRepository.existsById(laptop.getId())){
            log.warn(String.format("La laptop con el  id {id} no fue encontrado",laptop.getId()));
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(laptopRepository.save(laptop));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Laptop> delete(@PathVariable Long id){
        if(!laptopRepository.existsById(id)){
            log.warn(String.format("La laptop con el  id %s no fue encontrado",
                    id));
            return ResponseEntity.notFound().build();
        }
        laptopRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("/deleteAll")
    public ResponseEntity<?> deleteAll(){
        laptopRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }
}
