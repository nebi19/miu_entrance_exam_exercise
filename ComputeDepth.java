public class ComputeDepth {
    public static void main(String[] args) {
        System.out.println(computeDepth(42));
        System.out.println(computeDepth(7));
        System.out.println(computeDepth(13));
        System.out.println(computeDepth(25));
        }
       
    static int computeDepth(int n){
        boolean[] num=new boolean[10];
        // System.out.println(num[3]);
        int leftNum=10;
        int multipler=1;
        int temp=n;
        while(true){
            n=multipler*temp;
            // System.out.println(n);

            while(n>0){
                if(!num[n%10]){
                    num[n%10]=true;
                    leftNum--;
                }
                n=n/10;
            }
                    // System.out.println(leftNum);

            if(leftNum==0){return multipler;}
            multipler++;
        }
    }
    
}
