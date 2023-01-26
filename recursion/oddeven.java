package sortingandsearc.recursionques;

public class oddeven {
    public static void odev(int n){
        if(n==0){
            return;
        }
        if(n%2!=0){ // stacbuild pr print hoga
            System.out.println(n);
        }
        odev(n-1);
        if(n%2==0){  // stackfall pr print hoga
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
     odev(5); 
    }
}
