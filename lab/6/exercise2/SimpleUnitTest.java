public abstract class SimpleUnitTest {
    public static final void assertTrue(boolean condition) {
        if (!condition) {
            throw new AssertionError();
        }
    }

    public abstract void runAllTests();

    public static final void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Wrong number of arguments. Expecting 1 argument.");
            System.err.println("Usage: java SimpleUnitTest <test class name>");
            System.exit(1);
        }
        String testName = args[0];
        Class<?> testClass = null;
        try {
            testClass = Class.forName(testName);
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + testName);
            System.err.println("Did you forget to compile it first?");
            System.exit(1);
        }
        SimpleUnitTest test = null;
        try {
            test = (SimpleUnitTest) testClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }
        test.runAllTests();
        System.out.println("All tests passed!");
    }
} 