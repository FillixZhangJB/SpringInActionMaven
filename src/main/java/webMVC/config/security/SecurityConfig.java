package webMVC.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import javax.sql.DataSource;

/**
 * Created by zjb on 2019/6/10.
 */
@Configuration
@EnableWebSecurity
//@EnableWebMvcSecurity  //
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;
    @Autowired
    DataSource druidDataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin()
//                .loginPage("/login")//自定义跳转的登录页面
                .and()  //如果认证或授权不通过，调到默认的登录页面
                .rememberMe().tokenValiditySeconds(10)
                .key("key").and()
                .authorizeRequests()
                .antMatchers("/home").authenticated()
                .antMatchers(HttpMethod.GET, "/custerm").authenticated()
                .antMatchers("/test")
                //SPEL表达式语言限制权限
                .access("hasRole('ROLE_ADMIN') and hasIpAddress('192.168.1.2')")
                .anyRequest().permitAll()
                .and().requiresChannel().antMatchers(HttpMethod.GET, "/")
                .requiresInsecure() //require no https
                .and().requiresChannel().antMatchers(HttpMethod.POST, "/form")
                .requiresSecure();//require https
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //方式一：Working with an in-memory user store

//        auth.inMemoryAuthentication().withUser("root").password("root").roles("ADMIN").and()
//                .withUser("user01").password("user01").roles("USER", "ADMIN");

        //方式二： Authenticating against database tables
//        auth.jdbcAuthentication()
//                .dataSource(druidDataSource).usersByUsernameQuery("select username , password , true from user where username = ?")
//                .authoritiesByUsernameQuery("select username , 'ROLE_USER' from user where username = ?");
        //方式三： Configuring a custom user service
        auth.userDetailsService(new UserServiceImpl());

    }
}
