package com.example.demo.bao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.vao.Uporabnik;

public interface UporabnikRepository extends CrudRepository<Uporabnik, Long> { 
    
}

