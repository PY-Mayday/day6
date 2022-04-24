package com.tutu.shopplatform.Dao;
import com.tutu.shopplatform.domain.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductDao {
    public Product selectProductInfo(String pname);
}