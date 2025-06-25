public class maxnumarr {
    public static int majorityCount(int[] num) {
        int majorityCount = num.length/2;

        for(int i=0; i<num.length; i++){
            int count  = 0;
            for(int j=0; j<num.length; j++){
                if(num[i]==num[j]){
                    count++;
                }
            }
            if(count>majorityCount){
                return num[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num ={2,2,1,1,1,2,2};
        System.out.println(majorityCount(num));
    }
    
}
