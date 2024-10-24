package org.example.springflowerstore.flower;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.stream.Collectors;

@NoArgsConstructor
public class FlowerBucket {

    private ArrayList<FlowerPack> packs = new ArrayList<>();

    public ArrayList<FlowerPack> getPacks() {
        return new ArrayList<>(packs);
    }

    public void add(FlowerPack pack) {
        packs.add(pack);
    }

    public void remove(FlowerPack pack) {
        packs.remove(pack);
    }

    public double getPrice() {
        return packs.stream().mapToDouble(FlowerPack::getPrice).sum();
    }

    @Override
    public String toString() {
        String packsString = packs.stream().map(FlowerPack::toString).collect(Collectors.joining(", "));
        return String.format("Bucket<%s>", packsString);
    }

}
