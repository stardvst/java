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
        Greeter worldGreeter = new Greeter("World");

        Greeter newGreeter = worldGreeter;
        AtomicReference<String> greeting = new AtomicReference<>(worldGreeter.sayHello());
        System.out.printf("Before changing the name: %s%n", greeting.get());

        // assign new name
        newGreeter.setName("Dave");

        greeting.set(worldGreeter.sayHello());
        System.out.println("After changing the name: " + greeting.get());
    }
}