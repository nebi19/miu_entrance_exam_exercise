import java.util.Arrays;

public class IntegerBasedRounding {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(a, 2);
        System.out.println(Arrays.toString(a));
        int[] b = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(b, 3);
        System.out.println(Arrays.toString(b));
        int[] c = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(c, -3);
        System.out.println(Arrays.toString(c));
        int[] d = new int[]{-1, -2, -3, -4, -5};
        doIntegerBasedRounding(d, 3);
        System.out.println(Arrays.toString(d));
        int[] e = new int[]{-18, 1, 2, 3, 4, 5};
        doIntegerBasedRounding(e, 4);
        System.out.println(Arrays.toString(e));
        int[] f = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(f, 5);
        System.out.println(Arrays.toString(f));
        int[] g = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(g, 100);
        System.out.println(Arrays.toString(g));
        }
       
    static void doIntegerBasedRounding(int[] a,int n ){
        if(n<=0){
            return;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]<0) continue;
            int fac=a[i]/n;
            int nextFac=fac+1;
            if(abs(a[i]-fac*n) < abs(a[i]-nextFac*n)){
                a[i]=fac*n;
            }
            else{
                a[i]=nextFac*n;
            }
        }
        // System.out.println(Arrays.toString(a));
    }
    static int abs(int n){
        if(n<0){
            return -1*n;
        }
        return n;
    }
    
}
