package com.JdCollege.programmer.controller.web;

import com.JdCollege.programmer.dto.OrderDTO;
import com.JdCollege.programmer.dto.ResponseDTO;
import com.JdCollege.programmer.service.IOrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author LuoHao
 * @QQ 1441432393
 * @WX 18375696578
 * @create 2023
 */
@RestController("WebOrderController")
@RequestMapping("/web/order")
public class OrderController {

    @Resource
    private IOrderService orderService;

    /**
     * 提交订单操作
     * @param orderDTO
     * @return
     */
    @PostMapping("/add")
    public ResponseDTO<Boolean> addOrder(@RequestBody OrderDTO orderDTO){
        return orderService.addOrder(orderDTO);
    }

    /**
     * 获取个人订单信息
     * @param orderDTO
     * @return
     */
    @PostMapping("/self-order")
    public ResponseDTO<List<OrderDTO>> getByUserId(@RequestBody OrderDTO orderDTO){
        return orderService.getByUserId(orderDTO);
    }

    /**
     * 取消订单操作
     * @param orderDTO
     * @return
     */
    @PostMapping("/cancel")
    public ResponseDTO<Boolean> cancelOrder(@RequestBody OrderDTO orderDTO){
        return orderService.updateOrderState(orderDTO);
    }

}
