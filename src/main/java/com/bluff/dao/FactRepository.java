package com.bluff.dao;

import com.bluff.entity.Fact;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FactRepository extends MongoRepository<Fact, String> {
}
