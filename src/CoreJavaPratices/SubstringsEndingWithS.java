package CoreJavaPratices;

public class SubstringsEndingWithS {
    public static void main(String[] args) {
        String input = "SKNMSLKMSexamplestringsJKBJBJSBJBSJBSJKBNKJSBSJHBSJSJNSKJBSIBNSKJS";  // Example input string
        printSubstringsEndingWithS(input);
    }

    public static void printSubstringsEndingWithS(String str) {
        int length = str.length();

        // Loop through the string to find substrings that end with 's'
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == 's') {
                // Print all substrings from the beginning up to the current 's'
                System.out.println("Substrings Ending With S:-");
                for (int j = 0; j <= i; j++) {
                    System.out.println(str.substring(j, i + 1));
                }
            }
        }
    }
}
