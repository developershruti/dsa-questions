package sortingandsearc.recursionques;

public class reverseno {
    public static void rev(int n){
        if(n<10){
            System.out.print(n);
            return;
        }
        System.out.print(n%10);
        rev(n/10);
    }
    public static void main(String[] args) {
        rev(82695);
    }
}
