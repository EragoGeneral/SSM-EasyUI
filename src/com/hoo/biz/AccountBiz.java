package com.hoo.biz;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.hoo.entity.Account;
 
/**
 * function: biz层Account接口
 * @createDate 2015-06-28 下午10:48:51
 * @file AccountBiz.java
 * @package com.hoo.biz
 * @project FirstSSM
 * @version 1.0
 */
public interface AccountBiz {
    /**
     * function: 添加Account对象信息
     * @author hoojo
     * @createDate 2011-4-13 上午11:50:05
     * @param entity Account
     * @return boolean 是否成功
     * @throws DataAccessException
     */
    public boolean addAccount(Account entity) throws DataAccessException;
    
    /**
     * function: 根据id对到Account信息
     * @author hoojo
     * @createDate 2011-4-13 上午11:50:45
     * @param id 编号id
     * @return Account
     * @throws DataAccessException
     */
    public Account getAccount(Integer id) throws DataAccessException;
    
    /**
     * function: 查询所有Account信息
     * @author hoojo
     * @createDate 2011-4-13 上午11:51:45
     * @param id 编号id
     * @return Account
     * @throws DataAccessException
     */
    public List<Account> getList() throws DataAccessException;
}
