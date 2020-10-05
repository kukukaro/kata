package bowling;

import org.hamcrest.core.StringEndsWith;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {


    @Test
    public void shouldScoreSimpleGame() {
        BowlingGame noStrikesOrSparesGame = new BowlingGame();
        noStrikesOrSparesGame.pins = new int[]{1,1,1,1,1,1,1,1,1,1,
                1,1,1,1,1,1,1,1,1,1, 0};
        int score = noStrikesOrSparesGame.score();
        assertEquals(20, score);
    }

    @Test
    public void shouldReturnThreeHundredsWhenAllStrikesAreKnockDown() {
        BowlingGame tenStrikesGame = new BowlingGame();
        tenStrikesGame.pins = new int[] {
                10, 0, 10, 0, 10, 0, 10, 0, 10, 0,
                10, 0, 10, 0, 10, 0, 10, 0, 10, 10,
                10 };
        int score = tenStrikesGame.score();
        assertEquals(300, score);
    }

    @Test
    public void shouldReturnZeroWhenAllRollsAreMissed() {
        BowlingGame zeroGame = new BowlingGame();
        zeroGame.pins = new int[]{0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0, 0};
        int score = zeroGame.score();
        assertEquals(0, score);
    }

    @Test
    public void shouldReturnCorrectResultForTenSpares() {
        BowlingGame tenStrikesGame = new BowlingGame();
        tenStrikesGame.pins = new int[] {
                1, 9, 1, 9, 1, 9, 1, 9, 1, 9,
                1, 9, 1, 9, 1, 9, 1, 9, 1, 9,
                1 };
        int score = tenStrikesGame.score();
        assertEquals(110, score);
    }
}