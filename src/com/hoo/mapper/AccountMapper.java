package com.hoo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import com.hoo.entity.Account;

/**
 * function:继承SqlMapper，MyBatis数据操作接口；此接口无需实现类
 * @createDate 2015-06-28 下午08:14:54
 * @file AccountMapper.java
 * @package com.hoo.mapper
 * @project FirstCCM
 * @version 1.0
 */
public interface AccountMapper extends SqlMapper {

	public List<Account> getAllAccount();

	public Account getAccount();

	public Account getAccountById(String id);

	public Account getAccountByNames(String spring);

	@Select("select * from account where username = #{name}")
	public Account getAccountByName(String name);

	public void addAccount(Account account);

	public void addAccount4Key(Account account);
	
	public void editAccount(Account account);

	public void removeAccount(int id);
}