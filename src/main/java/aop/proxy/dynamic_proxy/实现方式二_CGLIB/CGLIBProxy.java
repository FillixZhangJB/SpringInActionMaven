package aop.proxy.dynamic_proxy.实现方式二_CGLIB;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by zjb on 2019/5/30.
 */
public class CGLIBProxy {
    Object obj;

    public Object bind(final Object target) {
        this.obj = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("proxy hehe...");
                Object res = method.invoke(target, args);
                return res;
            }
        });
        return enhancer.create();
    }
}
