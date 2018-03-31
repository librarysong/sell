package cn.tsu.edu.service.impl;

import cn.tsu.edu.dataobject.SellerInfo;
import cn.tsu.edu.repository.SellerInfoRepository;
import cn.tsu.edu.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 宋维飞
 * 2018/3/31 22:31
 */
@Service
public class SellerServiceImpl implements SellerService {

   @Autowired
   private SellerInfoRepository repository;
    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {

        return repository.findByOpenid(openid);
    }
}
