// this is two pointer question i and j is pointer

public class reversearray {
    public static void main(String[] args) {
        int arr[] = {8,5,7,6,3,2,1};
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
        for(int k=0;k<n;k++){
        System.out.println(arr[k]);
        }
    }
}

//   int idx = 0;
    //   while(idx<z.length){
    //     if(z[idx]==0){
    //         idx++;
    //     }
    //         else {
    //             break;
    //         }
    //         while(idx<z.length){
    //             System.out.println(z[idx]);
    //             idx++;
    //         }

