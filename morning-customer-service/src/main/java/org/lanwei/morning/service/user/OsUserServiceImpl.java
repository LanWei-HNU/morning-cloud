package org.lanwei.morning.service.user;

import org.apache.commons.lang3.StringUtils;
import org.lanwei.morning.dao.os.OsUserMapper;
import org.lanwei.morning.model.os.OsUser;
import org.lanwei.morning.model.os.OsUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

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

    @Override
    public OsUser loginAuth(String account, String password) {
        if (StringUtils.isBlank(account) || StringUtils.isBlank(password)) {
            return null;
        }
        OsUserExample e = new OsUserExample();
        e.createCriteria().andLoginPasswordEqualTo(password).andTelephoneEqualTo(account);
        List<OsUser> list = osUserMapper.selectByExample(e);
        return CollectionUtils.isEmpty(list) ? null : list.get(0);
    }

    @Override
    public OsUser selectByUsername(String account) {
        if (StringUtils.isBlank(account)) {
            return null;
        }
        OsUserExample e = new OsUserExample();
        e.createCriteria().andTelephoneEqualTo(account);
        List<OsUser> list = osUserMapper.selectByExample(e);
        return CollectionUtils.isEmpty(list) ? null : list.get(0);
    }
}
