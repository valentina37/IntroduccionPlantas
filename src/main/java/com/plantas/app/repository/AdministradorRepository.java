package com.plantas.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.plantas.app.entity.Administrador;

public interface AdministradorRepository extends MongoRepository<Administrador, String> {

}
