package com.fetch.rewards.receiptprocessor.service;

import com.fetch.rewards.receiptprocessor.dto.*;

import java.math.BigDecimal;

public class PointCalculatorService {

    public int pointCalculator(Receipt receipt){
        int points = 0;

        if(receipt != null){
            for(char c : receipt.getRetailer().toCharArray()){
                if(Character.isLetterOrDigit(c)){
                    points+= 1;
                }
            }
        }

        int deci = receipt.getTotal().indexOf(".");

        if(receipt.getTotal().substring(deci) == "00"){
            points += 50;
        }

        double totalDouble = Double.parseDouble(receipt.getTotal());
        double remainder = totalDouble % 0.25;

        if(remainder < 1e-9 ){
            points += 25;
        }

        int numItems = receipt.getItems().size();
        points += (numItems/2) * 5;



        return points;
    }
}
