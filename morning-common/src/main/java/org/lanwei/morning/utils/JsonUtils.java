package org.lanwei.morning.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author: lanwei 2018-3-25
 */
public class JsonUtils {

    private static final Logger log = LoggerFactory.getLogger(JsonUtils.class);

    public static <T> T fromJson(String json, Class<T> t) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(json, t);
        } catch (IOException e) {
            log.error("Exception:", e);
        }
        return null;
    }

    public static <T> String toJson(T obj) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            log.error("Exception:", e);
        }
        return null;
    }

    /**
     * 判断给定的json是否可以转成某种类型
     *
     * @param json
     * @param type
     * @return
     */
    public static boolean isTypeOf(String json, Class<?> type) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readValue(json, type);
            return true;
        } catch (IOException e) {
            log.debug("json:{}, type:{}, exception:{}", json, type, e.getMessage());
            return false;
        }
    }

    public static <T> List<T> fromJsonList(String json, Class<T> t) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            JavaType javaType = mapper.getTypeFactory().constructParametricType(ArrayList.class, t);
            return mapper.readValue(json, javaType);
        } catch (IOException e) {
            log.error("Exception:", e);
        }
        return null;
    }

    public static Map<String, Map<String, Object>> jsonToMap(String json) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(json, Map.class);
        } catch (IOException e) {
            log.error("Exception:", e);
        }
        return null;
    }

    /**
     * 获取泛型的Collection Type
     *
     * @param collectionClass 泛型的Collection
     * @param elementClasses  元素类
     * @return JavaType Java类型
     * @since 1.0
     */
    public static JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
    }
}
