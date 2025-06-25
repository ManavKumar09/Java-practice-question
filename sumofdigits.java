import java.util.Scanner;
public class sumofdigits {
    public static int digitsSum(int n){
        int sum = 0;
        while(n>0){
            int lastdigit = n % 10;
            sum = sum + lastdigit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        System.out.println(digitsSum(digit));
    }
    
}
