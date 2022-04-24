package com.tutu.shopplatform.Controller;

import com.tutu.shopplatform.Service.OrderService;
import com.tutu.shopplatform.domain.Order;
import com.tutu.shopplatform.domain.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderservice;

    @GetMapping("/order")
    public Order buy() {
        Order order = new Order();
        order.setoid(2);
        order.setuid(1);
        order.setdid(1);
        order.setotime(04231050);
        order.setoaddress("Chengdu, Sichuan Province");
        order.setoriprice(50);
        order.setrealprice(45);

        OrderDetail od = new OrderDetail();
        od.setoid(order.getoid());
        od.setpid(1);
        od.setoriprice(50);
        od.setrealprice(45);
        od.setpnum(1);

        orderservice.PlaceOrder(order);
        orderservice.SetOrderDetail(od);
        return order;
    }

}
