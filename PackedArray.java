public class PackedArray {
    public static void main(String[] args) {
        System.out.println( -5%5);

        System.out.println(isPacked(new int[]{2, 2, 3, 3, 3}));

        System.out.println(isPacked(new int[]{2, 2, 2, 3, 3, 3}));
        System.out.println(isPacked(new int[]{2, 2, 1}));
        System.out.println(isPacked(new int[]{2, 2, 1, 2, 2}));
        System.out.println(isPacked(new int[]{4, 4, 4, 4, 1, 2, 2, 3, 3, 3}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7, 
       1}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 1, 7, 7, 7}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7}));
        System.out.println(isPacked(new int[]{}));
        System.out.println(isPacked(new int[]{1, 2, 1}));
        System.out.println(isPacked(new int[]{2, 1, 1}));
        System.out.println(isPacked(new int[]{-3, -3, -3}));
        System.out.println(isPacked(new int[]{0, 2, 2}));
        System.out.println(isPacked(new int[]{2, 1, 2}));
        }
    static int isPacked(int[] a){
        if(a.length==0){
            return 1;
        }
        if(a.length==1 &&a[0]!=0) return 0;
        int counter=1;
        for(int i=1;i<a.length;i++){
            if(a[i]<0||counter>a[i]){
                return 0;
            }
            if(a[i-1]==a[i]) counter++;
            else{
                if(counter!=a[i-1]) return 0;
                counter=1;
            }
        }
        if(counter!=a[a.length-1]) return 0;
        return 1;
    }
    
}
