public class Ps_05_05_factorial {
    public static void main(String[] args){
        int n = 5;
        int factorial = 1;
        for(int i=1; i<=n; i++){
           factorial *= i;
        }
        System.out.print(factorial);
    }
}
