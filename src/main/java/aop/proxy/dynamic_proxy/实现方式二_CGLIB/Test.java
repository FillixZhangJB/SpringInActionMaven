package aop.proxy.dynamic_proxy.实现方式二_CGLIB;

/**
 * Created by zjb on 2019/5/30.
 */
public class Test {
    @org.junit.Test
    public void test() {
        Tester tester = new Tester();
        CGLIBProxy proxy = new CGLIBProxy();
        Tester proxyOfTester = (Tester) proxy.bind(tester);
        proxyOfTester.say("im testing...");
    }
}
