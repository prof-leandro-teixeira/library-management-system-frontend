package com.leandro.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(HttpSecurity http) throws Exception {
	http.authorizeRequests()
	.antMatchers("/edit/**").hasAnyRole(UserRole.ADMIN.name(),UserRole.PUBLISHER.name())
	.antMatchers("/delete/**").hasRole(UserRole.ADMIN.name())
	.anyRequest().authenticated()
	.and()
	.formLogin();
	
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	auth.inMemoryAuthentication()
	.withUser("user_admin").password("{noop}123").roles(UserRole.ADMIN.name())
	.and().withUser("user_publisher").password("{noop}12").roles(UserRole.PUBLISHER.name())
	.and().withUser("user_read_only").password("{noop}1").roles(UserRole.READ_ONLY.name());
    }
    
    
    
    

}
