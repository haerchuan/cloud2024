package com.atguigu.cloud.service;

import com.atguigu.cloud.entities.Order;

/**
 * @Description
 * @Author xmy
 * @Date 2024/4/6
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);

}
