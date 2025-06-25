public class inversionofno {
    public static int merge(int[] arr, int left, int right, int mid){
        int i = left; int j = right; int k = 0; int invcount = 0;

        int [] temp = new int[(right - left)/2];
        while((i<mid) && (j<=right)){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }else{
                temp[k] = arr[j];
                invcount+= mid-i;
                j++;
                k++;
            }
            while(i<=mid){
                temp[k] = arr[i];
                i++;
                k++;
            }
            while(j<=right){
                temp[k] = arr[j];
                j++;
                k++;
            }
            for(i = left; k= 0 ; i<=right; i++, k++){
                arr[i] = temp[k];

            }
        }
        return invcount;
    }

    private static int mergeSort(int[] arr, int right, int left){
        int invcount = 0;
        

        if(right>left){
            int mid = (right+left)/2;
            invcount = mergeSort(arr,left,mid);
            invcount+ = mergeSort(arr,mid+1,right);
            invcount+ = merge(arr,left,mid+1,right);
        }
        return invcount;
    }

    public static int getInversions(int arr[]) {
        int n=arr.length;
        return mergeSort(arr,0,n-1);

    public static void main(String[] args) {
        int[] arr = {1,20,6,4,5};
        System.out.println(getInversions(arr));
    }
}