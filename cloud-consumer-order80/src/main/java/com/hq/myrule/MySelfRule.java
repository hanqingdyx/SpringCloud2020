/**
 * 工程名：springcloud2020
 * 包  名：com.hq.myrule
 * 文件名：MySelfRule.java
 * 日  期：2021/7/10
 * Copyright (c) 2017 梯升-版权所有
 */
package com.hq.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <b>类  名：</b>MySelfRule<br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>hanqing<br/>
 * <b>创建时间：</b>2021/7/10<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b><br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0.0<br />
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        //规则改为随机
        return new RandomRule();
    }
}
