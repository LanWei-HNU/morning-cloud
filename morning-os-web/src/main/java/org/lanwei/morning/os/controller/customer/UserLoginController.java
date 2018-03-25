package org.lanwei.morning.os.controller.customer;

import org.lanwei.morning.utils.JsonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * 用户登陆相关控制器
 *
 * @author lanwei 2018-03-18
 */
@RestController
@RequestMapping("/pass")
public class UserLoginController {

    // 路由映射到/users
    @RequestMapping(value = "/users", produces = "application/json;charset=UTF-8")
    public String usersList() {

        ArrayList<String> users = new ArrayList<String>() {{
            add("freewolf");
            add("tom");
            add("jerry");
        }};

        return JsonUtils.toJson(users);
    }

}
