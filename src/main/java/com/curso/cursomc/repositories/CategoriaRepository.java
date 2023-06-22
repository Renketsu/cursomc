package com.curso.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.cursomc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
