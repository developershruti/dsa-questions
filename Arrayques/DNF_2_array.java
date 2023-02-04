public class DNF_2_array {
    static int arr[] = {0,1,1,1,2,2,0,0,1,2,2};
    public static void swap(int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp; 
    }

    public static void print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int n = arr.length;
        int low =0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            switch(arr[mid]){
             case 0:
                swap(low,mid);
                low++;
                mid++;
                break;
             case 1:
                mid++;
                break;
             case 2:
                swap(mid,high);
                high--;
                break;
                default :
                break;
            }

        }
        print(arr, n);
        
    }
}
