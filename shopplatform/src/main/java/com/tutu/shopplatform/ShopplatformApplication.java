package com.tutu.shopplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class ShopplatformApplication {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(ShopplatformApplication.class, args);
    }

}
