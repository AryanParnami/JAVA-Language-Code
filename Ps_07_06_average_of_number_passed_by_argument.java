public class Ps_07_06_average_of_number_passed_by_argument {
    static int average(int ...arr){
        int result = 0;
        int l = arr.length;
        for (int i : arr) {
            result += i; 
        }
     return result/l;
    }

    public static void main(String[] args){
        System.out.print("The average of the number is :  "+average(4,5,6,7,8));
    }
}