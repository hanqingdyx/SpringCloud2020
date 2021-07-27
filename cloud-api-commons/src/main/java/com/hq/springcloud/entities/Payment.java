/**
 * 工程名：springcloud2020
 * 包  名：com.hq.springcloud.entities
 * 文件名：Payment.java
 * 日  期：2021/7/7
 * Copyright (c) 2017 梯升-版权所有
 */
package com.hq.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <b>类  名：</b>Payment<br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>hanqing<br/>
 * <b>创建时间：</b>2021/7/7<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b><br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0.0<br />
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
