package com.example.Internet.shop.controllers;

import com.example.Internet.shop.interfaces.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(path = "/add")
    public String addId(@RequestParam List<Integer> id) {
        return orderService.addId(id);
    }

    @GetMapping(path = "/get")
    public String getOrder() {
        return orderService.getId();
    }
}