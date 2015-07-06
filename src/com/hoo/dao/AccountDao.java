package com.hoo.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;
import com.hoo.entity.Account;
 
/**
 * function: Account���ݿ����dao�ӿ�
 * @createDate 2015-06-28 ����10:33:36
 * @file AccountDao.java
 * @package com.hoo.dao
 * @project FirstSSM
 * @version 1.0
 * @param <T>
 */
public interface AccountDao {
    
    /**
     * function: ���Account������Ϣ
     * @createDate 2015-06-28 ����10:33:36
     * @param entity Account
     * @return boolean �Ƿ�ɹ�
     * @throws DataAccessException
     */
    public boolean addAccount(Account entity) throws DataAccessException;
    
    /**
     * function: ����id�Ե�Account��Ϣ
     * @createDate 2015-06-28 ����10:33:36
     * @param id ���id
     * @return Account
     * @throws DataAccessException
     */
    public Account getAccount(Integer id) throws DataAccessException;
    
    /**
     * function: ��ѯ����Account��Ϣ
     * @createDate 2015-06-28 ����10:33:36
     * @param id ���id
     * @return Account
     * @throws DataAccessException
     */
    public List<Account> getList() throws DataAccessException;
}
