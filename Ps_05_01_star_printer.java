public class Ps_05_01_star_printer {
    public static void main(String args[]){
        int n = 40;
        for(int i = n; i>0; i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
         
            System.out.print("\n");
        }
    }
}

