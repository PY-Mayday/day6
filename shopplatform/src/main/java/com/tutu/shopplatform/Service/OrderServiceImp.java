package com.tutu.shopplatform.Service;

import com.tutu.shopplatform.Dao.OrderDao;
import com.tutu.shopplatform.domain.Order;
import com.tutu.shopplatform.domain.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImp implements OrderService {
    @Autowired
    OrderDao orderdao;

    @Override
    public void PlaceOrder(Order order) {

        orderdao.PlaceOrder(order);
    }
    public void SetOrderDetail(OrderDetail orderdetail) {
        orderdao.SetOrderDetail(orderdetail);
    }

}
