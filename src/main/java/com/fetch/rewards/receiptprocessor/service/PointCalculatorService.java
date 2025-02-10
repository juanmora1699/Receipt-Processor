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

        int deci;
        if(receipt.getTotal() != null){
            deci = receipt.getTotal().indexOf(".");

            if(receipt.getTotal().substring(deci + 1).equals("00")){
            points += 50;
            }
        }
        double totalDouble = Double.parseDouble(receipt.getTotal());
        double remainder = totalDouble % 0.25;

        if(remainder < 1e-9 ){
            points += 25;
        }

        int numItems;
        if (receipt.getItems() != null){
            numItems = receipt.getItems().size();
        }else{
            numItems = 0;
        }
        points += (numItems/2) * 5;



        return points;
    }
}
