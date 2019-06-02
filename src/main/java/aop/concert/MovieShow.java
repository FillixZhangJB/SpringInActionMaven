package aop.concert;

/**
 * Created by zjb on 2019/5/30.
 */
public class MovieShow implements Performence {
    public void perform() {
        System.out.println("Moview Show is performing...");
    }

    public void prepair(String taskName) {
        System.out.println("prepair..." + taskName);
    }

    public void throwException() {
        int a = 1 / 0;
    }
}
