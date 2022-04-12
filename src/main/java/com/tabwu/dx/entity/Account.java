package com.tabwu.dx.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @PROJECT_NAME: dx-seate-test
 * @USER: tabwu
 * @DATE: 2022/4/12 15:08
 * @DESCRIPTION:
 */
@Data
@Table(name = "account")
public class Account {
    @Id
    @KeySql(useGeneratedKeys = true)
    private int id;
    private String username;
    private double account;
}
