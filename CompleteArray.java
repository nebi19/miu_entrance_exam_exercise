public class CompleteArray {
    public static void main(String[] a){
        System.out.println(isComplete(new int[]{2,3,2, 4, 11, 6, 10, 9, 8}));
 System.out.println(isComplete(new int[]{2, 3,2,4, 11, 8, 10, 9, 8}));
 System.out.println(isComplete(new int[]{2, 3, 3, 6}));
 System.out.println(isComplete(new int[]{2, -3, 4, 3, 6}));
 System.out.println();
 System.out.println(isComplete(new int[]{36, -28}));
 System.out.println(isComplete(new int[]{36, 28}));
 System.out.println(isComplete(new int[]{4}));
 System.out.println(isComplete(new int[]{3, 2, 1, 1, 5, 6}));
 System.out.println(isComplete(new int[]{3,7,23,13,107,-99,97, 81}));
 System.out.println();
 System.out.println(isComplete(new int[]{-5,6,2,3,2,4,5, 11, 8, 7}));
 System.out.println(isComplete(new int[]{5, 7, 9, 13}));
 System.out.println(isComplete(new int[]{2, 2}));
 System.out.println(isComplete(new int[]{2, 6, 3, 4}));

    } 
    static int isComplete(int[] a){
        boolean even=false;
        boolean perfectSquare=false;
        for(int i=0;i<a.length;i++){
            if (a[i]%2==0)even=true;
            if(isPerfetSquare(a[i])==1) perfectSquare=true;
        }
        if(even && perfectSquare){
            for(int i=0;i<a.length;i++){
                for(int j=i+1;j<a.length;j++){
                    if(a[i]+a[j]==8) return 1;
                }
            }
        }



        return 0;
    }
    static int isPerfetSquare(int n){
        if (n<0)return 0;
        int i=0;
        while(i*i<=n){
            if(i*i==n) return 1;
            i+=1;
        }

        return 0;
    }
}
