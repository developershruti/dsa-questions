

public class rotatebyk {
    // tc - o(n)
    public static void approach_1(int arr[],int n, int k){
        for(int j=1;j<=k;j++){
            int x = arr[n-1];
            for(int i=n-1;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = x;
        }
        
    }

    //second approach  tc - O(n) sc - O(n)
    public static void approach2(int arr[],int n,int k){
         int temp[] = new int [n];
         for(int i=0;i<n;i++){
            temp[(i+k)%n] = arr[i];
        }
        
        for(int i=0;i<n;i++){
        
            System.out.print(temp[i]);
         }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        int n = arr.length;
         approach_1(arr, n, k);
        approach2(arr, n, k);
     
    }
}

