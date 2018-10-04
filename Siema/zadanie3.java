public class zadanie3 {
    public static void main(String[] args) {
        int szer=0;
        int szer2=6;
        for(int i=0;i<=6;i++){
            for(int j=szer2;j>0;j--){
                System.out.print("  ");
            }
            szer2--;
            for(int k=0;k<szer;k++){
                System.out.print("* ");
            }
            szer++;
            System.out.println(" ");
        }

    }
}
