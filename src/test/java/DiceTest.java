import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    public void testTwoInputConstructor() {
        // Given
        int expectedDice = 3;
        int expectedSides = 4;
        Dice dice = new Dice(expectedDice, expectedSides);
        // When
        int actualDice = dice.numberOfDice;
        int actualSides = dice.numberOfSides;
        // Then
        Assert.assertEquals(expectedDice, actualDice);
        Assert.assertEquals(expectedSides, actualSides);
    }

    @Test
    public void testOneInputConstructor() {
        // Given
        int expectedDice = 3;
        Dice dice = new Dice(expectedDice);
        // When
        int actualDice = dice.numberOfDice;
        int actualSides = dice.numberOfSides;
        // Then
        Assert.assertEquals(expectedDice, actualDice);
        Assert.assertEquals(6, actualSides);
    }

    @Test
    void tossAndSumTest() {
        // Given
        int expectedDice = 3;
        Dice dice = new Dice(expectedDice);
        // When
        int actual1 = dice.tossAndSum();
        int actual2 = dice.tossAndSum();
        int actual3 = dice.tossAndSum();
        // Then
        Assert.assertTrue(actual1 <= 18);
        Assert.assertTrue(actual1 >= 3);
        Assert.assertTrue(actual2 <= 18);
        Assert.assertTrue(actual2 >= 3);
        Assert.assertTrue(actual3 <= 18);
        Assert.assertTrue(actual3 >= 3);
    }

    @Test
    public void testFindMinimumTossSum() {
        // Given
        int expectedDice = 3;
        int expectedSides = 4;
        Dice dice = new Dice(expectedDice, expectedSides);
        // When
        int actual = dice.findMinimumTossSum();
        // Then
        Assert.assertEquals(3, actual);
    }

    @Test
    public void testFindMaximumTossSum() {
        // Given
        int expectedDice = 3;
        int expectedSides = 4;
        Dice dice = new Dice(expectedDice, expectedSides);
        // When
        int actual = dice.findMaximumTossSum();
        // Then
        Assert.assertEquals(12, actual);
    }
}