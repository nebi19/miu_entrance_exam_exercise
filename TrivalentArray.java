public class TrivalentArray {
    public static void main(String[] args) {
        System.out.println(isTrivalent(new int[]{22, 19, 10, 10, 19, 
       22, 22, 10}));
        System.out.println(isTrivalent(new int[]{1, 2, 2, 2, 2, 2, 
       2}));
        System.out.println(isTrivalent(new int[]{2, 2, 3, 3, 3, 3, 2, 
       41, 65}));
        System.out.println(isTrivalent(new int[]{-1, 0, 1, 0, 0, 0}));
        System.out.println(isTrivalent(new int[]{}));
        System.out.println(isTrivalent(new int[]{2147483647, -1, -1, -
       2147483648}));
        }
       
    static int isTrivalent(int[] a){
        int elementCounter=0;
        for(int i=0;i<a.length;i++){
            boolean flag=false;
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    flag=true;
                    break;
                }
            }
            if(!flag) elementCounter++;
            if(elementCounter>3)return 0;
        }
        if(elementCounter!=3) return 0;
        return 1;

    }
    
}
