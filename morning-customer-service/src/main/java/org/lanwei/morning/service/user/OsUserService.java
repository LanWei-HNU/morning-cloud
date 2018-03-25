package org.lanwei.morning.service.user;

import org.lanwei.morning.model.os.OsUser;

/**
 * @author lanwei 2018-03-18
 */
public interface OsUserService {

    boolean insertSelective(OsUser record);

    /**
     * 登录验证
     *
     * @param account
     * @param password
     * @return
     */
    OsUser loginAuth(String account, String password);

    OsUser selectByUsername(String account);
}
