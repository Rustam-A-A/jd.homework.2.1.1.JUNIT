import org.junit.jupiter.api.*;

import java.io.IOException;

class MainTest {
    private static long suiteStartTime;
    private static int expected;
    private static int actual;
    private long testStartTime;

    @BeforeAll
    public static void initSuite(){
        System.out.println("Running CalculatorTest");
        suiteStartTime = System.nanoTime();
    }

    @AfterAll
    public static void completeSuite(){
        System.out.println("CalculatorTest completed: " +
                (System.nanoTime() - suiteStartTime));
    }

    @BeforeEach
    public void initTest(){
        System.out.println("Starting new test");
        testStartTime = System.nanoTime();
    }

    @AfterEach
    public void finalizeTest() {
        System.out.println("Test completed: " +
                (System.nanoTime() - testStartTime));
    }
    @Test
    void testAddingAndSubstraction() {
        Calculator calcul = new Calculator();
        int adding = calcul.plus.apply(1, 2);
        Assertions.assertEquals(3,adding);
        int substraction = calcul.minus.apply(1, 2);
        Assertions.assertEquals(-1, substraction);
    }

    @Test
    void testDevision() throws IOException {
        Calculator calcul = new Calculator();
        int division = calcul.devide.apply(14, 2);
        Assertions.assertEquals(7,division);
    }

    @Test
    void testDevisionWrong() throws IOException {
        Calculator calcul = new Calculator();
        int division = calcul.devide.apply(14, 2);
        Assertions.assertNotEquals(87,division);
    }

    @Test
    void testDevisionByZero() {
        Calculator calcul = new Calculator();
        int devision = calcul.devide.apply(10, 0);
        Assertions.assertEquals(-1000000, devision);
    }
}
