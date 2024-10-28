package org.example.springflowerstore.controller;

import org.example.springflowerstore.delivery.DHLDeliveryStrategy;
import org.example.springflowerstore.delivery.Delivery;
import org.example.springflowerstore.delivery.PostDeliveryStrategy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DeliveryController {

    @GetMapping("/deliveries")
    public List<Delivery> getAvailableDeliveries() {
        List<Delivery> availableDeliveries = new ArrayList<>();
        availableDeliveries.add(new DHLDeliveryStrategy());
        availableDeliveries.add(new PostDeliveryStrategy());
        return availableDeliveries;
    }


}
