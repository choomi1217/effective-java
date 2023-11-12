package chapter01.item06;

public class AutoBoxing {

    public static void main(String[] args) {
        wrong();
        right();
    }

    private static void right() {
        long start = System.nanoTime();
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
        long end = System.nanoTime();
        System.out.println(" elapsed time :" + String.valueOf(end - start));
    }

    private static void wrong() {
        long start = System.nanoTime();
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
        long end = System.nanoTime();
        System.out.println(" elapsed time :" + String.valueOf(end - start));
    }

}
