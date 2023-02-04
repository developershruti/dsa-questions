public class checkrotatedarraysortornot {
    public static boolean rotatedsort(int arr[],int n){
      int count = 0;
      for(int i=1;i<n;i++){
        if(arr[i-1]>arr[i]){
            count++;
        }
      }
      if(arr[n-1]>arr[0]){
        count++;
      }
        return count<=1;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        int n = arr.length;
       System.out.println( rotatedsort(arr, n));
    }
}
