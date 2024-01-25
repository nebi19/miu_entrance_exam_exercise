public class ConvertToBase10 {
    public static void main(String[] s){
        System.out.println(convertToBase10(new int[ ] {1, 0, 1, 1}, 2));
        System.out.println(convertToBase10(new int[ ] {1, 1, 2}, 3) );        
        System.out.println(convertToBase10(new int[ ] {3, 2, 5}, 8));
        System.out.println(convertToBase10 (new int[ ] {3, 7, 1}, 6));

    }
    static int convertToBase10(int[] a,int base){
        int n=a.length-1;
        int res=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0 || a[i]>=base) return -1;
            res+=a[i]*power(n,base);
            n--;
        }
        return res;
    }
    static int power(int num,int base){
        int res=1;
        while(num>0){
            res*=base;
            num--;
        }
        return res;
    }
    
}
