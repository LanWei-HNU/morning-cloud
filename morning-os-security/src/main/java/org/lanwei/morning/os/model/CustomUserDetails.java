package org.lanwei.morning.os.model;

import org.lanwei.morning.model.os.OsUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * @author lanwei 2018-03-25
 */
public class CustomUserDetails extends OsUser implements UserDetails {

    public CustomUserDetails(OsUser user) {
        this.setLoginPassword(user.getLoginPassword());
        this.setTelephone(user.getTelephone());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // 暂无权限配置
        return null;
    }

    @Override
    public String getPassword() {
        return getLoginPassword();
    }

    @Override
    public String getUsername() {
        return getTelephone();
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
        return true;
    }
}
