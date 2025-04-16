package com.tech.society.finance.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "payment_categories")
public class PaymentCategory {

    @Id
    private String id;
    private long customId;
    private String category;
    private String type; // "INCOME" or "EXPENSE"
    private String name;
    private List<String> subcategories;
    private String comments;
    private LocalDateTime createdDate;
    private String createdBy;
    private LocalDateTime modifiedDate;
    private String modifiedBy;
    private int isActive;

    public PaymentCategory() {}

    public PaymentCategory(String id, long customId, String category, String type, String name, List<String> subcategories,
                           String comments, LocalDateTime createdDate, String createdBy,
                           LocalDateTime modifiedDate, String modifiedBy, int isActive) {
        this.id = id;
        this.customId = customId;
        this.category = category;
        this.type = type;
        this.name = name;
        this.subcategories = subcategories;
        this.comments = comments;
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

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<String> getSubcategories() { return subcategories; }

    public void setSubcategories(List<String> subcategories) { this.subcategories = subcategories; }

    public String getComments() { return comments; }

    public void setComments(String comments) { this.comments = comments; }

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
        return "PaymentCategory{" +
                "id='" + id + '\'' +
                ", customId=" + customId +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", subcategories=" + subcategories +
                ", comments='" + comments + '\'' +
                ", createdDate=" + createdDate +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedDate=" + modifiedDate +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}