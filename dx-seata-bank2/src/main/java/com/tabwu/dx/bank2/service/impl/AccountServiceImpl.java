package com.tabwu.dx.bank2.service.impl;

import com.tabwu.dx.bank2.mapper.AccountMapper;
import com.tabwu.dx.bank2.service.AccountService;
import io.seata.core.context.RootContext;
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

    @Override
    @Transactional
    public int transferMoney(double money) {
        log.error("全局事务id======" + RootContext.getXID());
        if (money == 200) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (money == 300) {
            int i = 1 / 0;
        }
        return accountMapper.moneyOut(money);
    }
}
