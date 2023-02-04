public class missingnobyXOR {

    public static int missingnumber(int arr[],int n){
        int ans = arr[0];
        int ans1 = 1;
        for(int i=1;i<n;i++){
             ans = ans^arr[i];
        }
        for(int i=2;i<=n+1;i++){
             ans1 = ans1^i;
        }
        return (ans^ans1);
     }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int n = arr.length;
     int miss =  missingnumber(arr, n);
    System.out.println(miss);
     
       
    }
}
