package com.tech.society.finance.controllers;

import com.tech.society.finance.models.Budget;
import com.tech.society.finance.repositories.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/budgets")
public class BudgetController {

    @Autowired
    private BudgetRepository repository;

    @GetMapping
    public List<Budget> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{customId}")
    public Budget getByCustomId(@PathVariable long customId) {
        return repository.findByCustomId(customId);
    }

    @PostMapping
    public Budget create(@RequestBody Budget data) {
        return repository.save(data);
    }

    @PutMapping("/{customId}")
    public Budget update(@PathVariable long customId, @RequestBody Budget updated) {
        Budget existing = repository.findByCustomId(customId);
        if (existing != null) {
            updated.setId(existing.getId());
            return repository.save(updated);
        }
        return null;
    }

    @DeleteMapping("/{customId}")
    public void delete(@PathVariable long customId) {
        repository.deleteByCustomId((int) customId);
    }

    @PostMapping("/bulk")
    public List<Budget> createMany(@RequestBody List<Budget> list) {
        return repository.saveAll(list);
    }

    @PostMapping("/bulk-delete")
    public void deleteMany(@RequestBody List<Integer> ids) {
        repository.deleteAllByCustomIdIn(ids);
    }
}