public class Ch_07_04_recursion{
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    static int factorial_iterative(int n){// n*(n-1)*(n-2)*(n-3)----1
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for (int i = 1; i <=n; i++) {// 1*2*3*(n-1)*n
                
                product *=i;                
            }
            return product;

        }
    }
    public static void main(String [] args){
        System.out.println("The factorial of 5 is : "+ factorial(5));
        System.out.println("The factorial of 5 is : "+ factorial_iterative(5));  

    }
    }
