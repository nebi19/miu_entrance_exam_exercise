public class PrintAlphabet {
    public static void main(String[] s){
        printSmallAlphabet();

    }
    public static void printCapitalAlphabet(){
        for(char i=65;i<91;i++){
            System.out.print(i+" ");
        }
    }
    public static void printSmallAlphabet(){
        for(char i=97;i<(97+26);i++){
            System.out.print(i+" ");
        }
    }
}
