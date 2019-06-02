package aop;

import aop.concert.MovieShow;
import aop.concert.Performence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by zjb on 2019/5/30.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig {

    @Bean
    public Performence performence(){
        return new MovieShow();
    }
    @Bean
    public Audience audience(){
        return new Audience();
    }
}
