package cn.tsu.edu.service;

import cn.tsu.edu.dto.OrderDTO;

/**
 * Created by 宋维飞
 * 2018/3/29 22:17
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
