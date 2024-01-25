public class Permutation {
    public static void main(String[] s){
        permutation("ABC", "");

    }
    private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
        System.err.println(perm);
        }  
        for (int i = 0; i < word.length(); i++) {
            permutation(perm + word.charAt(i), word.substring(0, i)+ word.substring(i + 1, word.length()));
        }        
        }
       }
       
