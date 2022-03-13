import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinsTest {

    @Test
    void constructorTest() {
        // Given
        int expectedMinimumTossSum = 2;
        int expectedMaximumTossSum = 12;
        int expectedArrayLength = 11;
        Bins bins = new Bins(expectedMinimumTossSum, expectedMaximumTossSum);
        // When
        int actualMinimum = bins.minimumTossSum;
        int actualMaximum = bins.maximumTossSum;
        int actualArrayLength = bins.binsArray.length;
        // Then
        Assert.assertEquals(expectedMinimumTossSum, actualMinimum);
        Assert.assertEquals(expectedMaximumTossSum, actualMaximum);
        Assert.assertEquals(expectedArrayLength, actualArrayLength);
    }

    @Test
    void getBin() {
        // Given
        int MinimumTossSum = 2;
        int MaximumTossSum = 12;
        Bins bins = new Bins(MinimumTossSum, MaximumTossSum);
        // When
        bins.incrementBin(12);
        bins.incrementBin(11);
        bins.incrementBin(3);
        bins.incrementBin(12);
        int actual12 = bins.getBin(12);
        int actual11 = bins.getBin(11);
        int actual3 = bins.getBin(3);
        // Then
        int bin12Expected = 2;
        int bin11Expected = 1;
        int bin3Expected = 1;
        Assert.assertEquals(bin3Expected, actual3);
        Assert.assertEquals(bin11Expected, actual11);
        Assert.assertEquals(bin12Expected, actual12);
    }

    @Test
    void incrementBin() {
        // Given
        int MinimumTossSum = 2;
        int MaximumTossSum = 12;
        Bins bins = new Bins(MinimumTossSum, MaximumTossSum);
        // When
        bins.incrementBin(11);
        bins.incrementBin(10);
        bins.incrementBin(3);
        bins.incrementBin(11);
        int actual11 = bins.getBin(11);
        int actual10 = bins.getBin(10);
        int actual3 = bins.getBin(3);
        // Then
        int bin11Expected = 2;
        int bin10Expected = 1;
        int bin3Expected = 1;
        Assert.assertEquals(bin3Expected, actual3);
        Assert.assertEquals(bin10Expected, actual10);
        Assert.assertEquals(bin11Expected, actual11);
    }
}