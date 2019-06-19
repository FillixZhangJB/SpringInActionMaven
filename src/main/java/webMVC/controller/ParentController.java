package webMVC.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import webMVC.exceptions.MyException;

/**
 * Created by zjb on 2019/6/3.
 */
@ControllerAdvice
@RestController
public class ParentController {

    @ExceptionHandler(MyException.class)
    public String handException(){
        System.out.println("advice controller");
        return "error";
    }
}
