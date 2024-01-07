package com.springboot.di.factura.springbootdifactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springboot.di.factura.springbootdifactura.models.Item;
import com.springboot.di.factura.springbootdifactura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {
//
    //Ahora con Bean ya es un componente y se puede inyectar
    @Bean
    List <Item> itemsInvoice(){
        Product p1 = new Product("Camara Sony", 750);
        Product p2 = new Product("Ipad", 900);
        List<Item> items = Arrays.asList(new Item(p1, 2), new Item(p2, 4));
        return items;
    }

}
