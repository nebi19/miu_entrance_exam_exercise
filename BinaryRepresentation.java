import java.util.Arrays;

public class BinaryRepresentation {
    public static void main(String[] args) {
 System.out.println(Arrays.toString(filterArray(new int[]{8, 4, 
9, 0, 3, 1, 2}, 88)));
 System.out.println(Arrays.toString(filterArray(new int[]{18}, 
3)));
 System.out.println(Arrays.toString(filterArray(new int[]{9, -
9}, 0)));
 System.out.println(Arrays.toString(filterArray(new int[]{9, -
9}, 1)));
 System.out.println(Arrays.toString(filterArray(new int[]{9, -
9}, 2)));
 System.out.println(Arrays.toString(filterArray(new int[]{9, -
9}, 3)));
 System.out.println(Arrays.toString(filterArray(new int[]{9, -
9}, 4)));
 System.out.println(Arrays.toString(filterArray(new int[]{9, -
9, 5}, 3)));
 System.out.println(Arrays.toString(filterArray(new int[]{0, 9, 
12, 18, -6}, 11)));
 }
static int[] filterArray(int[] a,int n){
    int[] temp=new int[a.length];
    int i=0;
    int counter=0;
    while(n>0&& counter<a.length){
        int rem=n%10;
        if (rem==1){
            if(i<a.length){
                temp[i]=a[counter];
                System.out.println(temp[i]+"i:"+i+" ");
                i++;
            }else{
                return null;
            }
        }
        counter++;
        n=n/2;
    }
    int[]  res=new int[i];
    for(int j=0;j<i;j++){
        res[j]=temp[j];
    }
    return res;

}
    
}
