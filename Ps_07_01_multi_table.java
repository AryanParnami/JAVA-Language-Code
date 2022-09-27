public class Ps_07_01_multi_table{
    static void multi_table(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d \n",n,i,(n*i));
        }
    }    
     public static void main(String[]args){
        multi_table(7);
     }   
}