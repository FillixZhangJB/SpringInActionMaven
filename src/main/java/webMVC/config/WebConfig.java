package webMVC.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import webMVC.controller.ControllerPac;

/**
 * Created by zjb on 2019/5/31.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {ControllerPac.class})
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * //Configure a JSP view resolver
     * @return
     */
//    @Bean
//    public ViewResolver viewResolver() {
//        InternalResourceViewResolver resolver =
//                new InternalResourceViewResolver();
//        resolver.setPrefix("/WEB-INF/views/");
//        resolver.setSuffix(".jsp");
//        resolver.setExposeContextBeansAsAttributes(true);
//        return resolver;
//    }

    /**
     * Configure static content handling
     * @param configurer
     */
    @Override
    public void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
