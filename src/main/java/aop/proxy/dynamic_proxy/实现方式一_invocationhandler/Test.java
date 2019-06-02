package aop.proxy.dynamic_proxy.实现方式一_invocationhandler;

/**
 * Created by zjb on 2019/5/30.
 */
public class Test {

    @org.junit.Test
    public void test() {
        Coder coder = new Coder();
        Tester tester = new Tester();
        EnginnerProxy proxy = new EnginnerProxy();


        Person proxyOfCoder = (Person) proxy.bind(coder);
        proxyOfCoder.say("im coding...");

        Person proxyOftester = (Person) proxy.bind(tester);
        proxyOftester.say("im testing...");

    }
}
