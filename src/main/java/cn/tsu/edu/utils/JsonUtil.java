package cn.tsu.edu.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by 宋维飞
 * 2018/3/31 13:38
 */
public class JsonUtil {
    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
