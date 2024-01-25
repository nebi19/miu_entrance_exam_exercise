class ReverseDigit{
    public static void main(String[] a){
        System.out.println(reverse(-8909069));


    }
    public static int reverse(int n){
        int res=0;
        while(n!=0){
            int rem=n%10;
            res=res*10+rem;
            n=n/10;
        }

        return res;
    }
}