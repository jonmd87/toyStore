package View;

import Model.Phrases;
import Presenter.Presenter;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private Presenter presenter;
    private Scanner scanner;

    public Menu() {
        this.presenter = new Presenter();
        this.scanner = new Scanner(System.in);
    }

    public void startLottery() throws IOException {
        this.presenter.getGift();
        this.presenter.writeToFile(getFilePath());
    }

    private String getFilePath() {
        System.out.println(Phrases.ENTER_PATH.getValue());
        return scanner.nextLine();
    }
}
