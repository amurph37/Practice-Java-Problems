public class Warmup2 {
    public static void main(String[] args) {
        System.out.println();
    }

    boolean doubleX(String str) {
        // Find the first occurrence of "x" in the string
        int i = str.indexOf("x");

        // If there is no "x" in the string, return false
        if (i == -1) return false;

        // If "x" is the last character in the string, return false
        if (i + 1 >= str.length()) return false;

        // Check if the character immediately following the first "x" is also "x"
        return str.substring(i + 1, i + 2).equals("x");
    }

    public String stringBits(String str) {
        // Initialize an empty string to store the result
        String result = "";

        // Loop through the string, incrementing by 2 each time to get every other character
        for (int i = 0; i < str.length(); i += 2) {
            // Add the current character to the result string
            result = result + str.substring(i, i + 1);
        }

        // Return the resulting string with every other character from the original string
        return result;
    }

}


