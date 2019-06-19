package webMVC.config.dataSource;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;

/**
 * Created by zjb on 2019/6/18.
 */
@Configuration
public class MysqlDataSourceConfig {
    @Bean
    public JndiObjectFactoryBean dataSource() {
        JndiObjectFactoryBean jndiObjectFB = new JndiObjectFactoryBean();
        jndiObjectFB.setJndiName("jdbc/mysql");
        jndiObjectFB.setResourceRef(true);
        jndiObjectFB.setProxyInterface(DataSource.class);
        return jndiObjectFB;
    }

    @Bean
    public DataSource druidDataSource() {
        DruidDataSource druidDS = new DruidDataSource();
        druidDS.setUrl("jdbc:mysql://localhost:3306/spring4?serverTimezone=GMT%2B8&useSSL=false");
        druidDS.setUsername("root");
        druidDS.setPassword("root");
        return druidDS;
    }
}

