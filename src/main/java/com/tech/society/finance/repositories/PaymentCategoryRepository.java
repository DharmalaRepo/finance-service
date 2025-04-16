package com.tech.society.finance.repositories;

import com.tech.society.finance.models.PaymentCategory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentCategoryRepository extends MongoRepository<PaymentCategory, String> {
    PaymentCategory findByCustomId(Long customId);
    void deleteByCustomId(long customId);

    List<PaymentCategory> findByCustomIdIn(List<Integer> customIds);

    void deleteAllByCustomIdIn(List<Integer> customIds);

}