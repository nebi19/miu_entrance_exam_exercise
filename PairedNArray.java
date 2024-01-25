public class PairedNArray {
    public static void main(String[] a){
        System.out.println(isPairedN(new int[]{1,4, 1,4, 5, 6}, 5));
 System.out.println(isPairedN(new int[]{1, 4, 1,4, 5, 6}, 6));
 System.out.println(isPairedN(new int[]{0,1,2,3,4,5,6,7,8}, 6));
 System.out.println(isPairedN(new int[] {1, 4, 1}, 5));
 System.out.println(isPairedN(new int[] {8, 8,8,8,7,7,7}, 15));
 System.out.println(isPairedN(new int[]{8,-8,8,8,7,7,-7},-15));
 System.out.println(isPairedN(new int[] {3}, 3));
 System.out.println(isPairedN(new int[] {}, 0));


    }
    public static int isPairedN(int[] a, int n){
        int l=0;
        int r=a.length-1;
        if (n<0 || n>(r+r-1)){
            System.out.println("in frist");
            return 0;
        }
        while(l<r){
            int sum=l+r;
            if (sum==n){
                if (a[l]+a[r]==n){

                    return 1;
                }else{
                    l++;
                    r--;
                }
            }
            else if (sum<n){
                l++;
            }
            else{
                r--;
            }
        }
                    System.out.println("in last");

        return 0;
    }
    
}
