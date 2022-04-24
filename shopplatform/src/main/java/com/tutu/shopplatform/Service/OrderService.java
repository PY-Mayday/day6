package com.tutu.shopplatform.Service;

import com.tutu.shopplatform.domain.Order;
import com.tutu.shopplatform.domain.OrderDetail;

public interface OrderService {
    public void PlaceOrder(Order order);
    public void SetOrderDetail(OrderDetail orderdetail);
}
