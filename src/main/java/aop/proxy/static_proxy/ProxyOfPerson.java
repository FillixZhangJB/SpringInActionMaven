package aop.proxy.static_proxy;

import java.lang.reflect.Proxy;

/**
 * Created by zjb on 2019/5/30.
 */
public class ProxyOfPerson {
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void proxySay(String words) {
        System.out.println("before say...");
        person.say(words);
    }
}
