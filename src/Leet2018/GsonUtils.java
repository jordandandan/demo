package Leet2018;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.lang.reflect.Type;

/**
 * @author: wujinglong
 * @time: 2018/2/5 17:27
 * @email: wujinglong@corp.netease.com
 **/
public class GsonUtils {


    private static final Gson gson = new Gson();

    public static String toJson(Object obj) {
        return gson.toJson(obj);
    }

    public static <T> T fromJson(String json, Class<T> clazz) {
        try {
            return gson.fromJson(json, clazz);
        } catch (Exception e) {
        }
        return null;
    }

    public static <T> T fromJson(JsonElement json, Class<T> clazz) {
        try {
            return gson.fromJson(json, clazz);
        } catch (Exception e) {
        }
        return null;
    }

    public static <T> T fromJson(JsonElement json, Type type) {
        try {
            return gson.fromJson(json, type);
        } catch (Exception e) {
        }
        return null;
    }

    public static <T> T fromJson(String json, Type type) {
        try {
            return gson.fromJson(json, type);
        } catch (Exception e) {
        }
        return null;
    }
}
