package com.tech.society.finance.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "defaulters")
public class Defaulter {

    @Id
    private String id;
    private Integer customId;
    private String residentId;
    private String residentName;
    private String flatNo;
    private String contact;
    private Double dueAmount;
    private Integer dueMonth;
    private Integer dueYear;
    private String reason;

    private Date createdDate;
    private String createdBy;
    private Date modifiedDate;
    private String modifiedBy;
    private Integer isActive;

    public Defaulter() {
    }

    public Defaulter(String id, Integer customId, String residentId, String residentName, String flatNo,
                     String contact, Double dueAmount, Integer dueMonth, Integer dueYear, String reason,
                     Date createdDate, String createdBy, Date modifiedDate, String modifiedBy, Integer isActive) {
        this.id = id;
        this.customId = customId;
        this.residentId = residentId;
        this.residentName = residentName;
        this.flatNo = flatNo;
        this.contact = contact;
        this.dueAmount = dueAmount;
        this.dueMonth = dueMonth;
        this.dueYear = dueYear;
        this.reason = reason;
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

    public String getResidentId() {
        return residentId;
    }

    public void setResidentId(String residentId) {
        this.residentId = residentId;
    }

    public String getResidentName() {
        return residentName;
    }

    public void setResidentName(String residentName) {
        this.residentName = residentName;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Double getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(Double dueAmount) {
        this.dueAmount = dueAmount;
    }

    public Integer getDueMonth() {
        return dueMonth;
    }

    public void setDueMonth(Integer dueMonth) {
        this.dueMonth = dueMonth;
    }

    public Integer getDueYear() {
        return dueYear;
    }

    public void setDueYear(Integer dueYear) {
        this.dueYear = dueYear;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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
        return "Defaulter{" +
                "id='" + id + '\'' +
                ", customId=" + customId +
                ", residentId='" + residentId + '\'' +
                ", residentName='" + residentName + '\'' +
                ", flatNo='" + flatNo + '\'' +
                ", contact='" + contact + '\'' +
                ", dueAmount=" + dueAmount +
                ", dueMonth=" + dueMonth +
                ", dueYear=" + dueYear +
                ", reason='" + reason + '\'' +
                ", createdDate=" + createdDate +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedDate=" + modifiedDate +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
