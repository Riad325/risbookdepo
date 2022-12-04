package com.example.demo.bao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.vao.Administrator;

public interface AdministratorRepository extends CrudRepository<Administrator, Long> { 
    
}

