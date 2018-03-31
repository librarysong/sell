package cn.tsu.edu.form;

import lombok.Data;

/**
 * Created by 宋维飞
 * 2018/3/31 21:19
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
