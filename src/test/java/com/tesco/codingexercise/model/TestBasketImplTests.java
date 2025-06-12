package com.tesco.codingexercise.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestBasketImplTests {
    private BasketImpl basket;


    @BeforeEach
    void setup() {

    }

    @Test
    void test_update_works() {
        // given
        List<Rule> rules = List.of(
                new BulkBuyLimit(10),
                new BulkBuyLimitCategory(5, "paracetamol"));
        basket = new BasketImpl(
                List.of(
                        new BasketItem(1L, "Paracetamol", 3),
                        new BasketItem(2L, "analgesic", 3),
                        new BasketItem(3L, "chocolate", 8),
                        new BasketItem(4L, "Paracetamol", 2)
                ),
                rules
        );

        // when
        String result = basket.validate();

        // then
        assertThat(result).isEqualTo("MET");
    }
}
