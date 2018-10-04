public class Zadanie8 {
    public static void main(String[] args) {
        int x=7;
        for(int i=0;i<=7;i++){
            for(int j=0;j<=7;j++){
                System.out.print("  *");
                if(j==x){
                    System.out.print("   ");
                    x--;
                }

            }
            System.out.println("");
        }
    }
}
