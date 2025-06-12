package com.tesco.codingexercise.model;

import java.util.List;

public class BasketImpl implements Basket {

    public String validate(List<BasketItem> basketItems, List<Rule> restrictions) {
        for (BasketItem item : basketItems) {
            for(Rule restriction : restrictions) {
                boolean test = restriction.validate(item);
                if (!test) {
                    return "BREACHED";
                }
            }
        }
        return "MET";
    }
 }
