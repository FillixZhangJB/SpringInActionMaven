package webMVC.config.dataSource;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;

/**
 * Created by zjb on 2019/6/18.
 */
@Configuration
public class MysqlDataSourceConfig {

    // JNDI pooled DataSource
//    @Profile("production") 规定在使用哪个配置文件时才生效
    @Bean
    public JndiObjectFactoryBean dataSource() {
        JndiObjectFactoryBean jndiObjectFB = new JndiObjectFactoryBean();
        jndiObjectFB.setJndiName("jdbc/mysql");
        jndiObjectFB.setResourceRef(true);
        jndiObjectFB.setProxyInterface(DataSource.class);
        return jndiObjectFB;
    }

    //druid pooled DataSource
    @Bean
    public DataSource druidDataSource() {
        DruidDataSource druidDS = new DruidDataSource();
        druidDS.setUrl("jdbc:mysql://localhost:3306/spring4?serverTimezone=GMT%2B8&useSSL=false");
        druidDS.setUsername("root");
        druidDS.setPassword("root");
        return druidDS;
    }

    /**
     * DriverManagerDataSource
     * The only significant difference with these data-source beans
     * as compared to the pooling data-source beans
     * is that because they don’t provide a connection pool,
     * there are no pool configuration properties to set.
     *
     * @return
     */
    @Bean
    public DataSource driverManagerDataSource() {
        DriverManagerDataSource dmDS = new DriverManagerDataSource();
        dmDS.setDriverClassName("jdbc:mysql://localhost:3306/spring4?serverTimezone=GMT%2B8&useSSL=false");
        dmDS.setUsername("root");
        dmDS.setPassword("root");
        return dmDS;
    }

    //内嵌的数据库，schema.sql 定义了如何建立数据库，test-data.sql提供了测试数据；
    @Bean
    public DataSource embeddedDataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("classpath:schema.sql")
                .addScript("classpath:test-data.sql")
                .build();
    }
}

