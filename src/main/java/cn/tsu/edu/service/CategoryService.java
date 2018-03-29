package cn.tsu.edu.service;

import cn.tsu.edu.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by 宋维飞
 * 2018/3/28 23:02
 */
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
