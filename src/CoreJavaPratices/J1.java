package CoreJavaPratices;

public class J1 {
    void method(int a, int b) {
        System.out.println("Two ints");
    }

    void method(int... a) {
        System.out.println("Varargs");
    }

    public static void main(String[] args) {
        String str= "Hello world:)";
        System.out.println(str.replaceAll("[^a-zA-Z]", ""));
        new J1().method(1, 2);
        new J1().method(1, 2, 3);
        Integer i1 = 128;
        Integer i2 = 128;
        if (i1 == i2) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        Integer i3 = 100;
        Integer i4 = 100;
        double a = 100;

        if (i3 == i4) {
            System.out.println("Same");
            System.out.println(a);
        } else {
            System.out.println("Different");
        }
    }
}
