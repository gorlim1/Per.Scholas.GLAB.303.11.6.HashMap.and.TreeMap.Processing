import java.util.HashMap;

public class ExampleOneHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> languages = new HashMap<>();

        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        languages.put(4, "C Sharp");

        System.out.println("HashMap: " + languages);

        String value = languages.remove(2);
        System.out.println("Removed: " + value);
        System.out.println("Updated HashMap: " + languages);
    }
}