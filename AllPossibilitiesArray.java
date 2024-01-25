public class AllPossibilitiesArray {
    public static void main(String[] a){

    }
    static int allPossibilitiesArray(int[] a){
        boolean[] temp=new boolean[a.length];
        for(int i=0;i<=a.length;i++){
            temp[i]=false;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>=0 && a[i]<a.length){
                temp[a[i]]=true;
            }else{
                return 0;
            }
        }
        for(int i=0;i<a.length;i++){
            if(temp[i]){
                continue;
            }else{
                return 0;
            }
        }
        return 1;
    }
    
}
