package cn.tsu.edu.service;

import cn.tsu.edu.dto.OrderDTO;

/**
 * Created by 宋维飞
 * 2018/3/31 23:39
 */
public interface PushMessageService {
    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
