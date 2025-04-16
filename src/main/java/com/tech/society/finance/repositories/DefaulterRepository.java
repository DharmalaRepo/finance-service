package com.tech.society.finance.repositories;

import com.tech.society.finance.models.Defaulter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DefaulterRepository extends MongoRepository<Defaulter, String> {
    Defaulter findByCustomId(Long customId);
    void deleteByCustomId(long customId);

    List<Defaulter> findByCustomIdIn(List<Integer> customIds);

    void deleteAllByCustomIdIn(List<Integer> customIds);
}