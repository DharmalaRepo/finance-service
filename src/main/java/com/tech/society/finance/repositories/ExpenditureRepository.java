package com.tech.society.finance.repositories;

import com.tech.society.finance.models.Expenditure;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenditureRepository extends MongoRepository<Expenditure, String> {
    Expenditure findByCustomId(Long customId);
    void deleteByCustomId(long customId);

    List<Expenditure> findByCustomIdIn(List<Integer> customIds);

    void deleteAllByCustomIdIn(List<Integer> customIds);
}