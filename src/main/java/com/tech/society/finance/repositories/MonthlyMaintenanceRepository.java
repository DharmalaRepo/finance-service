package com.tech.society.finance.repositories;

import com.tech.society.finance.models.MonthlyMaintenance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonthlyMaintenanceRepository extends MongoRepository<MonthlyMaintenance, String> {
    MonthlyMaintenance findByCustomId(Long customId);

    List<MonthlyMaintenance> findByCustomIdIn(List<Integer> customIds);
    void deleteByCustomId(Integer customId);

    void deleteByCustomId(long customId);

    void deleteAllByCustomIdIn(List<Integer> customIds);
}