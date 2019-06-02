package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by zjb on 2019/5/29.
 */
@Aspect
public class Audience {
    @Before("execution(** aop.concert.Performence.perform(..))")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones.");
    }

    @Around("execution(** aop.concert.Performence.perform(..))")
    public void aroundPerform(ProceedingJoinPoint pj) {
        System.out.println("before perform...");
        try {
            pj.proceed();
            System.out.println("perfrom ending...");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @After("execution(** aop.concert.Performence.prepair(String))")
    public void afterPrepair() {
        System.out.println("prepair ending...");
    }

    @AfterThrowing("execution(** aop.concert.Performence.throwException(..))")
    public void afterThrowing() {
        System.out.println("after throwing...");
    }
}
