package com.atguigu.cloud.service;

import org.apache.ibatis.annotations.Param;

/**
 * @Description
 * @Author xmy
 * @Date 2024/4/6
 */
public interface AccountService {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 本次消费金额
     */
    void decrease(@Param("userId") Long userId, @Param("money") Long money);
}
