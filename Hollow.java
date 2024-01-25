public class Hollow {
    public static void main(String[] a){
        System.out.println(isHollow(new int[] {1,2,4,0,0,0,3,4,5}));
        System.out.println(isHollow(new int[] {1,2,4,0,0,0,0, 3,4,5} ));
        System.out.println(isHollow(new int[]  {2,4,0,0,0,0,3,4}));
        System.out.println(isHollow(new int[] {2,4,0,0,0,0,0,3,4}));         
        System.out.println(isHollow(new int[] {1,2,4,0,0,0,3,4}));
        System.out.println(isHollow(new int[] {2,4, 0,0,0, 3,4,5}));
        System.out.println(isHollow(new int[] {1,2,4, 0,0,3,4,5}));
        System.out.println(isHollow(new int[] {1,2,4,0,0,0,1, 2,4,0,0,0,
            3,4,5,0,0,0,3,4,5}));
        
    }
    static int isHollow(int[] a){
        if(a.length<3 || a[a.length/2]!=0){
            return 0;
        }
        int r=a.length/2;
        int l=a.length/2;
        int zeros=1;
        int precd=0;
        int foll=0;
        if(a.length%2==0){
            l=l-1;
            if(a[l]!=0){
                return 0;
            }
            zeros++;
        }
        l--;
        r++;
        while(l>=0 && r<a.length && a[l]==0 && a[r]==0){
            l--;
            r++;
            zeros+=2;
        }
        for(int i=0;i<=l;i++){
            if(a[i]==0){
                return 0;
            }
            precd++;
        }
        for(int j=r;j<a.length;j++){
            if(a[j]==0) return 0;
            foll++;
        }
        if(zeros>=3 && precd==foll) return 1;
        return 0;
    }
    
}
