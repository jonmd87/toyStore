package Model;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Random;

public class Lottery {
    public Toy getGift(PriorityQueue<Toy> toys) {
        ArrayList<Toy> toyArrayList = new ArrayList<>();
        for (Toy toy : toys) {
            fillArrayWithToys(toy, toyArrayList);
        }
        return toyArrayList.get(new Random().nextInt(toyArrayList.size()));
    }

    private void fillArrayWithToys(Toy toy, ArrayList<Toy> toyArrayList) {
        int val = toy.getWeight() * 100 / 10;
        for (int i = 0; i < val ; i++) {
            toyArrayList.add(toy);
        }
    }
}
