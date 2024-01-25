public class solve10 {
    public static void main(String[] s){
        int result = repsEqual(new int[] {3, 2, 0, 5, 3}, 32053);
System.out.println(result);
result = repsEqual(new int[] {3, 2, 0, 5}, 32053);
System.out.println(result);
result = repsEqual(new int[] {3, 2, 0, 5, 3, 4}, 32053);
System.out.println(result);
result = repsEqual(new int[] {2, 3, 0, 5, 3}, 32053);
System.out.println(result);
result = repsEqual(new int[] {9, 3, 1, 1, 2}, 32053);
System.out.println(result);
result = repsEqual(new int[] {0, 3, 2, 0, 5, 3}, 32053);
System.out.println(result);

            // int fac10=fac(10);
            // int x=1;
            // int y=10;
            // boolean flag=false;
            // while(y>x){
            //     int facx=fac(x);
            //     int facy=fac(y);
            //     int sum=facx+facy;
            //     System.out.println("sum: "+sum+"  fac10 : "+fac10+" x:"+x+" y" +y);

            //     if(sum==fac10){
            //         flag=true;
            //         System.out.println(x+" "+y);
            //         break;
            //     }
            //     else if(sum >fac10){
            //         y=y-1;
            //     }else{
            //         x+=1;
            //     }
            // }
            // if(!flag){
            //     System.out.println(x+" "+y+"not found");
            // }
    }
   static int fac(int n){
        int res=1;
        while(n>=1){
            res*=n;
            n=n-1;
        }
        return res;
    }
  static int repsEqual(int[] a,int n){
    int digitCount=0;
    int len=a.length;
    int[] a2=new int[len];
     for (int i=len-1;i>=0;i--){
        a2[i]=0;
    }
    while(n>0){
        int rem=n%10;
        if(digitCount>=len) return 0;
;
        a2[len-1-digitCount]=rem;
        n=n/10;
        digitCount++;
    }
    // if(digitCount!=len) return 0;
    for (int i=len-1;i>=0;i--){
        if(a[i]!=a2[i]) return 0;
    }
    return 1;
  }  
}
