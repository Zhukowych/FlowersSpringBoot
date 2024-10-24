package org.example.springflowerstore.controller;

import org.example.springflowerstore.flower.Flower;
import org.example.springflowerstore.flower.FlowerColor;
import org.example.springflowerstore.flower.FlowerType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FlowerController {


    @GetMapping("flowers/")
    public List<Flower> getGlowers() {
        List<Flower> sampleFlowers = new ArrayList<>();
        sampleFlowers.add(new Flower(FlowerType.ROSE, FlowerColor.RED, 10, 10));
        sampleFlowers.add(new Flower(FlowerType.CHAMOMILE, FlowerColor.RED, 10, 10));
        sampleFlowers.add(new Flower(FlowerType.TULIP, FlowerColor.RED, 10, 10));
        return sampleFlowers;
    }

}
