class NextPerfectSquare{
    public static void main(String[] arg){
        System.out.println(nextPerfectSquare(0)); 
        System.out.println(nextPerfectSquare(-5));
        System.out.println(nextPerfectSquare(36));
        System.out.println(nextPerfectSquare(100));
        System.out.println(nextPerfectSquare(50));
        System.out.println(nextPerfectSquare1(0)); 
        System.out.println(nextPerfectSquare1(-5));
        System.out.println(nextPerfectSquare1(36));
        System.out.println(nextPerfectSquare1(100));
        System.out.println(nextPerfectSquare1(50));


    }
    public static int nextPerfectSquare(int n){
        if (n<0){
            return 0;
        }
        int i=0;
        while(i*i<=n){
            i=i+1;
        }
        return i*i;
    }
    public static int nextPerfectSquare1(int n){
        if (n<0){
            return 0;
        }
        int i=(int)Math.sqrt(n);
        int next=i+1;
        return (next)*(next);
    }

}