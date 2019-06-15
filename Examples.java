import java.util.*;
import java.util.stream.Collectors;

public class Examples {
    public static void main(String[] args) {
        workWithStream();
    }

    public static void workWithStream() {
        List<String> words = new ArrayList<>();
        words.add("boomerang");
        words.add("apple");
        words.add("automobile");

        words = words.stream().filter(w -> w.length() > 5)
                .map(w -> w + "$")
                .sorted()
                .collect(Collectors.toList());

        words.forEach(System.out::println);
    }

    public static void workWithSet() {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(5);
        set.add(6);
        set.add(5);

        System.out.println("Set size: " + set.size());

        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println("Element: " + iter.next());
        }

        set.forEach(el -> System.out.println("From lambda: " + el));

        set.forEach(System.out::println);
    }

    public static void workWithArray() {
        int[] array = new int[10];
        int sum = 0;

        for (int element : array) {
            sum += element;
        }

        System.out.println(sum);
    }
}