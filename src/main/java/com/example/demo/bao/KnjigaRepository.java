package com.example.demo.bao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.vao.Knjiga;

public interface KnjigaRepository extends CrudRepository<Knjiga, Long> { 
    
}
