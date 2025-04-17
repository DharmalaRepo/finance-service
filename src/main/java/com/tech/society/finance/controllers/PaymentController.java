package com.tech.society.finance.controllers;

import com.tech.society.finance.models.Payment;
import com.tech.society.finance.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;

    @GetMapping("/health")
    public ResponseEntity<?> health() {
        return ResponseEntity.ok("Hello, welcome to Society Finance Service..!!");
    }

    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @GetMapping("/{customId}")
    public Payment getByCustomId(@PathVariable long customId) {
        return paymentRepository.findByCustomId(customId);
    }

    @PostMapping
    public Payment create(@RequestBody Payment payment) {
        return paymentRepository.save(payment);
    }

    @PutMapping("/{customId}")
    public Payment update(@PathVariable long customId, @RequestBody Payment payment) {
        Payment existing = paymentRepository.findByCustomId(customId);
        if (existing != null) {
            payment.setId(existing.getId());
            return paymentRepository.save(payment);
        }
        return null;
    }

    @DeleteMapping("/{customId}")
    public void delete(@PathVariable long customId) {
        paymentRepository.deleteByCustomId(customId);
    }

    @PostMapping("/bulk")
    public List<Payment> insertMany(@RequestBody List<Payment> payments) {
        return paymentRepository.saveAll(payments);
    }

    @PostMapping("/bulk-delete")
    public void deleteMany(@RequestBody List<Integer> ids) {
        paymentRepository.deleteAllByCustomIdIn(ids);
    }
}