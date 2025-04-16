package com.tech.society.finance.repositories;

import com.tech.society.finance.models.Budget;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BudgetRepository extends MongoRepository<Budget, String> {
    Budget findByCustomId(Long customId);
    void deleteByCustomId(int customId);

    List<Budget> findByCustomIdIn(List<Integer> customIds);

    void deleteAllByCustomIdIn(List<Integer> customIds);


}