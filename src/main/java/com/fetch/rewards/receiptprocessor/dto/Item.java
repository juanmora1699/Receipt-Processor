package com.fetch.rewards.receiptprocessor.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {

    @JsonProperty("shortDescription")
    private String shortDescription;

    @JsonProperty("price")
    private String price;

    public Item(){
    }

    public Item(String shortDescription, String price){
        this.shortDescription = shortDescription;
        this.price = price;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getPrice() {
        return price;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
