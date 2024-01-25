public class Array121 {
    public static void main(String[] a){
        System.out.println(is121Array(new int[]{1, 2, 1}));
        System.out.println(is121Array(new int[]{1, 1,2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1,2,2,2,1, 1, 1}));
        System.out.println(is121Array(new int[]{1,1, 2, 1, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1,1,1,2,2,2,1,1,1, 3}));
        System.out.println(is121Array(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(is121Array(new int[]{2,2,2,1,1,1,2,2,2,1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1,2,2,2, 1, 1, 2, 2}));
        System.out.println(is121Array(new int[]{2, 2, 2}));


    }
    static int  is121Array(int[] a){
        boolean one,two,isbeginwithone;
        one=false;
        two=false;
        isbeginwithone=false;
        int l,r;
        l=0;
        r=a.length-1;
        for (int i=0;i<a.length;i++){
            if(a[i]==1||a[i]==2){
                if(a[i]==1) one=true;
                if(a[i]==2) two=true;
            }else{
                return 0;
            }
        }
        while(l<r){
            if(a[l]==1||a[r]==1){
                if(a[l]!=a[r])return 0;
                else{
                    l++;
                    r--;
                    isbeginwithone=true;
                }
            }else{
                break;
            }
        }
        for(;l<r;l++){
            if(a[l]!=2)return 0;
        }
        if(isbeginwithone && one && two){
            return 1;
        }
        return 0;

    }
    
}
