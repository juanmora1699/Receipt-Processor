package com.fetch.rewards.receiptprocessor.service;

import com.fetch.rewards.receiptprocessor.dto.*;

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

        return points;
    }
}
