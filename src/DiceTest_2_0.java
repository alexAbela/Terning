import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class DiceTest_2_0 {

    @RepeatedTest(20)
    void testRoll() {

        Dice testDice = new Dice();


        int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, d6 = 0;

        for (int d = 1; d <= 60000; d++) {
            int t = testDice.roll();
            switch (t) {
                case 1:
                    d1++;
                    break;
                case 2:
                    d2++;
                    break;
                case 3:
                    d3++;
                    break;
                case 4:
                    d4++;
                    break;
                case 5:
                    d5++;
                    break;
                case 6:
                    d6++;
                    break;
                default:
                    break;

            }
        }
            assertTrue(d1>= 9600 && d1<= 10400
                    && d2>= 9600 && d2<= 10400
                    && d3>= 9600 && d3<= 10400
                    && d4>= 9600 && d4<= 10400
                    && d5>= 9600 && d5<= 10400
                    && d6>= 9600 && d6<= 10400
            );







    }
}