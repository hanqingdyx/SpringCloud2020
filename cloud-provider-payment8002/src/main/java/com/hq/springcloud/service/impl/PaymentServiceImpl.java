/**
 * 工程名：springcloud2020
 * 包  名：com.hq.springcloud.service.impl
 * 文件名：PaymentServiceImpl.java
 * 日  期：2021/7/5
 * Copyright (c) 2017 梯升-版权所有
 */
package com.hq.springcloud.service.impl;

import com.hq.springcloud.dao.PaymentDao;
import com.hq.springcloud.entities.Payment;
import com.hq.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <b>类  名：</b>PaymentServiceImpl<br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>hanqing<br/>
 * <b>创建时间：</b>2021/7/5<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b><br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0.0<br />
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
