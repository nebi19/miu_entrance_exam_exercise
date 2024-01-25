public class MinMaxDisjoint {
    public static void main(String[] args) {
        System.out.println(isMinMaxDisjoint(new int[]{5, 4, 1, 3, 
       2}));
        System.out.println(isMinMaxDisjoint(new int[]{18, -1, 3, 4, 
       0}));
        System.out.println(isMinMaxDisjoint(new int[]{9, 0, 5, 9}));
        System.out.println(isMinMaxDisjoint(new int[]{0, 5, 18, 0, 
       9}));
        System.out.println(isMinMaxDisjoint(new int[]{7, 7, 7, 7}));
        System.out.println(isMinMaxDisjoint(new int[]{}));
        System.out.println(isMinMaxDisjoint(new int[]{1, 2}));
        System.out.println(isMinMaxDisjoint(new int[]{1}));
        }
    static int isMinMaxDisjoint(int[] a){
        if(a.length<=2) return 0;
        int minIndex=0;
        int maxIndex=0;
        for(int i=0;i<a.length;i++){
            if(a[minIndex]>a[i]) minIndex=i;
            if(a[maxIndex]<a[i]) maxIndex=i;
        }
        if(a[maxIndex]==a[minIndex]||maxIndex==minIndex+1||maxIndex==minIndex-1){
            return 0;
        }
    
        for(int i=0;i<a.length;i++){
            if(i!=minIndex && a[i]==a[minIndex] || i!=maxIndex&&a[i]==a[maxIndex]){
                return 0;
            }
        }
        return 1;
    }
    
}
