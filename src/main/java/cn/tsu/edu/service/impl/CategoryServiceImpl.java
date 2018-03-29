package cn.tsu.edu.service.impl;

import cn.tsu.edu.dataobject.ProductCategory;
import cn.tsu.edu.repository.ProductCategoryRepository;
import cn.tsu.edu.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 宋维飞
 * 2018/3/28 23:06
 */
@Service
public class CategoryServiceImpl implements CategoryService {

  @Autowired
  private ProductCategoryRepository repository;


    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
