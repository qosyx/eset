/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eset.eset.security;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

/**
 *
 * @author archange
 */
@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(securedEnabled = true) 
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    protected void configure(AuthenticationManagerBuilder auth, DataSource dataSource) throws Exception {
        
        //String password = passwordEncoder().encode("password");
        auth.inMemoryAuthentication().withUser("admin").password("{noop}123").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("prof").password("{noop}123").roles("PROF");
         
      /*  auth.jdbcAuthentication()
                .dataSource(dataSource)
                
                .usersByUsernameQuery("Select username as principal, password as credentials,true from users where username = ?")
              //  .passwordEncoder(password)
                .authoritiesByUsernameQuery("Select User_username as principal, roles_rolename as role from usersrole where User_username = ?")*/
                /*.rolePrefix("ROLE_")*/;
        System.out.println(auth);

    }
/*
@SuppressWarnings("deprecation")
@Bean
public static NoOpPasswordEncoder passwordEncoder() {
return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
}*/
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll();
    }

}
