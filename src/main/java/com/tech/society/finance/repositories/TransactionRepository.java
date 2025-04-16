package com.tech.society.finance.repositories;

import com.tech.society.finance.models.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, String> {
    Transaction findByCustomId(Long customId);
    void deleteByCustomId(long customId);

    List<Transaction> findByCustomIdIn(List<Integer> customIds);

    void deleteAllByCustomIdIn(List<Integer> customIds);
}