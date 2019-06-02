package aop.proxy.static_proxy;

/**
 * Created by zjb on 2019/5/30.
 */
public class Coder implements Person {
    public void say(String words) {
        System.out.println(words);
    }
}
