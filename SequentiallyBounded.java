public class SequentiallyBounded {
    public static void main(String[] args) {
        System.out.println(isSequentiallyBounded(new int[]{2,3,3,99,99,99,99,99}));//1
         System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 3, 3}));//0
         System.out.println(isSequentiallyBounded(new int[]{12, 12, 9}));//0
         System.out.println(isSequentiallyBounded(new int[]{0}));//1
         System.out.println(isSequentiallyBounded(new int[]{0, 1}));//0
         System.out.println(isSequentiallyBounded(new int[]{-1, 2}));//0
         System.out.println(isSequentiallyBounded(new int[]{}));//1
         System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 5}));//1
         System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 2, 5}));//0
         }
        
    static int isSequentiallyBounded(int[] a){
        int count=1;
        for(int i=1;i<a.length;i++){
            if(a[i-1]>a[i]||count>=a[i-1]){
                return 0;
            }
            else if(a[i]==a[i-1]){
                count++;
            }
            else{
                if(count>=a[i-1]){
                    return 0;
                }
                count=1;
            }
        }
        return 1;
    }
    
}
