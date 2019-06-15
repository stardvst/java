final class FinalClass {
    final int[] x = new int[10];
    final void foo() {
        // x = new int[9];
        x[9] = 3;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

/*class Derived extends FinalClass {
    @Override
    void foo() {

    }
}*/
