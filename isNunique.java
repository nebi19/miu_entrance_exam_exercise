public class isNunique {
    public static void main(String[] args){
        int result = isNUnique(new int[] {7, 3, 3, 2, 4}, 6);
        System.out.println(result);
        result = isNUnique(new int[] {7, 3, 3, 2, 4}, 10);
        System.out.println(result);
        result = isNUnique(new int[] {7, 3, 3, 2, 4}, 11);
        System.out.println(result);
        result = isNUnique(new int[] {7, 3, 3, 2, 4}, 8);
        System.out.println(result);
        result = isNUnique(new int[] {7, 3, 3, 2, 4}, 4);
        System.out.println(result);
        result = isNUnique(new int[] {1}, 6);
        System.out.println(result);
        }
   static int isNUnique(int[] a,int n){
    int nSum=0;
    for (int i=0;i<a.length;i++){
        for(int j=i;j<a.length;j++){
            if(a[i]+a[j]==n){
                nSum++;
            }
        }
        if(nSum!=1) return 0;
    }
    return 1;

   } 
}
