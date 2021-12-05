import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shoudCalculateRegistredAndBonusUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registred = true;
        long expected = 30;

        long actual = service.calculate(amount, registred);


        assertEquals(expected, actual);
    }

    @Test
    void shoudCalculateRegistredAndBonusOverLimit() {
        BonusService service = new BonusService();

        long amount = 1000_000_60;
        boolean registred = true;
        long expected = 500;

        long actual = service.calculate(amount, registred);


        assertEquals(expected, actual);
    }

    @Test
    void shoudCalculateNoRegistredAndBonusUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registred = false;
        long expected = 10;

        long actual = service.calculate(amount, registred);


        assertEquals(expected, actual);
    }

    @Test
    void shoudCalculateNoRegistredAndBonusOverLimit() {
        BonusService service = new BonusService();

        long amount = 1000_000_000_60L;
        boolean registred = false;
        long expected = 500;

        long actual = service.calculate(amount, registred);


        assertEquals(expected, actual);
    }
}