package sortingandsearc.recursionques;

public class print1to5 {
    public static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        print(5);
    }
}
// stackfall pr print hogi value
