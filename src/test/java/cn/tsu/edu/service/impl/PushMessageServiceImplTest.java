package cn.tsu.edu.service.impl;

import cn.tsu.edu.dto.OrderDTO;
import cn.tsu.edu.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by 宋维飞
 * 2018/3/31 23:45
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PushMessageServiceImplTest {

    @Autowired
    private PushMessageServiceImpl pushMessageService;

    @Autowired
    private OrderService orderService;
    @Test
    public void orderStatus() {
            OrderDTO orderDTO = orderService.findOne("151212121221212121212");
            pushMessageService.orderStatus(orderDTO);
    }
}