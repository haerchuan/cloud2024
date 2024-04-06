package com.atguigu.cloud.service;

/**
 * @Description
 * @Author xmy
 * @Date 2024/4/6
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
