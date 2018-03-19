package org.lanwei.morning.service.user;

import org.lanwei.morning.dao.os.OsUserMapper;
import org.lanwei.morning.model.os.OsUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lanwei 2018-03-18
 */
@Service
public class OsUserServiceImpl implements OsUserService {

    @Autowired
    private OsUserMapper osUserMapper;

    @Override
    public boolean insertSelective(OsUser record) {
        return osUserMapper.insertSelective(record) > 0;
    }
}
