public class CountPrime {
    public static void main(String[] ar){
        System.out.println(countPrime(-2, 0));
        System.out.println(countPrime(0, 10));
        System.out.println(countPrime(10, 30));
        System.out.println(countPrime(11, 29));
        System.out.println(countPrime(20, 22));
        System.out.println(countPrime(1, 1));
        System.out.println(countPrime(5, 5));
        System.out.println(countPrime(11, 29));
        System.out.println(countPrime(6, 2));
        System.out.println(countPrime(-6, 6));




    }
    public static int countPrime(int start,int end){
        int count=0;
        for (int i=start;i<=end;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i=2;i<=n/2;i++){
            if (n%i==0){
                return false;
            }
        }
       return true;

    }
    
}
