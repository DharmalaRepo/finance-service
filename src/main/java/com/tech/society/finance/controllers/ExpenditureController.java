package com.tech.society.finance.controllers;

import com.tech.society.finance.models.Expenditure;
import com.tech.society.finance.repositories.ExpenditureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenditures")
public class ExpenditureController {

    @Autowired
    private ExpenditureRepository repository;

    @GetMapping
    public List<Expenditure> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{customId}")
    public Expenditure getByCustomId(@PathVariable long customId) {
        return repository.findByCustomId(customId);
    }

    @PostMapping
    public Expenditure create(@RequestBody Expenditure data) {
        return repository.save(data);
    }

    @PutMapping("/{customId}")
    public Expenditure update(@PathVariable long customId, @RequestBody Expenditure updated) {
        Expenditure existing = repository.findByCustomId(customId);
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
    public List<Expenditure> createMany(@RequestBody List<Expenditure> list) {
        return repository.saveAll(list);
    }

    @PostMapping("/bulk-delete")
    public void deleteMany(@RequestBody List<Integer> ids) {
        repository.deleteAllByCustomIdIn(ids);
    }
}