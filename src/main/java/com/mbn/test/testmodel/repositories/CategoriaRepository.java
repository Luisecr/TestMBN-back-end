package com.mbn.test.testmodel.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mbn.test.testmodel.entities.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {

}
