package com.tesco.codingexercise.model;

public class BulkBuyLimitCategory extends Rule{
    private String category;
    private Integer quantity;

    public BulkBuyLimitCategory(Integer quantity, String category) {
        quantity = quantity;
        category = category;
    }

    @Override
    public boolean validate(BasketItem basketItem) {
        if (basketItem.category().toLowerCase().equals(category.toLowerCase())) {
            if (basketItem.quantity() >= quantity) {
                return false;
            }
        }
        return true;
    }
}
