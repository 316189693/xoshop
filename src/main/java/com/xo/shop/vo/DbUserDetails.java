package com.xo.shop.vo;

import com.xo.shop.model.User;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created By willz
 * Date : 2020/3/31
 * Time: 15:20
 */
public class DbUserDetails implements UserDetails {
    private User user = new User();
    public DbUserDetails() {}

    public DbUserDetails(User user) {
        if (user != null) {
            this.user = user;
        }
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (!CollectionUtils.isEmpty(this.user.getRoles())) {
            return this.user.getRoles().stream().map(o->new SimpleGrantedAuthority(o.getName())).collect(Collectors.toList());
        }
        return null;
    }

    @Override
    public String getPassword() {
        return this.user.getPassword();
    }

    @Override
    public String getUsername() {
        return this.user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.user.getActive() > 0;
    }
}
