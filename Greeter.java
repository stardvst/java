import java.util.concurrent.atomic.AtomicReference;

/**
 * A class for producing simple greetings.
 */
public class Greeter {
    /**
     * Constructs a Greeter object to greet someone.
     * @param aName name of the entity.
     */
    public Greeter(String aName) {
        name = aName;
    }

    /**
     * Sets a new name.
     * @param aName The new name.
     */
    public void setName(String aName) {
        name = aName;
    }

    public void setName(Greeter other) {
        // state is possible to change, but... see below two methods
        other.name = name;
    }

    public void setLength(int n) {
        // this has no effect outside the method
        n = name.length();
    }

    public void setGreeter(Greeter other) {
        // this has no effect outside the method
        other = new Greeter(name);
    }

    /**
     * Greets with hello message.
     * @return A message containing the name of the entity
     */
    String sayHello() {
        return "Hello " + name + "!";
    }

    /**
     * The actual entity name.
     */
    private String name;
}

/**
 * This class tests the Greeter class.
 */
class GreeterTest {
    /**
     * @param args args of main method.
     */
    public static void main(String[] args) {
        int length = 0;
        Greeter worldGreeter = new Greeter("World");
        Greeter daveGreeter = new Greeter("Dave");
        worldGreeter.setLength(length);
        worldGreeter.setGreeter(daveGreeter);

        // cannot change parameter VALUE
        System.out.println(length);
        System.out.println(worldGreeter.sayHello());

        // CAN change parameter STATE
        daveGreeter.setName(worldGreeter);
        System.out.println(worldGreeter.sayHello());
    }
}