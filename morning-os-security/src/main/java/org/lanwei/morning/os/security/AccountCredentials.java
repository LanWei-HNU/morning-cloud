package org.lanwei.morning.os;

/**
 * 负责存储用户名密码
 *
 * @author lanwei 2018-03-23
 */
public class AccountCredentials {

    private String username;

    private String password;

    public AccountCredentials() {
    }

    public AccountCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
