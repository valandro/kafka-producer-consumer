package com.valandro.repository;

import com.valandro.data.Entries100000;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Entries100000Respository extends MongoRepository<Entries100000, Long> {
}
