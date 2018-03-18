package org.lanwei.morning.service.user;

import org.lanwei.morning.model.OsUser;

/**
 * @author lanwei 2018-03-18
 */
public interface OsUserService {

    boolean insertSelective(OsUser record);
}
