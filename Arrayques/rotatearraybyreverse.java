
// optimize approach tc - O(n) sc - O(1)
public class rotatearraybyreverse {
        public static void reversearray(int arr[],int i,int j){
        
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
            i++;
            j--;
        
        }
    }
    
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k=3;
       reversearray(arr, 0, k);
       reversearray(arr, k+1, n-1);
       reversearray(arr, 0, n-1);
       print(arr);
      
    }
}



// this is not optimize approch but we can used it.
// public static  void rotate(int arr[],int n,int k){
//     for(int j=0;j<k;j++){
//         for(int i=0;i<n;i++ ){

//             int temp = arr[i];  
//             arr[i] = arr[j];
//             arr[j] = temp;  
//         }
      
//        }
      
//     }
//  public static void rotate1(int arr[],int n,int k){
//     for(int j=k;j<n;j++){
//         for(int i=0;i<n;i++ ){

//             int temp = arr[i];  
//             arr[i] = arr[j];
//             arr[j] = temp;  
//         }

//     }
// }
//  public static void rotate2(int arr[],int n,int k){
//     for(int j=0;j<n;j++){
//      for(int i=0;i<n;i++){
//         int temp = arr[i];  
//         arr[i] = arr[j];
//         arr[j] = temp;  
        
//      }

    
//     }
//  }
//   public static void print(int arr[], int n){
//     for(int i =0;i<n;i++){
//         System.out.print(arr[i]);
//     }
//   }
// public static void main(String[] args) {
// int arr[] = {1,2,3,4,5,6,7};
// int n = arr.length;
// int k = 3;
// rotate(arr, n, k);
// rotate1(arr, n, k);
// rotate2(arr, n, k);
// print(arr,n);
// }

// }

