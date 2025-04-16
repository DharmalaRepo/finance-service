package com.tech.society.finance.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "expenditures")
public class Expenditure {

    @Id
    private String id;
    private Integer customId;
    private Double amount;
    private String paidTo;
    private String expenseType; // e.g., SALARY, REPAIR, BILLS
    private String category;
    private String subCategory;
    private String paymentMode; // e.g., CASH, ONLINE, CHEQUE
    private Date expenseDate;
    private String remarks;

    private Date createdDate;
    private String createdBy;
    private Date modifiedDate;
    private String modifiedBy;
    private Integer isActive;

    public Expenditure() {}

    public Expenditure(String id, Integer customId, Double amount, String paidTo, String expenseType, String category,
                       String subCategory, String paymentMode, Date expenseDate, String remarks,
                       Date createdDate, String createdBy, Date modifiedDate, String modifiedBy, Integer isActive) {
        this.id = id;
        this.customId = customId;
        this.amount = amount;
        this.paidTo = paidTo;
        this.expenseType = expenseType;
        this.category = category;
        this.subCategory = subCategory;
        this.paymentMode = paymentMode;
        this.expenseDate = expenseDate;
        this.remarks = remarks;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
        this.modifiedDate = modifiedDate;
        this.modifiedBy = modifiedBy;
        this.isActive = isActive;
    }

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCustomId() {
        return customId;
    }

    public void setCustomId(Integer customId) {
        this.customId = customId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPaidTo() {
        return paidTo;
    }

    public void setPaidTo(String paidTo) {
        this.paidTo = paidTo;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Expenditure{" +
                "id='" + id + '\'' +
                ", customId=" + customId +
                ", amount=" + amount +
                ", paidTo='" + paidTo + '\'' +
                ", expenseType='" + expenseType + '\'' +
                ", category='" + category + '\'' +
                ", subCategory='" + subCategory + '\'' +
                ", paymentMode='" + paymentMode + '\'' +
                ", expenseDate=" + expenseDate +
                ", remarks='" + remarks + '\'' +
                ", createdDate=" + createdDate +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedDate=" + modifiedDate +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}

