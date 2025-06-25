public class printdigits {
        static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void digitsAlphabet(int number){
        if(number==0){
            return;
        }

        int lastDigit = number % 10;
        digitsAlphabet(number/10);
        System.out.println(digits[lastDigit]);
        
    }
    public static void main(String[] args) {
       digitsAlphabet(1234);
    }
    
}
