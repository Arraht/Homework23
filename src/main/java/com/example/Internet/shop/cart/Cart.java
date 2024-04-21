package com.example.Internet.shop.cart;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SessionScope
@Component
public class Cart {
    private final List<Integer> listShopping;

    public Cart() {
        this.listShopping = new ArrayList<>();
    }

    public String addId(List<Integer> id) {
        listShopping.addAll(id);
        return "Товар добавлен в корзину";
    }

    public List<Integer> getId() {
        return Collections.unmodifiableList(listShopping);
    }
}
