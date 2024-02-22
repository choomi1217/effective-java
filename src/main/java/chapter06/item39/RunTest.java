package chapter06.item39;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class RunTest {
    public static void main(String[] args) {
        //sampleTest();
        //sampleTest2();
        sampleTest3();
    }

    private static void sampleTest3() {
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Sample3.class;
        for (Method m : testClass.getDeclaredMethods()){
            if(m.isAnnotationPresent(ExceptionTest2.class)){
                tests++;
                try {
                    m.invoke(null);
                    System.out.printf("Test %s failed: no exception%n", m);
                } catch (Throwable wrappedEx) {
                    Throwable ex = wrappedEx.getCause();
                    int oldPassed = passed;
                    Class<? extends Throwable>[] excTypes = m.getAnnotation(ExceptionTest2.class).value();
                    for (Class<? extends Throwable> excType : excTypes) {
                        if (excType.isInstance(ex)) {
                            passed++;
                            break;
                        }
                    }
                    if (passed == oldPassed) {
                        System.out.printf("Test %s failed: %s %n", m, ex);
                    }
                }
            }
        }
        System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);
    }

    private static void sampleTest2() {
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Sample2.class;
        for (Method m : testClass.getDeclaredMethods()) {
            if(m.isAnnotationPresent(ExceptionTest.class)) {
                tests++;
                try {
                    m.invoke(null);
                    System.out.printf("Test %s failed: no exception%n", m);
                } catch (InvocationTargetException wrappedEx) {
                    Throwable ex = wrappedEx.getCause();
                    Class<? extends Throwable> excType = m.getAnnotation(ExceptionTest.class).value();
                    if (excType.isInstance(ex)) {
                        passed++;
                    } else {
                        System.out.printf("Test %s failed: expected %s, got %s%n", m, excType.getName(), ex);
                    }
                } catch (Exception ex) {
                    System.out.println("Invalid @Test: " + m);
                }
            }
        }
        System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);
    }

    private static void sampleTest() {
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Sample.class;
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Test.class)) {
                tests++;
                try {
                    m.invoke(null);
                    passed++;
                } catch (Exception ex) {
                    System.out.println(m + " failed: " + ex);
                }
            }
        }
        System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);
    }
}
// Output:
//public static void chapter06.item39.Sample.m3() failed: java.lang.reflect.InvocationTargetException
//public void chapter06.item39.Sample.m5() failed: java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "obj" is null
//public static void chapter06.item39.Sample.m7() failed: java.lang.reflect.InvocationTargetException
//Passed: 1, Failed: 3


// Output:
//Test public static void chapter06.item39.Sample2.m2() failed: expected java.lang.ArithmeticException, got java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0
//Test public static void chapter06.item39.Sample2.m3() failed: no exception
//Passed: 1, Failed: 2