package cn.tsu.edu.enums;

import lombok.Getter;

/**
 * Created by 宋维飞
 * 2018/3/29 14:29
 */
@Getter
public enum PayStatusEnum implements  CodeEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),

    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
