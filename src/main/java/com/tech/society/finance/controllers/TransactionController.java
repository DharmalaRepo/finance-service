package com.tech.society.finance.controllers;

import com.tech.society.finance.models.Transaction;
import com.tech.society.finance.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionRepository repository;

    @GetMapping
    public List<Transaction> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{customId}")
    public Transaction getByCustomId(@PathVariable long customId) {
        return repository.findByCustomId(customId);
    }

    @PostMapping
    public Transaction create(@RequestBody Transaction data) {
        return repository.save(data);
    }

    @PutMapping("/{customId}")
    public Transaction update(@PathVariable long customId, @RequestBody Transaction updated) {
        Transaction existing = repository.findByCustomId(customId);
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
    public List<Transaction> createMany(@RequestBody List<Transaction> list) {
        return repository.saveAll(list);
    }

    @PostMapping("/bulk-delete")
    public void deleteMany(@RequestBody List<Integer> ids) {
        repository.deleteAllByCustomIdIn(ids);
    }
}