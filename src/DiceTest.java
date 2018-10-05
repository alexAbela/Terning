import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class DiceTest {

    Dice testDice = new Dice();

    @RepeatedTest(10)
    void testRoll() {

        testDice.roll();

        int test = testDice.roll();
        assertTrue(test >= 1 && test <= 6);
    }