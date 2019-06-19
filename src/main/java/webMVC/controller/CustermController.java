package webMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zjb on 2019/6/10.
 */
@Controller
@RequestMapping("/custerm")
public class CustermController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String custerm() {
        return "custerm";
    }
}
