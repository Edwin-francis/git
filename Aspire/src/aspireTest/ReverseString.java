package aspireTest;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Reverse the string
        String reversed = reverseString(input);

        // Output the reversed string
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move indices
            left++;
            right--;
        }

        return new String(charArray);
    }
}
