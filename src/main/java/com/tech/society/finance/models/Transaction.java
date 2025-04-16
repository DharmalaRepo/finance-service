package com.tech.society.finance.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "transactions")
public class Transaction {

    @Id
    private String id;
    private long customId;
    private String referenceId; // Could be linked to a payment, income, or expenditure
    private String transactionType; // CREDIT/DEBIT
    private String transactionMode; // CASH/ONLINE/CHEQUE etc.
    private double amount;
    private String remarks;
    private LocalDateTime transactionDate;
    private LocalDateTime createdDate;
    private String createdBy;
    private LocalDateTime modifiedDate;
    private String modifiedBy;
    private int isActive;

    public Transaction() {}

    public Transaction(String id, long customId, String referenceId, String transactionType, String transactionMode,
                       double amount, String remarks, LocalDateTime transactionDate,
                       LocalDateTime createdDate, String createdBy, LocalDateTime modifiedDate,
                       String modifiedBy, int isActive) {
        this.id = id;
        this.customId = customId;
        this.referenceId = referenceId;
        this.transactionType = transactionType;
        this.transactionMode = transactionMode;
        this.amount = amount;
        this.remarks = remarks;
        this.transactionDate = transactionDate;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
        this.modifiedDate = modifiedDate;
        this.modifiedBy = modifiedBy;
        this.isActive = isActive;
    }

    // Getters and Setters

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public long getCustomId() { return customId; }

    public void setCustomId(long customId) { this.customId = customId; }

    public String getReferenceId() { return referenceId; }

    public void setReferenceId(String referenceId) { this.referenceId = referenceId; }

    public String getTransactionType() { return transactionType; }

    public void setTransactionType(String transactionType) { this.transactionType = transactionType; }

    public String getTransactionMode() { return transactionMode; }

    public void setTransactionMode(String transactionMode) { this.transactionMode = transactionMode; }

    public double getAmount() { return amount; }

    public void setAmount(double amount) { this.amount = amount; }

    public String getRemarks() { return remarks; }

    public void setRemarks(String remarks) { this.remarks = remarks; }

    public LocalDateTime getTransactionDate() { return transactionDate; }

    public void setTransactionDate(LocalDateTime transactionDate) { this.transactionDate = transactionDate; }

    public LocalDateTime getCreatedDate() { return createdDate; }

    public void setCreatedDate(LocalDateTime createdDate) { this.createdDate = createdDate; }

    public String getCreatedBy() { return createdBy; }

    public void setCreatedBy(String createdBy) { this.createdBy = createdBy; }

    public LocalDateTime getModifiedDate() { return modifiedDate; }

    public void setModifiedDate(LocalDateTime modifiedDate) { this.modifiedDate = modifiedDate; }

    public String getModifiedBy() { return modifiedBy; }

    public void setModifiedBy(String modifiedBy) { this.modifiedBy = modifiedBy; }

    public int getIsActive() { return isActive; }

    public void setIsActive(int isActive) { this.isActive = isActive; }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", customId=" + customId +
                ", referenceId='" + referenceId + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", transactionMode='" + transactionMode + '\'' +
                ", amount=" + amount +
                ", remarks='" + remarks + '\'' +
                ", transactionDate=" + transactionDate +
                ", createdDate=" + createdDate +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedDate=" + modifiedDate +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}