public class ContinuousFactored {
    public static void main(String[] a){
        
        System.out.println();         
        System.out.println(isContinuousFactored(6));
        System.out.println(isContinuousFactored(20));
        System.out.println(isContinuousFactored(120));
        System.out.println(isContinuousFactored(90));
        System.out.println(isContinuousFactored(99));
        System.out.println(isContinuousFactored(22));
        System.out.println(isContinuousFactored(10));
        System.out.println(isContinuousFactored(5));

    }
    static int isContinuousFactored(int n){
        for(int i=2;i<=n/2;i++){
            int temp=n;
            if(n%i==0){
                int j=i;
                while(temp%j==0 && temp!=1){
                    temp=temp/j;
                    j++;
                }
                if(temp==1){
                    for(int k=i;k<j;k++){
                        System.out.print(k+" :");
                    }
                    return 1;
                }
            }
        }
return 0;
    }
    
}
