public class ExpressionTest extends SimpleUnitTest {
    void testAddition() {
        assertTrue(new Add(new Value(1), new Value(1)).evaluate() == 2);
        assertTrue(new Add(new Value(1), new Value(2)).evaluate() == 3);
        assertTrue(new Add(new Value(3), new Value(-3)).evaluate() == 0);
    }

    void testMultiplication() {
        assertTrue(new Multiply(new Value(1), new Value(1)).evaluate() == 1);
        assertTrue(new Multiply(new Value(1), new Value(2)).evaluate() == 2);
        assertTrue(new Multiply(new Value(3), new Value(-3)).evaluate() == -9);
    }

    void testMixed() {
        assertTrue(new Add(new Multiply(new Value(1), new Value(1)), new Multiply(new Value(1), new Value(2))).evaluate() == 3);
        assertTrue(new Multiply(new Add(new Value(1), new Value(2)), new Add(new Value(3), new Value(4))).evaluate() == 21);
    }

    @Override
    public void runAllTests() {
        testAddition();
        testMultiplication();
        testMixed();
    }
}