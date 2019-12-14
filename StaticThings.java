import java.util.Random;

public class StaticThings {
    public static final double E = 2.71;
    public static final double PI = 3.14;

    public static void main(String[] args) {
        Random generator = new Random();
        for (int i = 0; i < 10; ++i)
            System.out.println(generator.nextInt());
    }
}