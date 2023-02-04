import java.util.HashMap;
import java.util.Map;

public class oddelementbyhashmap {
    public static void getoddelement(int arr[]){
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0;i<arr.length;i++){
            int value = arr[i];
    
        if(map.get(value)==null){
        map.put(value, 1);
        }
        else{
            int count = map.get(value);
            map.put(value, count+1);
        }
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()%2!=0){
                System.out.println(e.getKey()+" ");
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,5,5,6,7,6,7};
        getoddelement(arr);

    }
}
