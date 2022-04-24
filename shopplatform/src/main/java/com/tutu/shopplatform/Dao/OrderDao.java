package com.tutu.shopplatform.Dao;

import com.tutu.shopplatform.domain.Order;
import com.tutu.shopplatform.domain.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDao {
    public void PlaceOrder(Order order);
    public void SetOrderDetail(OrderDetail orderdetail);
}
