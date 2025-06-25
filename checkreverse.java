import java.util.Scanner;

public class checkreverse {

    // Main method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int palindrome = sc.nextInt();

        if(isPalindrome(palindrome)){
            System.out.println(palindrome + " is a palindrome");
        } else {
            System.out.println(palindrome + " is not a palindrome");
        }
    }

    // Palindrome checker method
    public static boolean isPalindrome(int number){
        int original = number;  // Store original number
        int reverse = 0;

        while(number != 0){
            int remainder = number % 10;       // Get last digit
            reverse = reverse * 10 + remainder; // Build reversed number
            number = number / 10;              // Remove last digit
        }

         if(number == reverse){
            return true;
         } 
         return false; // Compare after the full reverse
    }
}

