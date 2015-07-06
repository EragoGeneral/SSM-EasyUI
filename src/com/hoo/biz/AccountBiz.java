package com.hoo.biz;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.hoo.entity.Account;
 
/**
 * function: biz��Account�ӿ�
 * @createDate 2015-06-28 ����10:48:51
 * @file AccountBiz.java
 * @package com.hoo.biz
 * @project FirstSSM
 * @version 1.0
 */
public interface AccountBiz {
    /**
     * function: ���Account������Ϣ
     * @author hoojo
     * @createDate 2011-4-13 ����11:50:05
     * @param entity Account
     * @return boolean �Ƿ�ɹ�
     * @throws DataAccessException
     */
    public boolean addAccount(Account entity) throws DataAccessException;
    
    /**
     * function: ����id�Ե�Account��Ϣ
     * @author hoojo
     * @createDate 2011-4-13 ����11:50:45
     * @param id ���id
     * @return Account
     * @throws DataAccessException
     */
    public Account getAccount(Integer id) throws DataAccessException;
    
    /**
     * function: ��ѯ����Account��Ϣ
     * @author hoojo
     * @createDate 2011-4-13 ����11:51:45
     * @param id ���id
     * @return Account
     * @throws DataAccessException
     */
    public List<Account> getList() throws DataAccessException;
}
