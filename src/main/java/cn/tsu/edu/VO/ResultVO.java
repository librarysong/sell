package cn.tsu.edu.VO;

import lombok.Data;

/**
 * Created by 宋维飞
 * 2018/3/29 13:32
 */
@Data
public class ResultVO <T>{
    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
