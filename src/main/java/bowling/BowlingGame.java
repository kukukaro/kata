package bowling;

import java.util.Random;

public class BowlingGame {
    protected int[] pins = new int[21];
    private int i = 0;
    private int index = 0;
    private int score = 0;

    public void game() {
        for (int frame = 0 ; frame < 10 ; frame++){
            frame();
        }

        if (pins[18] == 10) {
            i--;
            frame();
            if (pins[19] == 10) {
                roll(10);
            }
        } else if (pins[18] + pins[19] == 10) {
            roll(10);
        }
        int result = score();
        System.out.println("Your score: " + result);
    }

    private void frame() {
        int maxPins = 10;
        int knackedDownPins = 0;

        knackedDownPins = roll(maxPins);
            if (knackedDownPins < 10) {
                maxPins = 10 - knackedDownPins;
                roll(maxPins);
            } else {
                pins[i+1] = 0;
                i++;
            }
    }

    private int roll(int maxPins) {
        Random random = new Random();
        int knackedDownPins = random.nextInt(maxPins+1);
        pins[i] = knackedDownPins;
        i++;
        return knackedDownPins;
    }

    public int score() {

        for (int frame = 0 ; frame < 9 ; frame++) {

            if (isStrike()) {
                score += 10 + pins[index+2] + pins[index+3];
                if (pins[index+2] == 10 && index!=16) {
                    score += pins[index+4];
                }
                index +=2;
            } else if (isSpare()) {
                score += 10 + pins[index+2];
                index +=2;
            } else {
                score += pins[index] + pins[index+1];
                index +=2;
            }
        }
        if (pins[18] == 10) {
            score += 10 + pins[19] + pins[20];
        } else if (pins[18] + pins[19] == 10) {
            score += 10 + pins[20];
        } else {
            score += pins[18] + pins[19];
        }

        return score;
    }

    private boolean isSpare() {
        return pins[index] + pins[index+1] == 10;
    }

    private boolean isStrike() {
        return pins[index] == 10;
    }

    public void printPins() {
        System.out.println("Knocked down pins");
        for (int i = 0 ; i < pins.length ; i++) {
            System.out.println(i + " ---->  " + pins[i]);
        }
    }
}
