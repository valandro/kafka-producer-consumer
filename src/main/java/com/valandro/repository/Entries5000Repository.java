package com.valandro.repository;

import com.valandro.data.Entries5000;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Entries5000Repository extends MongoRepository<Entries5000, Long> {
}