public class subtractionarray {
   
    static int j;
    static int i;
    public static void main(String[] args) {
        int a[] = {6,7,1,1};    // this is i
        int b[] = {2,3,4,5};     // this is j
        int b_len = b.length;
       // int n = x_len>y_len ? x_len: y_len;
    
      //  int av = j>=0?b[j]:0;
        int z[] = new int[b_len];
       int  i = a.length-1;
        int j = b.length-1;
        int k =  z.length-1;
        int carry =0;
        int sub = 0;
        while(k>=0){
            if(a[i]+carry>=b[j]){
                sub = a[i]+carry-b[j];
                carry=0;
            }else{
                sub = a[i]+carry+10-b[j];
                carry = -1;
            }
            z[k] = sub;
            i--;
            j--;
            k--;
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

    for(int e: z){
        System.out.println(e);
     }
        }
      }
    

