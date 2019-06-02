package aop.proxy.static_proxy;

/**
 * Created by zjb on 2019/5/30.
 */
public class Test {
    @org.junit.Test
    public void test() {
        Person person = new Coder();
        ProxyOfPerson proxy = new ProxyOfPerson();
        proxy.setPerson(person);
        proxy.proxySay("im saying...");
    }
}
