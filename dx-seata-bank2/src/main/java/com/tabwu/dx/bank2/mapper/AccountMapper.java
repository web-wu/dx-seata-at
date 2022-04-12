package com.tabwu.dx.bank2.mapper;

import com.tabwu.dx.entity.Account;
import org.apache.ibatis.annotations.Update;
import tk.mybatis.mapper.common.Mapper;

/**
 * @PROJECT_NAME: dx-parent
 * @USER: tabwu
 * @DATE: 2022/4/8 14:01
 * @DESCRIPTION:
 */
public interface AccountMapper extends Mapper<Account> {

    @Update("UPDATE accout SET account = account + #{money} WHERE id = 1; ")
    int moneyOut(double money);
}
