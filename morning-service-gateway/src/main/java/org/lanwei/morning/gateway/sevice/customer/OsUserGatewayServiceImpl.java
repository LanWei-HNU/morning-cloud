package org.lanwei.morning.gateway.sevice.customer;

import org.lanwei.morning.model.os.OsUser;
import org.lanwei.morning.service.user.OsUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lanwei 2018-03-18
 */
@Service
public class OsUserGatewayServiceImpl implements OsUserGatewayService {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private OsUserService osUserService;

    @Override
    public Integer insertUser(OsUser user) {
        logger.debug("&&&&&&&&&&&&&&&&&&&&&&");
        OsUser r = new OsUser();
        r.setEmail("11123");
        osUserService.insertSelective(r);
        return 0000;
    }
}
