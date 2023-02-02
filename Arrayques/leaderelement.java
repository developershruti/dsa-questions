public class leaderelement {
    public static void leader(int arr[],int n){
        int max = 0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>max){
                System.out.println(arr[i]);
                max = arr[i];
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,12,34,30,23,6,10,7,9};
        int n = arr.length;
        leader(arr, n);
    }
}
