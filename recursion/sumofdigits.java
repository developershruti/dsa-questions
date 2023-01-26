package sortingandsearc.recursionques;

public class sumofdigits {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }
    public static void main(String[] args) {
       // sum(1342);
        System.out.println(sum(1342));
    }
}
