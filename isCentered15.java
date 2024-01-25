public class isCentered15 {
    public static void main(String[] s){
        int result = isCentered15(new int[] {3, 2, 10, 4, 1, 6, 9});
System.out.println(result);
result = isCentered15(new int[] {2, 10, 4, 1, 6, 9});
System.out.println(result);
result = isCentered15(new int[] {3, 2, 10, 4, 1, 6});
System.out.println(result);
result = isCentered15(new int[] {1, 1, 8, 3, 1, 1});
System.out.println(result);
result = isCentered15(new int[] {9, 15, 6});
System.out.println(result);
result = isCentered15(new int[] {1, 1, 2, 2, 1, 1});
System.out.println(result);
result = isCentered15(new int[] {1, 1, 15, -1, -1});
System.out.println(result);


    }
    static int isCentered15(int[] a){
        int n=a.length;
        int mid=n/2;
        int l=0;
        int r=0;
        int sum=0;
        if (n%2==0){
            l=mid-1;
            r=mid;
            sum=a[l]+a[r];
            l--;
            r++;

        }
        else{
            l=r=mid;
            sum=a[l];
            l--;
            r++;
        }
        while(l>=0 && r<n){
            // System.out.println(sum);
            if (sum==15) return 1;
            if (sum>15) return 0;
           
            sum+=a[l]+a[r];
             l--;
            r++;
            
        }
        if (sum==15) return 1;
        return 0;
    }
    
}
