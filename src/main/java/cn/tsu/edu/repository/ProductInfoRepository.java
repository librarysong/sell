package cn.tsu.edu.repository;

import cn.tsu.edu.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 宋维飞
 * 2018/3/29 12:56
 */
public interface ProductInfoRepository  extends JpaRepository<ProductInfo,String>{
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
