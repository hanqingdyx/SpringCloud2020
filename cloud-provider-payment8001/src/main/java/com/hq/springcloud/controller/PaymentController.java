/**
 * 工程名：springcloud2020
 * 包  名：com.hq.springcloud.controller
 * 文件名：PaymentController.java
 * 日  期：2021/7/5
 * Copyright (c) 2017 梯升-版权所有
 */
package com.hq.springcloud.controller;

import com.hq.springcloud.entities.CommonResult;
import com.hq.springcloud.entities.Payment;
import com.hq.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <b>类  名：</b>PaymentController<br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>hanqing<br/>
 * <b>创建时间：</b>2021/7/5<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b><br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0.0<br />
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*****插入结果：" + result);

        if (result > 0) {
//            return new CommonResult(200, "插入数据库成功,serverPort: " + serverPort, result);
            return new CommonResult(200, "插入数据库成功,serverPort: ", result);
        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        System.out.println("1234");
        if (payment != null) {
//            return new CommonResult(200, "查询成功,serverPort:  " + serverPort, payment);
            return new CommonResult(200, "查询成功,serverPort:  ", payment);
        } else {
            return new CommonResult(444, "没有对应记录,查询ID: " + id, null);
        }
    }

}
