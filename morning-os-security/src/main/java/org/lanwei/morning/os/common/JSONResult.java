package org.lanwei.morning.os.common;


import org.lanwei.morning.utils.JsonUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lanwei 2018-03-23
 */
public class JSONResult {

    public static String fillResultString(Integer status, String message, Object result) {
        Map<Object, Object> map = new HashMap<>();
        map.put("status", status);
        map.put("message", message);
        map.put("result", result);
        return JsonUtils.toJson(map);
    }
}
