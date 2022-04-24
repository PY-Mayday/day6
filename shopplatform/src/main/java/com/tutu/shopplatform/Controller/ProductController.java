package com.tutu.shopplatform.Controller;

import com.tutu.shopplatform.Service.ProductService;
import com.tutu.shopplatform.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//为什么一定是这个
public class ProductController {
    @Autowired
    private ProductService productservice;

    @GetMapping("/goods")
    public String hello1(){
        System.out.println("#############");
        return "get hello111111";
    }

    @GetMapping("/goods/info")
    public int SearchProduct() {
        String pname = "cup";
        Product product = productservice.selectProductInfo(pname);
        int pprice = product.getPprice();
        System.out.println("************"+pprice+"************");
        return pprice;
    }
}
