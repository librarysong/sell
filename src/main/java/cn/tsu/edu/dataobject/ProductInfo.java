package cn.tsu.edu.dataobject;

import cn.tsu.edu.enums.ProductStatusEnum;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by 宋维飞
 * 2018/3/29 12:52
 */
@Entity
@Data
public class ProductInfo {
    @Id
    private String productId;

    /** 名字. */
    private String productName;

    /** 单价. */
    private BigDecimal productPrice;

    /** 库存. */
    private Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 状态, 0正常1下架. */
    //private Integer productStatus = ProductStatusEnum.UP.getCode();
      private Integer productStatus;
    /** 类目编号. */
    private Integer categoryType;
}
