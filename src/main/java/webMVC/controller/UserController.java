package webMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import webMVC.dao.jdbc_template_dao.JdbcUserRepository;

/**
 * Created by zjb on 2019/6/20.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    JdbcUserRepository repository;

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public void update(String password) {
        repository.updatePassword(password);
    }
}
