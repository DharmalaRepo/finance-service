package com.tech.society.finance.controllers;

import com.tech.society.finance.models.PaymentCategory;
import com.tech.society.finance.repositories.PaymentCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment-categories")
public class PaymentCategoryController {

    @Autowired
    private PaymentCategoryRepository repository;

    @GetMapping
    public List<PaymentCategory> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{customId}")
    public PaymentCategory getByCustomId(@PathVariable long customId) {
        return repository.findByCustomId((long) customId);
    }

    @PostMapping
    public PaymentCategory create(@RequestBody PaymentCategory data) {
        return repository.save(data);
    }

    @PutMapping("/{customId}")
    public PaymentCategory update(@PathVariable long customId, @RequestBody PaymentCategory updated) {
        PaymentCategory existing = repository.findByCustomId(customId);
        if (existing != null) {
            updated.setId(existing.getId());
            return repository.save(updated);
        }
        return null;
    }

    @DeleteMapping("/{customId}")
    public void delete(@PathVariable long customId) {
        repository.deleteByCustomId(customId);
    }

    @PostMapping("/bulk")
    public List<PaymentCategory> createMany(@RequestBody List<PaymentCategory> list) {
        return repository.saveAll(list);
    }

    @PostMapping("/bulk-delete")
    public void deleteMany(@RequestBody List<Integer> ids) {
        repository.deleteAllByCustomIdIn(ids);
    }
}