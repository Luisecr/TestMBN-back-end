package com.mbn.test.testmodel.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mbn.test.testmodel.entities.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

}
