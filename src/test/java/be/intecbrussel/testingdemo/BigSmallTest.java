package be.intecbrussel.testingdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BigSmallTest {

    @Test
    public void isBiggerThan() {
        BigSmall bigSmall = new BigSmall();

        Assertions.assertTrue(bigSmall.isBigger(15, 9));
    }

}