package org.lanwei.morning.os.security;



import org.springframework.security.core.GrantedAuthority;

/**
 * 存储权限
 *
 * @author lanwei 2018-03-23
 */
public class GrantedAuthorityImpl implements GrantedAuthority {

    private String authority;

    public GrantedAuthorityImpl(String authority) {
        this.authority = authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
