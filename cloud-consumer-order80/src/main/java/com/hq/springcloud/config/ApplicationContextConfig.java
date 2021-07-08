/**
 * 工程名：springcloud2020
 * 包  名：com.hq.springcloud.config
 * 文件名：ApplicationContextConfig.java
 * 日  期：2021/7/7
 * Copyright (c) 2017 梯升-版权所有
 */
package com.hq.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <b>类  名：</b>ApplicationContextConfig<br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>hanqing<br/>
 * <b>创建时间：</b>2021/7/7<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b><br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0.0<br />
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //赋予RestTemplate赋值均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
