public class Ps_07_03_sum_of_first_n_natural_number_using_recursion_function {
    static void sum(int n){
        int sum = 0;

        for (int i = 0; i <=n; i++) {
            sum +=i;    
        }
     System.out.printf("The sum of first %d number is : %d ",n,sum);
    }
    static int sumRec(int n){// Another method
    
        if(n==1){
            return 1;
        }
        
        return n + sumRec(n-1);
    
        
    }
    public static void main(String[] args){
        // sum(4);
        
        System.out.print(sumRec(4));
    }
}
