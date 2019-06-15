class Name {
    String firstName, lastName;

    @Override
    public boolean equals(Object obj) {
        Name other = (Name)obj;
        return firstName.equals(other.firstName) && lastName.equals(other.lastName);
    }
}

public class ObjEquality {
    public static void main(String[] args) {
        Name n1 = new Name();
        n1.firstName = "A";
        n1.lastName = "a";

        Name n2 = new Name();
        n2.firstName = "A";
        n2.lastName = "a";

        System.out.println(n1.equals(n2));
    }
}
