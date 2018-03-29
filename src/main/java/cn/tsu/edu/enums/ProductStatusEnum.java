package cn.tsu.edu.enums;

import lombok.Getter;

/**
 * Created by 宋维飞
 * 2018/3/28 23:30
 */
@Getter
public enum ProductStatusEnum  {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
