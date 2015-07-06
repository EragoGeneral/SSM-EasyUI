package com.hoo.biz.impl;

import java.util.List;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import com.hoo.biz.AccountBiz;
import com.hoo.dao.AccountDao;
import com.hoo.entity.Account;
import com.hoo.exception.BizException;
 
/**
 * function: Account Biz接口实现
 * @createDate 2015-06-28 下午10:51:18
 * @file AccountBizImpl.java
 * @package com.hoo.biz.impl
 * @project FirstSSM
 * @version 1.0
 */
//@Component
@Service
public class AccountBizImpl implements AccountBiz {
    
    @Autowired
    private AccountDao dao;
    
    public boolean addAccount(Account entity) throws DataAccessException {
        if (entity == null) {
            throw new BizException(Account.class.getName() + "对象参数信息为Empty！");
        }
        return dao.addAccount(entity);
    }
 
    public Account getAccount(Integer id) throws DataAccessException {
        return dao.getAccount(id);
    }
 
    public List<Account> getList() throws DataAccessException {
        return dao.getList();
    }
}