package com.springboot.di.factura.springbootdifactura.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.springboot.di.factura.springbootdifactura.models.Invoice;
import org.springframework.web.bind.annotation.GetMapping;

 
@RestController
@RequestMapping("/invoices")
public class InvoiceController {
    //la factura ya es componte sping
    // se inyecta
    @Autowired
    private Invoice invoice;
    
    @GetMapping("/show")   
    public Invoice show(){
        return invoice;
    }
}
