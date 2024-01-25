public class MedhavArray {
    public static void main(String[] s){

        int result = isMadhavArray(new int[]{2, 1, 1});
System.out.println(result);
result = isMadhavArray(new int[]{2, 1, 1, 4, -1, -1});
System.out.println(result);
result = isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0});
System.out.println(result);
result = isMadhavArray(new int[]{18, 9, 10, 6, 6, 6});
System.out.println(result);
result = isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4});
System.out.println(result);
result = isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 
1, 1, -2, -1});
System.out.println(result);
result = isMadhavArray(new int[]{3, 1, 2, 3, 0});
System.out.println(result);

    }
    public static int isMadhavArray(int[] a){
        int i=1;
        int counter=2;
        int current_sum=0;
        int n=a.length;
        int subseqSum=0;
        int index=0;
        while(subseqSum<n){
            subseqSum=index*(index+1)/2;
            index++;
        }
        if (subseqSum!=n){
            System.out.println("frist");
            return 0;
        }
        while(i<n){
            for (int j=i;j<i+counter;j++){
                current_sum+=a[j];
            }
            if (a[0]!=current_sum){
                 System.out.println("second");
                return 0;
            }
            current_sum=0;
            i+=counter;
            counter+=1;
        }
        return 1;
    }
    
}
