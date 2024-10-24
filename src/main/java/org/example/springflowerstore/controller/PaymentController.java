package org.example.springflowerstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;


@RestController
@RequestMapping("/api/v1")
public class PaymentController {


    @GetMapping("payment_methods/")
    public List<Class<?>> getPaymentMethods() {

    }

}