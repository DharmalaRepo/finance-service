package com.tech.society.finance.controllers;

import com.tech.society.finance.models.Defaulter;
import com.tech.society.finance.repositories.DefaulterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/defaulters")
public class DefaulterController {

    @Autowired
    private DefaulterRepository repository;

    @GetMapping
    public List<Defaulter> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{customId}")
    public Defaulter getByCustomId(@PathVariable long customId) {
        return repository.findByCustomId(customId);
    }

    @PostMapping
    public Defaulter create(@RequestBody Defaulter data) {
        return repository.save(data);
    }

    @PutMapping("/{customId}")
    public Defaulter update(@PathVariable long customId, @RequestBody Defaulter updated) {
        Defaulter existing = repository.findByCustomId(customId);
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
    public List<Defaulter> createMany(@RequestBody List<Defaulter> list) {
        return repository.saveAll(list);
    }

    @PostMapping("/bulk-delete")
    public void deleteMany(@RequestBody List<Integer> ids) {
        repository.deleteAllByCustomIdIn(ids);
    }
}