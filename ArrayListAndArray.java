import java.util.ArrayList;
import java.util.stream.IntStream;

public class ArrayListAndArray {
    public static void main(String[] args) {

        System.out.println("Working with ArrayList");
        System.out.println("----------------------");

        ArrayList<String> countries = new ArrayList<>();
        countries.add("Belgium");
        countries.add("Italy");
        countries.add("Thailand");

        countries.forEach(System.out::println);

        countries.set(1, "France");
        countries.add(2, "Germany");
        countries.remove(0);

        System.out.println("-------------");
        System.out.println("Updated list:");
        for (Object o : countries) {
            String country = (String) o;
            System.out.println(country);
        }

        System.out.println("----------------------");
        System.out.println("Working with Array");

        int[] numbers = new int[10];
        int length = numbers.length;
        System.out.println("Array length is " + length);
    }
}