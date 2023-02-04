public class buysell_1 {
     static int k =0;

    public static void approach_1(int arr[],int n){
        int min= arr[0];
        int profit = 0;
        int max = 0;
        for(int i=1;i<n;i++){ 
          if(min>arr[i]){
             min = arr[i];
             k=i;
          }
        }
        for(int j=k;j<n;j++){
          if(max<arr[j]){
              max = arr[j];
          }
        }
        profit = max  - min;
        System.out.println(profit);
 }
    
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int n = arr.length;
       approach_1(arr, n); 
    }
}
