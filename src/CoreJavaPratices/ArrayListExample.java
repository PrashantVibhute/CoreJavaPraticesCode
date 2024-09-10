package CoreJavaPratices;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add(String.valueOf(5));

        System.out.println("Fruits: " + fruits);

        fruits.remove("Banana");
        System.out.println("Fruits after removing Banana: " + fruits);

        System.out.println("Fruit at index 1: " + fruits.get(1));

        fruits.set(1, "Grapes");
        System.out.println("Fruits after updating index 1: " + fruits);

        System.out.println("Size of list: " + fruits.size());
    }
}
