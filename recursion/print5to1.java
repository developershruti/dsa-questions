package sortingandsearc.recursionques;

public class print5to1 { 
    public static void print(int n){
     if(n==0){
        return;
     }
     System.out.println(n);
     print(n-1);
    }
    public static void main(String[] args) {
        print(5);

    }
} // stack build
