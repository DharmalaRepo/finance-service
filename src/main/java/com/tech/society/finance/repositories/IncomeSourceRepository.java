package com.tech.society.finance.repositories;

import com.tech.society.finance.models.IncomeSource;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IncomeSourceRepository extends MongoRepository<IncomeSource, String> {
    IncomeSource findByCustomId(Long customId);
    void deleteByCustomId(long customId);

    List<IncomeSource> findByCustomIdIn(List<Integer> customIds);

    void deleteAllByCustomIdIn(List<Integer> customIds);
}