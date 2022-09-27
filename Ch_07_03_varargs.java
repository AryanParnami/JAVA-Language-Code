public class Ch_07_03_varargs {
    /*static int sum(int ...arr){ // will also run without any argument also 
        int result =x;
        // int ...arr--> int [] arr
        for (int a : arr) {
            result += a;
        }
        return result;
    } */
    static int sum(int x,int ...arr){ // int x is used to make user give atleast 1 argument
        int result =x;
        // int ...arr--> int [] arr
        for (int a : arr) {
            result += a;
        }
        return result;
    }
    public static void main(String [] args){
        System.out.println("Welcome to varargs tutorial!!");
        // when we have to use a same funtion of different no. of times then we use varargs
        System.out.println("Then value of sum of numbers is : "+sum(4,5,6,7,8));
        System.out.println("Then value of sum of nothing is : "+sum(2,2));


        


    }
}
