package webMVC.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * Created by zjb on 2019/5/31.
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * identifies one or more paths that DispatcherServlet will be mapped to.
     *
     * @return
     */
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    //注册filter，mapping到Dispatcherservlet
    @Override
    protected Filter[] getServletFilters() {
        return new Filter[]{new MyDefaultFilter()};
    }
}
