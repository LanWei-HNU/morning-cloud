package org.lanwei.morning.os.common;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author lanwei 2018-04-15
 */
@ConfigurationProperties(prefix = "jwt")
public class JwtProperties {

    // 过期时间
    private long expirationTime;

    // 秘钥
    private String secretKey;


    private String header;

    private String tokenPrefix;

    private long lastExpiration;

    public long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(long expirationTime) {
        this.expirationTime = expirationTime;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getTokenPrefix() {
        return tokenPrefix;
    }

    public void setTokenPrefix(String tokenPrefix) {
        this.tokenPrefix = tokenPrefix;
    }

    public long getLastExpiration() {
        return lastExpiration;
    }

    public void setLastExpiration(long lastExpiration) {
        this.lastExpiration = lastExpiration;
    }
}
