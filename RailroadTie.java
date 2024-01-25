public class RailroadTie {
    public static void main(String[] args) {
        System.out.println(isRailroadTie(new int[]{
       1, 2, 0, 3, -18, 0, 2, 2}));
        System.out.println(isRailroadTie(new int[]{
       1, 2, 3, 0, 2, 2}));
        System.out.println(isRailroadTie(new int[]{
       0, 1, 2, 0, 3, 4}));
        System.out.println(isRailroadTie(new int[]{
       1, 2, 0, 0, 3, 4}));
        System.out.println(isRailroadTie(new int[]{1}));
        System.out.println(isRailroadTie(new int[]{}));
        System.out.println(isRailroadTie(new int[]{0}));
        System.out.println(isRailroadTie(new int[]{1, 2}));
        System.out.println(isRailroadTie(new int[]{
       1, 2, 0, 1, 2, 0, 1, 2}));
        System.out.println(isRailroadTie(new int[]{
       3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3}));
        System.out.println(isRailroadTie(new int[]{0, 0, 0, 0}));
        System.out.println(isRailroadTie(new int[]{
       1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(isRailroadTie(new int[]{
       1, 3, 0, 3, 5, 0}));
        }
       
    static int  isRailroadTie1(int[] a){
        boolean nonZeroFlag=false;
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                if(i==0||i==n-1|| a[i-1]==0||a[i+1]==0){
                    return 0;
                }
            }
            else{
                nonZeroFlag=true;
                if(i==0&&i==n-1)return 0;
                if( (i==0 && (i+1)<n && a[i+1]==0 ) || ( i>0 && i==(n-1) && a[i-1]==0) || (i>0 && i<(n-1)&&(a[i-1]!=0 && a[i+1]!=0 || a[i-1]==0 && a[i+1]==0)) ){
                    return 0;
                }
            }
        }
        if(!nonZeroFlag) return 0;
        return 1;
    }
    

static int isRailroadTie(int[] a){
    if(a.length<2||a[0]==0||a[a.length-1]==0){
        return 0;
    }
    // 1, 2, 0, 3, -18, 0, 2, 2
    boolean nonZeroFlag=false;
    for(int i=0;i<a.length;i++){
        if(a[i]!=0){
            nonZeroFlag=true;
            if(i==0){
                if(a[i+1]==0) return 0;
            }
            else if(i==a.length-1){
                if(a[i-1]==0)return 0;
            }else if(a[i-1]==0&&a[i+1]==0 || a[i-1]!=0 && a[i+1]!=0)return 0;
        }else{
            if(a[i-1]==0 || a[i+1]==0)return 0;

        }
    }
    if(nonZeroFlag) return 1;
    return 0;
}
}
