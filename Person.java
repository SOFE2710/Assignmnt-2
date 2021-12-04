public class Person {
    private String   name;


    public Person(String initialName) {
        name = initialName;
    }

    public Person() {
    }

    public void setName( String fullName) {
        name = fullName;
    }


    public String getName() {
        return name;
    }

    public String toString() {
        System.out.println("Name: " + name);
        return null;
    }
}
