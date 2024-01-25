public class DecodeArray {
    public static void main(String[] args) {
        System.out.println("\n\n" + decodeArray2(new int[]{1}));
        System.out.println(decodeArray2(new int[]{0, 1}));
        System.out.println(decodeArray2(new int[]{-1, 0, 1}));
        System.out.println(decodeArray2(new int[]{0, 1, 1, 1, 1, 1, 0, 
       1}));
        System.out.println(decodeArray2(new int[]{0, 0, 0, 0, 0, 0, 0, 
       0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
       1}));
        System.out.println(decodeArray2(new int[]{0, 1, 0, 0, 1, 0, 0, 
       0, 1, 0, 0, 0, 0, 1}));
        System.out.println(decodeArray2(new int[]{-1, 0, 0, 1, 1, 0, 
       1}));
        }
    static int decodeArray2(int[] a){
        if(a.length<=0){
            return 0;
        }
        int multi=1;
        int zerocount=0;
        int num=0;
    
        if(a[0]<0) multi=-1;
        for(int i=0;i<a.length;i++){
            
            if(a[i]<0) continue;
            if(a[i]==0)zerocount++;
            else{
                 num=num*10 + zerocount;
                 zerocount=0;
            }
        }
    return multi*num;
    }
    
}
