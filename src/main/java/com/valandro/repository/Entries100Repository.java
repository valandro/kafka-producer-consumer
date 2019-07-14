package com.valandro.repository;

import com.valandro.data.Entries100;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Entries100Repository extends MongoRepository<Entries100, Long> {
}