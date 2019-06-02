package aop.concert;

/**
 * Created by zjb on 2019/5/30.
 */
public interface Performence {

    void perform();

    void prepair(String taskName);

    void throwException();
}
