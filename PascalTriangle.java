import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] s){
        int numRows = 5; // Change this to the desired number of rows
        printPascal(numRows);
    }

    public static void printPascal(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            
            // First element in each row is 1
            temp.add(1);
            
            // Fill in the rest of the elements for the current row
            if (i > 0) {
                List<Integer> prevRow = res.get(i - 1);
                for (int j = 1; j < i; j++) {
                    int num = prevRow.get(j - 1) + prevRow.get(j);
                    temp.add(num);
                }
                
                // Last element in each row is also 1
                temp.add(1);
            }
            
            // Add the current row to the result
            res.add(temp);
        }
        
        // Print Pascal's Triangle
        for (List<Integer> row : res) {
            for (Integer num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public void printPascal1(int r){
        /**
         * binomial expansion combination(n,i)=fac(n/fac(n-i)fac(n))
         * here the problem  is how to fix the integer overflow
         * this works till 12 row
         *1    1
         *2   1 1
         *3  1 2 1
         *4 1 3 3 1   4-0/4 4-1/4

         */
        for (int i=0;i<=r;i++){
            for (int j=0;j<=i;j++){
                // numij=
            }
        }
    }
}
