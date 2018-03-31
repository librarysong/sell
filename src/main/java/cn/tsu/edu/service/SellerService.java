package cn.tsu.edu.service;

import cn.tsu.edu.dataobject.SellerInfo;

/**
 * Created by 宋维飞
 * 2018/3/31 22:30
 */
public interface SellerService {
    SellerInfo findSellerInfoByOpenid(String openid);
}
