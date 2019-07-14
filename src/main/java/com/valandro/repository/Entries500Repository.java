package com.valandro.repository;

import com.valandro.data.Entries500;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Entries500Repository extends MongoRepository<Entries500, Long> {
}