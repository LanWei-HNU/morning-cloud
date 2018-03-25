package org.lanwei.morning.os.security;

import org.lanwei.morning.model.os.OsUser;
import org.lanwei.morning.os.model.CustomUserDetails;
import org.lanwei.morning.service.user.OsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author lanwei 2018-03-25
 */
@Service("customUserDetailsService")
public class CustomUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private OsUserService osUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        OsUser user = osUserService.selectByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("***not found");
        }
        return new CustomUserDetails(user);
    }
}
