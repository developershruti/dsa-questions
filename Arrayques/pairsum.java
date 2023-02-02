import java.util.Arrays;
import java.util.HashMap;

public class pairsum {
    //  approach1 time complexity O(n^2)
    public static void apprach1(int arr[],int k){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum = arr[i]+arr[j];
                if(sum == k){
                    System.out.println("pair found " + arr[i] + " and " + arr[j]);
                    return;
                }

            }
        }
    }

   // second approach time complexity O(n), sc- O(n)
    public static void approach2(int arr[],int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int element : arr){
            if(map.get(element)== null){
                map.put(k-element,element);
            }
            else{
                System.out.println("pair found " + map.get(element)+ ","+ element);
                return;
            }
        }

    }



    // optimization approach
    // sort + two pointer
    public static void approach3(int arr[],int k){
        Arrays.sort(arr);
        int i =0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]== k){
                System.out.println("pair found"+ arr[i]+ ","+ arr[j]);
                return;
            }
            if(arr[i]+arr[j]<k){
                i++;
            }
            else if(arr[i]+arr[j]>k){
                j--;
            }

        }
    }
    public static void main(String[] args) {
        int arr[] = {2,9,3,5,9,4,6,3,10,5};
        int k = 14;
        approach3(arr, k);
    }
}
