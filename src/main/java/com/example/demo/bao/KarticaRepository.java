package com.example.demo.bao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.vao.Kartica;

public interface KarticaRepository extends CrudRepository<Kartica, Long> { 
    
}

