package com.tabwu.dx.bank1.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @PROJECT_NAME: dx-parent
 * @USER: tabwu
 * @DATE: 2022/4/8 14:49
 * @DESCRIPTION:
 */
//当前坐标版本对服务降级支持异常，应该调整版本
@FeignClient(name = "dx-bank2", fallback = ErrorAccountFeign.class)
//@RequestMapping("/account")
public interface AccountFeign {
    //将类上的//@RequestMapping("/account")的url拼接在方法上
    @GetMapping("/account/in/{money}")
    public String moneyIn(@PathVariable("money") double money) ;
}
