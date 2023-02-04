public class finddublicatebyXOR {
    public static int dublicatenumber(int arr[],int n){
        int ans = 0;
        for(int i=0;i<n;i++){
             ans = ans^arr[i];
        }
        for(int i=1;i<n;i++){
             ans = ans^i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,5};
        int n = arr.length;
        int dub = dublicatenumber(arr, n);
        System.out.println("dublicate number is " + dub);
   
    }
}
