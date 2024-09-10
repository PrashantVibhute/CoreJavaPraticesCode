package CoreJavaPratices;

public class StringPratices {

    int a;
    //final int b;

    public static void main(String[] args) {
        StringPratices obj = new StringPratices();
        System.out.println(obj.a);
        String s1 = "Hello";
        String s2 = s1 + "World";
        String s3 = "HelloWorld";
        String s4 = "Hello" + "World";

        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
    }
}