package org.bz.dao;

import org.bz.entity.Order;

public interface OrderDAO {
    //创建订单方法
    void createOrder(Order order);
}
