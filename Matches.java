public class Matches {

    public static void main(String[] args) {
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{3, -2, 3} ));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3,18}, new int[]{2, 1, -1, -1, 2, 1} ));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 
        18}, new int[]{1, 2, -1, -1, 1, 2} ));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 
        18}, new int[]{2, 1, -2, 3} ));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 
        18}, new int[]{1, 1, 1, -1, -1, 1, 1, 1} ));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 
        18}, new int[]{1, 1, 1, -1, -1, 1, 1, 1} ));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 
        18}, new int[]{4, -1, 3} ));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 
        18}, new int[]{2, -3, 3} ));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 
        18}, new int[]{8} ));
        }
        
    static int matches(int[] a,int[] p){
        int indexa=0;
        int indexp=0;
        while (indexa<a.length){
            boolean isPositive=true;
            int pattern=p[indexp];
            if(pattern<0){
                pattern*=-1;
                isPositive=false;
            }
            for(int j=indexa;j<indexa+pattern;j++){
                if(a[j]>0 && !isPositive || a[j]<0 && isPositive ) return 0;
            }
            indexa+=pattern;
            indexp++;
        }
        return 1;
    }
    
}
