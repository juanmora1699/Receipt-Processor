package com.fetch.rewards.receiptprocessor.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Receipt {

    @JsonProperty("retailer")
    private String retailer;

    @JsonProperty("purchaseDate")
    private String purchaseDate;

    @JsonProperty("purchaseTime")
    private String purchaseTime;

    @JsonProperty("items")
    private List<Item> items;

    @JsonProperty("total")
    private String total;

    public Receipt(){
    }

    public Receipt(String retailer, String purchaseDate, String purchaseTime, List<Item> items, String total){
        this.retailer = retailer;
        this.purchaseDate = purchaseDate;
        this.purchaseTime = purchaseTime;
        this.items = items;
        this.total = total;
    }

    public String getRetailer() {
        return retailer;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public String getPurchaseTime() {
        return purchaseTime;
    }

    public List<Item> getItems() {
        return items;
    }

    public String getTotal() {
        return total;
    }

    public void setRetailer(String retailer) {
        this.retailer = retailer;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setPurchaseTime(String purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void setTotal(String total) {
        this.total = total;
    }

}
