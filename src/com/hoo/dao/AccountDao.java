package com.hoo.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;
import com.hoo.entity.Account;
 
/**
 * function: Account数据库操作dao接口
 * @createDate 2015-06-28 下午10:33:36
 * @file AccountDao.java
 * @package com.hoo.dao
 * @project FirstSSM
 * @version 1.0
 * @param <T>
 */
public interface AccountDao {
    
    /**
     * function: 添加Account对象信息
     * @createDate 2015-06-28 下午10:33:36
     * @param entity Account
     * @return boolean 是否成功
     * @throws DataAccessException
     */
    public boolean addAccount(Account entity) throws DataAccessException;
    
    /**
     * function: 根据id对到Account信息
     * @createDate 2015-06-28 下午10:33:36
     * @param id 编号id
     * @return Account
     * @throws DataAccessException
     */
    public Account getAccount(Integer id) throws DataAccessException;
    
    /**
     * function: 查询所有Account信息
     * @createDate 2015-06-28 下午10:33:36
     * @param id 编号id
     * @return Account
     * @throws DataAccessException
     */
    public List<Account> getList() throws DataAccessException;
}
