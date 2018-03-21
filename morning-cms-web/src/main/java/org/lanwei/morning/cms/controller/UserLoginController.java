package org.lanwei.morning.cms.controller;

import org.lanwei.morning.gateway.sevice.customer.OsUserGatewayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户登陆相关控制器
 *
 * @author lanwei 2018-03-18
 */
@RestController
@RequestMapping("/pass")
public class UserLoginController {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private OsUserGatewayService osUserGatewayService;

    @GetMapping("/test")
    public Integer test(Integer t) {
        return osUserGatewayService.insertUser(null);
    }
}
