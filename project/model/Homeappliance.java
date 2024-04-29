package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Homeappliance{
    @Id
    int custId;
    String custName;
    String appliance;
    String brand;
    String serviceCenter;
    String contact;
    String address;
    String price;
    String discount;
    public int getCustId() {
        return custId;
    }
    public void setCustId(int custId) {
        this.custId = custId;
    }
    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public String getAppliance() {
        return appliance;
    }
    public void setAppliance(String appliance) {
        this.appliance = appliance;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getServiceCenter() {
        return serviceCenter;
    }
    public void setServiceCenter(String serviceCenter) {
        this.serviceCenter = serviceCenter;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getDiscount() {
        return discount;
    }
    public void setDiscount(String discount) {
        this.discount = discount;
    }

}