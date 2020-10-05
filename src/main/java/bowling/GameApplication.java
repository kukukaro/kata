package bowling;

import java.util.Random;

public class GameApplication {

    public static void main(String[] args) {
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.game();
        bowlingGame.printPins();

    }
}