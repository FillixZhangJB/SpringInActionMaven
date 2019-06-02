package aop.proxy.dynamic_proxy.实现方式一_invocationhandler;

import aop.proxy.dynamic_proxy.实现方式一_invocationhandler.Person;

/**
 * Created by zjb on 2019/5/30.
 */
public class Coder implements Person {
    public void say(String words) {
        System.out.println(words);
    }
}
