package com.tabwu.dx.bank2.controller;

import com.tabwu.dx.bank2.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @PROJECT_NAME: dx-parent
 * @USER: tabwu
 * @DATE: 2022/4/8 14:00
 * @DESCRIPTION:
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/in/{money}")
    public String moneyIn(@PathVariable("money") double money) {
        int i = accountService.transferMoney(money);
        return "数据影响行数+++" + i;
    }
}
