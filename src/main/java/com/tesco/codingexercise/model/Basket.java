package com.tesco.codingexercise.model;

import java.util.List;

public interface Basket {
    String validate(List<BasketItem>, List<Rule>);
}
