
// first approach 

public class DNF_array {
    public static void sorto12(int arr[],int n){
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i =0;i<n;i++){
            if(arr[i]==0){
                zero++;
            }else if(arr[i]==1){
                one++;
            }
            else{
                two++;
            }
        }
        int index = 0;
        for(int i=0;i<zero;i++){
            arr[index]=0;
            index++;
        }
        for(int i=0;i<one;i++){
            arr[index]=1;
            index++;
        }
        for(int i=0;i<two;i++){
            arr[index] = 2;
            index++;
        }
    }
    public static void print(int arr[],int n){
      for(int i=0;i<n;i++){
          System.out.print(arr[i]+ ",");
      }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,1,1,2,2,0,0,1,2,2};
        int n = arr.length;
        sorto12(arr, n);
        print(arr, n);
        
    }
}
