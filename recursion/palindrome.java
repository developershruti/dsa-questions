package sortingandsearc.recursionques;

public class palindrome {
    static int s=0;
    public static boolean palin(int original , int r){
        if(original==0){
            return false;
        }
        int n = original;
           r = original%10;
           s = s*10+r;
           palin(original/10, r);
           if(n==s){
            return true;
           }
            return false;
           
        
    }
 public static void main(String[] args) {
    
    System.out.println(palin(2332, 0));
    
 }   
}
