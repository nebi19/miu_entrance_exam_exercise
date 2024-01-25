public class IsolatedNumber {
    public static void main(String[] args) {
        System.out.println(isIsolated(69));
        System.out.println(isIsolated(163));
        System.out.println(isIsolated(162));
        System.out.println(isIsolated(2));
        System.out.println(isIsolated(3));
        System.out.println(isIsolated(8));
        System.out.println(isIsolated(9));
        System.out.println(isIsolated(14));
        System.out.println(isIsolated(24));
        System.out.println(isIsolated(28));
        System.out.println(isIsolated(34));
        System.out.println(isIsolated(58));
        System.out.println(isIsolated(63));
        }
       
    
    static int isIsolated(int n){
        if(n>=2097151||n<=-2097151){
            return -1;
        }
        int cube=n*n*n;
        int square=n*n;
        boolean[] num=new boolean[10];
        while(cube>0){
            num[cube%10]=true;
            cube/=10;
        }
        while(square>0){
            if(num[square%10]) return 0;
            square/=10;
        }
        return 1;


    }
}
