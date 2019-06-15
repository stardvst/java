public class StaticClass {
    public static int[] arr = new int[4];

    static {
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = i;
        }
    }

    public static void main(String[] args) {
        StaticClass cl = new StaticClass();
        System.out.println(StaticClass.arr[1]);
        System.out.println(StaticClass.arr[2]);
    }
}
