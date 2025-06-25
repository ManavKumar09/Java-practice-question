public class mergesortstring {
    public static String[] mergeSort(String[] arr, int lo, int hi){
        if(lo == hi){
            String[] A = { arr[lo]};
            return A;
        }
        int mid = lo + (hi-lo)/2;
        String [] arr1 = mergeSort(arr, lo, mid);
        String [] arr2 = mergeSort(arr, mid+1, hi);
        String [] arr3 = merge(arr1, arr2);
        return arr3;

    }
    static String [] merge(String [] arr1, String [] arr2){
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String[m+n];

        int i=0;
        int j=0;
        int idx=0;

      
        while(i<m && j<n){
            if(isAlphabeticallySmaller(arr1[i],arr2[j])){ // alphabetically smaller is used to compare two words from given string which is smaller 
                arr3[idx] = arr1[i];
                i++;
                idx++;
           }else{
            arr3[idx] = arr2[j];
            j++;
            idx++;
           }
           while(i<m){
            arr3[idx] = arr1[i];
            i++;
            idx++;
           }
           while(j<n){
            arr3[idx] = arr2[j];
            j++;
            idx++;
           }
        }
        return arr3;
    }

    static boolean isAlphabeticallySmaller(String str1, String str2){ // we use str1 and str2 bcs arr1 and arr2 compare only one string and str1 compare whole word
        if(str1.compareTo(str2)<0){ //less than 0 means str1 comes before str 2
            return true;
        }
        return false;


    }
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cat", "dog", "elephant"};
        String[] a = mergeSort(arr, 0, arr.length-1);
        for(int i = 0; i<arr.length; i++){
            System.out.println(a[i]);
        }    
    }
}    

