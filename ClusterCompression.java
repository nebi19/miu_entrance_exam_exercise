import java.util.Arrays;

public class ClusterCompression {
    public static void main(String[] a){
        System.out.println(Arrays.toString(clusterCompression(new 
int[]{3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4})));
 System.out.println(Arrays.toString(clusterCompression(new 
int[]{0, 0, 0, 2, 0, 2, 0, 2, 0, 0})));
 System.out.println(Arrays.toString(clusterCompression(new 
int[]{18})));
 System.out.println(Arrays.toString(clusterCompression(new 
int[]{})));
 System.out.println(Arrays.toString(clusterCompression(new 
int[]{-5, -5, -5, -5, -5})));
 System.out.println(Arrays.toString(clusterCompression(new 
int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1})));
 System.out.println(Arrays.toString(clusterCompression(new 
int[]{8, 8, 6, 6, -2, -2, -2})));

    }
   static int[] clusterCompression(int[] a){
        if(a.length<=0) return new int[]{};
        int[] ar=new int[a.length];
        ar[0]=a[0];
        int index=0;
        for (int i=1;i<a.length;i++){
            if(a[i-1]!=a[i]){
                index++;
                ar[index]=a[i];
            }
        }
        int[] res=new int[index+1];
        for(int i=0;i<=index;i++){
            res[i]=ar[i];
        }
        return res;
    }
    
    
}
