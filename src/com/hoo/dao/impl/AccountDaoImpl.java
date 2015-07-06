package com.hoo.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.hoo.dao.AccountDao;
import com.hoo.entity.Account;
import com.hoo.mapper.AccountMapper;
 
/**
 * function: Account数据库操作dao
 * @createDate 2015-96-28 下午10:38:12
 * @file AccountDaoImpl.java
 * @package com.hoo.dao.impl
 * @project FirstSSM
 * @version 1.0
 * @param <T>
 */
@SuppressWarnings("unchecked")
@Repository
public class AccountDaoImpl implements AccountDao {
    
    @Autowired
    private AccountMapper mapper;
    
    public boolean addAccount(Account entity) throws DataAccessException {
        boolean flag = false;
        try {
            mapper.addAccount(entity);
            flag = true;
        } catch (DataAccessException e) {
            flag = false;
            throw e;
        }
        return flag;
    }
 
    public Account getAccount(Integer id) throws DataAccessException {
    	Account entity = null;
        try {
            entity = (Account) mapper.getAccountById(String.valueOf(id));
        } catch (DataAccessException e) {
            throw e;
        }
        return entity;
    }
 
    public List<Account> getList() throws DataAccessException {
        return (List<Account>) mapper.getAllAccount();
    }

}
