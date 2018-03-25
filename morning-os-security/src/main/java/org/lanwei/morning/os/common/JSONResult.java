package org.lanwei.morning.os.security;

import org.json.JSONObject;

/**
 * @author lanwei 2018-03-23
 */
public class JSONResult {

    public static String fillResultString(Integer status, String message, Object result) {
        JSONObject jsonObject = new JSONObject() {{
            put("status", status);
            put("message", message);
            put("result", result);
        }};
        return jsonObject.toString();
    }
}
