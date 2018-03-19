package org.lanwei.morning.gateway.sevice.customer;

import org.lanwei.morning.model.os.OsUser;
import org.lanwei.morning.service.user.OsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lanwei 2018-03-18
 */
@Service
public class OsUserGatewayServiceImpl implements OsUserGatewayService {

    @Autowired
    private OsUserService osUserService;

    @Override
    public Integer insertUser(OsUser user) {
        OsUser r = new OsUser();
        r.setEmail("11123");
        osUserService.insertSelective(r);
        return 0000;
    }
}
