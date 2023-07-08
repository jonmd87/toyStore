package Presenter;

import Model.*;

import java.io.IOException;

public class Presenter {
    private Lottery lottery;
    private ToyQueue toyQueue;
    private WriteToFile writer;

    public Presenter() {
        this.lottery = new Lottery();
        this.toyQueue = new ToyQueue();
        this.writer = new WriteToFile();
    }

    public Toy getGift() {
        return this.lottery.getGift(this.toyQueue.getToys());
    }

    public void writeToFile(String filePath) throws IOException {
        this.writer.writeToFile(filePath, getGift().toString());
    }
}
