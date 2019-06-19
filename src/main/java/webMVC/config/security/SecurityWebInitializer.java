package webMVC.config.security;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Created by zjb on 2019/6/10.
 * AbstractSecurityWebApplicationInitializer implements WebApplicationInitializer,
 * so it will be discovered by Spring and be used to register DelegatingFilterProxy
 * with the web container.
 *  Although you can override its appendFilters()
 or insertFilters() methods to register filters of your own choosing, you need not
 override anything to register DelegatingFilterProxy.
 */
public class SecurityWebInitializer extends AbstractSecurityWebApplicationInitializer {
}
