package com.tech.society.finance.repositories;

import com.tech.society.finance.models.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends MongoRepository<Payment, String> {
    Payment findByCustomId(Long customId);

    void deleteByCustomId(long customId);

    List<Payment> findByCustomIdIn(List<Integer> customIds);

    void deleteAllByCustomIdIn(List<Integer> customIds);
}