package com.tech.society.finance.controllers;

import com.tech.society.finance.models.IncomeSource;
import com.tech.society.finance.repositories.IncomeSourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/income-sources")
public class IncomeSourceController {

    @Autowired
    private IncomeSourceRepository repository;

    @GetMapping
    public List<IncomeSource> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{customId}")
    public IncomeSource getByCustomId(@PathVariable long customId) {
        return repository.findByCustomId(customId);
    }

    @PostMapping
    public IncomeSource create(@RequestBody IncomeSource data) {
        return repository.save(data);
    }

    @PutMapping("/{customId}")
    public IncomeSource update(@PathVariable long customId, @RequestBody IncomeSource updated) {
        IncomeSource existing = repository.findByCustomId(customId);
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
    public List<IncomeSource> createMany(@RequestBody List<IncomeSource> list) {
        return repository.saveAll(list);
    }

    @PostMapping("/bulk-delete")
    public void deleteMany(@RequestBody List<Integer> ids) {
        repository.deleteAllByCustomIdIn(ids);
    }
}