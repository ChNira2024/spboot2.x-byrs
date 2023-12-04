package com.nt.niranjana.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter
{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
		auth.inMemoryAuthentication().withUser("sisu").password("{noop}sisu").authorities("ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
		http.authorizeRequests().antMatchers("/","/login").permitAll()
		.anyRequest().authenticated().and().formLogin()
		.and().oauth2Login()
		.and().csrf().disable();  //here csrf is disable because here own token is genearted by OAuth(FB)
	}

	
}