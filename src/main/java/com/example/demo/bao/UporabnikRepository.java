package com.example.demo.bao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.vao.Knjiga;
import com.example.demo.vao.Uporabnik;

public interface UporabnikRepository extends CrudRepository<Uporabnik, Long> { 

    @Query(value="SELECT*FROM uporabnik u WHERE u.ime='Peter' AND priimek='Novak'")
    List<Uporabnik> vrniDolocenegaUporabnikaImePriimek(String ime, String priimek);

    @Query(value="SELECT*FROM uporabnik u WHERE u.ime='Peter' AND knjiznaPolica='Harry Potter'")
    List<Uporabnik> vrniDolocenegaUporabnikaImeKnjiga(String ime, Knjiga knjiga);


    List<Uporabnik> vrniUporabnikaPoId(Long id);
    

    
}
