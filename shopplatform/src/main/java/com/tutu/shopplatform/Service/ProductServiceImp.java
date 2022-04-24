package com.tutu.shopplatform.Service;

import com.tutu.shopplatform.Dao.ProductDao;
import com.tutu.shopplatform.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService{
    @Autowired
    private ProductDao productDao;
    @Override
    public Product selectProductInfo(String pname) {

        return productDao.selectProductInfo(pname);
    }

}
