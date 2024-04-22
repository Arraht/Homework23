package com.example.Internet.shop.services;

import com.example.Internet.shop.cart.Cart;
import com.example.Internet.shop.interfaces.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final Cart cart;

    public OrderServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String addId(List<Integer> id) {
        return cart.addId(id);
    }

    @Override
    public String getId() {
        return cart.getId()
                .toString();
    }
}