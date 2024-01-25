public class MercurialArray {
    public static void main(String[] ar){
        System.out.println(isMercurial(new int[]{1,2,10,3,15,1,2, 2}));
 System.out.println(isMercurial(new int[]{5, 2, 10, 3, 15, 1, 2, 2}));
 System.out.println(isMercurial(new int[]{1,2,10,3,15,16,2,2}));
 System.out.println(isMercurial(new int[]{3,2,18,1,0,3,-11,1,3}));
 System.out.println(isMercurial(new int[]{2, 3, 1, 1, 18}));
 System.out.println(isMercurial(new int[]{8, 2, 1, 1, 18, 3, 5}));
 System.out.println(isMercurial(new int[]{3, 3, 3, 3, 3, 3}));
 System.out.println(isMercurial(new int[]{1}));
 System.out.println(isMercurial(new int[]{}));


    }
    public static int isMercurial(int[] a){
        boolean isPre=false;
        boolean isthree=false;
        for (int i=0;i<a.length;i++){
            if (a[i]==1){
                if (isthree){
                    return 0;
                }
                isPre=true;
            }
            else if(a[i]==3){
                if(isPre){
                    isthree=true;
                }
            }
        }
        return 1;
    }
    
}
