package com.tesco.codingexercise.model;

public class BulkBuyLimit extends Rule {
    private Integer quantity;

    public BulkBuyLimit(Integer quantity) {
        quantity = quantity;
    }

    @Override
    public boolean validate(BasketItem item) {
        return item.quantity() >= quantity;
    }
}
