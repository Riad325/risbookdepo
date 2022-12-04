package com.example.demo.bao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.vao.Placilo;

public interface PlaciloRepository extends CrudRepository<Placilo, Long> { 
    
}
