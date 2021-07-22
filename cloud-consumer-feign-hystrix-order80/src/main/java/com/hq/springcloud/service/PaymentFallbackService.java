/**
 * 工程名：springcloud2020
 * 包  名：com.hq.springcloud.service
 * 文件名：PaymentFallbackService.java
 * 日  期：2021/7/21
 * Copyright (c) 2017 梯升-版权所有
 */
package com.hq.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * <b>类  名：</b>PaymentFallbackService<br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>hanqing<br/>
 * <b>创建时间：</b>2021/7/21<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b><br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0.0<br />
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
