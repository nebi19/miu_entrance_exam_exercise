public class NUpCount {
    public static void main(String[] s){
        System.out.println( nUpCount(new int[]{2, 3, 1, -6, 8, -3, -1, 2}, 5));   
       System.out.println( nUpCount(new int[]{}, 5));
        System.out.println( nUpCount(new int[]{10}, 5));
        System.out.println( nUpCount(new int[]{2, 3, 1, -6, 8, -3, -1, 2}, 20));



    }
    public static int nUpCount(int[] a, int n){
        if (a.length==0){
            return 0;
        }
        int sum=a[0];
        int res=0;
        for (int i=1;i<a.length;i++){
            if (sum<=n && (sum+a[i])>n){
                res+=1;
            }
            sum+=a[i];
        }
        return res;
    }
   
}
