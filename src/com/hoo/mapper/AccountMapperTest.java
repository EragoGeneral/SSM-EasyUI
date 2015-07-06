package com.hoo.mapper;

import java.util.List;
import javax.inject.Inject;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit38.AbstractJUnit38SpringContextTests;
import com.hoo.entity.Account;
 
/**
 * function: AccountMapper JUnit≤‚ ‘¿‡
 * @createDate 2015-06-28 œ¬ŒÁ08:41:09
 * @file AccountMapperTest.java
 * @package com.hoo.mapper
 * @project FirstSSM
 * @version 1.0
 */
 
@SuppressWarnings("deprecation")
@ContextConfiguration("classpath:applicationContext-*.xml")
public class AccountMapperTest extends AbstractJUnit38SpringContextTests {
    
    @Inject
    //@Named("accountMapper")
    private AccountMapper mapper;
    
    public void testGetAccount() {
        //System.out.println(mapper.getAccount());
    }
    
    
    public void testGetAccountById() {
        //System.out.println(mapper.getAccountById("28"));
    }
    
    public void testGetAccountByName() {
        //System.out.println(mapper.getAccountByName("user"));
    }
    
    public void testGetAccountByNames() {
        //System.out.println(mapper.getAccountByNames("user"));
    }
   
    public void testAdd() {
        Account account = new Account();
        account.setEmail("tp9@gmail.com");
        account.setPassword("test123456");
        account.setRoleId(2);
        account.setSalt("salt");
        account.setStatus(3);
        account.setUsername("Tony");
        //mapper.addAccount4Key(account);
        mapper.addAccount(account);
    }
   
    public void testEditAccount() {
        Account acc = mapper.getAccountByNames("Jack");
        //System.out.println(acc);
        acc.setUsername("Jack");
        acc.setPassword("123123");
        acc.setEmail("temp@155.com");
        acc.setRoleId(1);
        acc.setSalt("ss");
        //mapper.editAccount(acc);
        //System.out.println(mapper.getAccountById(acc.getAccountId() + ""));
    }
    
    public void testRemoveAccount() {
        Account acc = mapper.getAccountByNames("Jack");
        //mapper.removeAccount(acc.getAccountId());
        //System.out.println(mapper.getAccountByNames("Jack"));
    }
    @Test
    public void testAccountList() {
        List<Account> accs = mapper.getAllAccount();
        System.out.println(accs.size());
        for(Account acc : accs){
        	System.out.println(acc.getUsername());
        	System.out.println(acc.getPassword());
        }
    }
}
