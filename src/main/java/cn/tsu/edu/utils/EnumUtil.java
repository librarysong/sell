package cn.tsu.edu.utils;

import cn.tsu.edu.enums.CodeEnum;

/**
 * Created by 宋维飞
 * 2018/3/31 16:07
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
