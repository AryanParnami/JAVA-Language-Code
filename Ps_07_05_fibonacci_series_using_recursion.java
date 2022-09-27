public class Ps_07_05_fibonacci_series_using_recursion {
    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args){
        System.out.print(fib(8));
   }  
} 
