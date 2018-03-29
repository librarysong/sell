package cn.tsu.edu.dto;

import lombok.Data;

/**
 * Created by 宋维飞
 * 2018/3/29 15:29
 */
@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
