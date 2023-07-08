package Model;

import java.util.PriorityQueue;

public class ToyQueue {
    PriorityQueue<Toy> toys;

    public ToyQueue() {
        toys = new PriorityQueue<>();
        fillToys();
    }

    private void fillToys() {
        for (int i = 0; i < 3; i++){
            toys.add(new Toy(i + 1,
                    Things.values()[i].getLabel(),
                    Things.values()[i].getWeight()));
        }
    }


    public PriorityQueue<Toy> getToys() {
        return toys;
    }
}
