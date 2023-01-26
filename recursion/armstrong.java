package sortingandsearc.recursionques;

public class armstrong {
    static int s=0;
    public static boolean arm(int original, int r){
        if(original==0){
            return false;
        }
        int temp = original;
        r = original%10;
        s = s+r*r*r;
        arm(original/10, r);
        if(temp==s){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println(arm(153, 0));        
    }
}
