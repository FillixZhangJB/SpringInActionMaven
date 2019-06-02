package aop.proxy.dynamic_proxy.实现方式一_invocationhandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zjb on 2019/5/30.
 */
public class EnginnerProxy implements InvocationHandler {
    private Object obj;

    public Object bind(Object obj) {
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("干活前先开电脑...");
        Object res = method.invoke(obj, args);
        return res;
    }
}
