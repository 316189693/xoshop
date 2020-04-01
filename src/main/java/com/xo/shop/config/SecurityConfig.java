package com.xo.shop.config;

import com.xo.shop.user.service.UserDetailsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created By willz
 * Date : 2020/3/30
 * Time: 17:28
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/swagger**/**").permitAll()
                .antMatchers("/index", "/static/**").permitAll()
                .antMatchers("/dashboard").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()

                .formLogin()
               // .loginPage("/index").successHandler()
                .failureUrl("/templates/error.html")
                .and()
                .logout()
                .logoutSuccessUrl("/templates/login.html");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       auth.userDetailsService(customeUserDetailService()).passwordEncoder(new BCryptPasswordEncoder());
    }
    @Bean
    public UserDetailsService customeUserDetailService() {
        return new UserDetailsServiceImpl();
    }
}
