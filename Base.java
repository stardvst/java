public class Base {
    void foo() {
        System.out.println("Base");
    }
}

class Derived extends Base {
    @Override
    void foo() {
        System.out.println("Derived");
    }
}

class Test {
    public static void main(String[] args) {
        Base b = new Derived();
        b.foo();
    }
}