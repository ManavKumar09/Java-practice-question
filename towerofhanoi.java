public class towerofhanoi{
    public static void transfer(int n, String a, String b, String c) {
        if(n == 1){
            System.out.println("Move disk 1 from " + a + " to " + c);
            return;
        }

        transfer(n-1,a,c,b);

        transfer(n-1,b,a,c);
    }
    public static void main(String[] args) {
        int n = 4;
        transfer(n, "1", "2", "3");

    }
}
   