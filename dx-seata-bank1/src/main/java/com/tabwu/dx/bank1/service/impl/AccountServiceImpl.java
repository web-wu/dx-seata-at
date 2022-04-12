package com.tabwu.dx.bank1.service.impl;

import com.tabwu.dx.bank1.feign.AccountFeign;
import com.tabwu.dx.bank1.mapper.AccountMapper;
import com.tabwu.dx.bank1.service.AccountService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @PROJECT_NAME: dx-parent
 * @USER: tabwu
 * @DATE: 2022/4/8 14:05
 * @DESCRIPTION:
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private AccountFeign accountFeign;

    @Override
    @Transactional
    @GlobalTransactional     //开启全局事务
    public int transferMoney(double money) {
        log.error("全局事务id======" + RootContext.getXID());
        int i = accountMapper.moneyOut(money * -1);
        String s = accountFeign.moneyIn(money);

        if (s.equals("fallback")) {
            throw new RuntimeException("下级服务发生异常");
        }

        if (money == 500) {
            throw new RuntimeException("服务发生异常");
        }

        return i;
    }
}
