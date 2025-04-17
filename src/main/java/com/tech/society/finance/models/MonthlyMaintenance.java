package com.tech.society.finance.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "monthly_maintenance")
public class MonthlyMaintenance {

    @Id
    private String id;
    private Integer customId;
    private String flatNumber;
    private String residentName;
    private Integer year;
    private String month;
    private Double amountDue;
    private Double amountPaid;
    private String status; // Paid, Unpaid, Partial
    private String comments;
    private LocalDateTime createdDate;
    private String createdBy;
    private LocalDateTime modifiedDate;
    private String modifiedBy;
    private Integer isActive;

    public MonthlyMaintenance() {
    }

    private int societyId;

    public int getSocietyId() {
        return societyId;
    }

    public void setSocietyId(int societyId) {
        this.societyId = societyId;
    }


    public MonthlyMaintenance(String id, Integer customId, String flatNumber, String residentName, Integer year, String month,
                              Double amountDue, Double amountPaid, String status, String comments,
                              LocalDateTime createdDate, String createdBy, LocalDateTime modifiedDate,
                              String modifiedBy, Integer isActive) {
        this.id = id;
        this.customId = customId;
        this.flatNumber = flatNumber;
        this.residentName = residentName;
        this.year = year;
        this.month = month;
        this.amountDue = amountDue;
        this.amountPaid = amountPaid;
        this.status = status;
        this.comments = comments;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
        this.modifiedDate = modifiedDate;
        this.modifiedBy = modifiedBy;
        this.isActive = isActive;
    }

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

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getResidentName() {
        return residentName;
    }

    public void setResidentName(String residentName) {
        this.residentName = residentName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(Double amountDue) {
        this.amountDue = amountDue;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
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
        return "MonthlyMaintenance{" +
                "id='" + id + '\'' +
                ", customId=" + customId +
                ", flatNumber='" + flatNumber + '\'' +
                ", residentName='" + residentName + '\'' +
                ", year=" + year +
                ", month='" + month + '\'' +
                ", amountDue=" + amountDue +
                ", amountPaid=" + amountPaid +
                ", status='" + status + '\'' +
                ", comments='" + comments + '\'' +
                ", createdDate=" + createdDate +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedDate=" + modifiedDate +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
