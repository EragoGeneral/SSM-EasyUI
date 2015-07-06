package com.hoo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hoo.biz.AccountBiz;
import com.hoo.entity.Account;
 
/**
 * function: Account¿ØÖÆÆ÷
 * @createDate 2015-06-28 ÏÂÎç10:56:12
 * @file AccountController.java
 * @package com.hoo.controller
 * @project FirstSSM
 * @version 1.0
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    
    @Autowired
    private AccountBiz biz;
    
    @RequestMapping("/add")
    public String add(Account acc) {
        System.out.println(acc);
        biz.addAccount(acc);
        return "redirect:/account/list.do";
    }
    
    @RequestMapping("/get")
    public String get(Integer id, Model model) {
        System.out.println("##ID:" + id);
        model.addAttribute(biz.getAccount(id));
        return "/show.jsp";
    }
    
    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("list", biz.getList());
        return "/list.jsp";
    }
    
    @ExceptionHandler(Exception.class)
    public String exception(Exception e, HttpServletRequest request) {
        //e.printStackTrace();
        request.setAttribute("exception", e);
        return "/error.jsp";
    }
}