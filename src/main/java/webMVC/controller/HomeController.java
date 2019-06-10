package webMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import webMVC.exceptions.MyException;

/**
 * Created by zjb on 2019/5/31.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String hello() {
        return "home";
    }

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    @ResponseBody
    public String testException() {
        if(true) throw new MyException("錯誤");
        return "home";
    }
}
