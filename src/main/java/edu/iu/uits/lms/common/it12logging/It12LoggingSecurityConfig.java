package edu.iu.uits.lms.common.it12logging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;

@Configuration
@Slf4j
public class It12LoggingSecurityConfig {
    @Bean
    @Qualifier("jwtFilterSecurityInterceptor")
    public FilterSecurityInterceptor jwtFilterSecurityInterceptor() throws Exception {
        FilterSecurityInterceptor filterSecurityInterceptor = new FilterSecurityInterceptor();
        filterSecurityInterceptor.setPublishAuthorizationSuccess(true);
        return filterSecurityInterceptor;
    }
}