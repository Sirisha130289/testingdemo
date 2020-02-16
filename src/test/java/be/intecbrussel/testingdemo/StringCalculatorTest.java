package be.intecbrussel.testingdemo;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StringCalculatorTest {
    StringCalculator stringCalculator = new StringCalculator();

    @Test
    @Order(1)
    public void addEmpty() throws Exception {
        Assertions.assertEquals(0, stringCalculator.add(""));
    }

    @Test
    @Order(2)
    public void addSingleNumber() throws Exception {
        Assertions.assertEquals(5, stringCalculator.add("5"));
    }

    @Test
    @Order(3)
    public void add2Numbers() throws Exception {
        Assertions.assertEquals(3, stringCalculator.add("1" + StringCalculator.DELIMITER + "2"));
    }

    @Test
    @Order(4)
    public void addMultipleNumbers() throws Exception {
        Assertions.assertEquals(10, stringCalculator.add("1" + StringCalculator.DELIMITER + "2" + StringCalculator.DELIMITER + "3" + StringCalculator.DELIMITER + "4"));
    }

    @Test
    @Order(5)
    public void addNewLineNumbers() throws Exception {
        Assertions.assertEquals(10, stringCalculator.add("1\n2\n3\n4"));
    }

    @Test
    @Order(6)
    public void addNewLineAndDelimiterCombinationNumbers() throws Exception {
        Assertions.assertEquals(10, stringCalculator.add("1\n2" + StringCalculator.DELIMITER + "3" + StringCalculator.DELIMITER + "4"));
    }

    @Test()
    @Order(7)
    public void throwExceptionNegativeNumbers() throws Exception {

        Assertions.assertThrows(Exception.class, () -> stringCalculator.add("-1" + StringCalculator.DELIMITER + "-4"));
    }

    @Test
    @Order(8)
    public void getCalledCountTest() {
        Assertions.assertEquals(7, stringCalculator.getCalledCount());
    }

  @Test
  @Order(9)
  public void addMoreThan1000Numbers() throws Exception {
    Assertions.assertEquals(1, stringCalculator.add("1" + StringCalculator.DELIMITER + "2000"));
  }
}