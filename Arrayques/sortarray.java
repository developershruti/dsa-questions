
public class sortarray {
    // first approach tc - O(n^2)
    public static void sort(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    System.out.println(" Array is not in sorted order");
                    return;
                }
            }
            
        }
        System.out.println("array is sorted");
    }
    // second and optmization approach tc - O(n)
    public static void sort1(int arr[],int n){
        for(int i=1;i<n;i++){
           if(arr[i-1]>arr[i]){
            System.out.println("array is not in sorted order");
            return;
           }
        }
        System.out.println("array is sorted");
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7};
        int n = arr.length;
        sort1(arr, n);
    }
}
