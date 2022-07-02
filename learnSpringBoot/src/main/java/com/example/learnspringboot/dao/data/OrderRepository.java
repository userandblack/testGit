package com.example.learnspringboot.dao.data;

import com.example.learnspringboot.dao.Order;

public interface OrderRepository {
    Order save(Order order);
}
