import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {

    Plant test1 = new Palm("Greger", 20.1234);
    Plant test2 = new Palm("Ingeborg", 0.001);

    @Test
    void dailyLiquidInLitres() {

        assertThrows(IllegalArgumentException.class,
                () -> {
                    Palm p = new Palm("Joe", -0.1);
                });

        assertEquals(10.0617, test1.dailyLiquidInLitres());
        assertEquals(test1.getHeightInMetres() * 0.5, test1.dailyLiquidInLitres());
        assertNotEquals(10, test1.dailyLiquidInLitres());

        assertEquals(0.0005, test2.dailyLiquidInLitres());
        assertEquals(test2.getHeightInMetres() * 0.5, test2.dailyLiquidInLitres());
        assertNotEquals(0, test2.dailyLiquidInLitres());

    }
}