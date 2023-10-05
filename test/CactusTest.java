import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CactusTest {

    @Test
    void dailyLiquidInLitres() {

        Plant test = new Cactus("Test", 50);

        assertThrows(IllegalArgumentException.class,
                () -> {
                    Cactus c = new Cactus("Joe", -0.1);
                });

        assertEquals(0.02, test.dailyLiquidInLitres());
        assertNotEquals(0.01, test.dailyLiquidInLitres());
    }
}