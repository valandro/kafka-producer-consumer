package com.valandro.repository;

import com.valandro.data.Entries50000;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Entries50000Repository extends MongoRepository<Entries50000, Long> {
}
