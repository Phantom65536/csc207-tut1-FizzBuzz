import static java.lang.Math.min;

public class Multiples {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;

        // method 1
        int lcm = 15;
        int upper_bound = 1000;
        System.out.println((upper_bound - 1) / x + (upper_bound - 1) / y -
                (upper_bound - 1) / lcm);

        // method 2
        int count = 0;
        for (int i = min(x, y); i < upper_bound; i++)
            count = (i % x == 0 || i % y == 0) ? count + 1 : count;
        System.out.println(count);
    }
}
