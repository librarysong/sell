package cn.tsu.edu.repository;

import cn.tsu.edu.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 宋维飞
 * 2018/3/31 22:09
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo,String> {
    SellerInfo findByOpenid(String openid);
}
