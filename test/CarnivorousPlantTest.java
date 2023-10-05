import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarnivorousPlantTest {

    @Test
    void dailyLiquidInLitres() {

        Plant test = new CarnivorousPlant("Test", 2.5);

        double expectedOutput = 0.2 * 2.5 + 0.1;

        assertThrows(IllegalArgumentException.class,
                () -> {
                    CarnivorousPlant c = new CarnivorousPlant("Joe", -0.1);
                });

        assertEquals(expectedOutput, test.dailyLiquidInLitres());
        assertNotEquals(2.5,test.dailyLiquidInLitres() );
    }

}