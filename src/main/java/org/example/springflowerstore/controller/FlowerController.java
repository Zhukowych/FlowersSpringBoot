package org.example.springflowerstore.controller;

import org.example.springflowerstore.flower.Flower;
import org.example.springflowerstore.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FlowerController {

    public FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("flowers/")
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }

    @PostMapping("add_flower/")
    public Flower addFlower(@RequestBody Flower flower) {
        return flowerService.createFlower(flower);
    }

}
