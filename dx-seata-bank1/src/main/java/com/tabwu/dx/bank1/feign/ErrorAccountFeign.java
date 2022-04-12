package com.tabwu.dx.bank1.feign;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @PROJECT_NAME: dx-parent
 * @USER: tabwu
 * @DATE: 2022/4/8 14:58
 * @DESCRIPTION:
 */
@Slf4j
@Component
public class ErrorAccountFeign implements /*FallbackFactory ,*/AccountFeign {


    @Override
    public String moneyIn(double money) {
        log.error("远程调用失败哦");
        return "fallback";
    }

//    @Override
//    public Object create(Throwable throwable) {
//        log.error(throwable.getMessage());
//        return 0000000000000;
//    }
}

