public class MinDistance {
    public static void main(String[] args) {
        System.out.println(minDistance(8));
        System.out.println(minDistance(13013));
       
        }
       
    
    static int minDistance(int n){
        int minDistance=Integer.MAX_VALUE;
        int prev=1;
        for(int i=2;i<=n;i++){
            if(n%i==0 && (i - prev)<minDistance){
                minDistance=i-prev;
                prev=i;
            }
        }
        return minDistance;
    }
    
}
