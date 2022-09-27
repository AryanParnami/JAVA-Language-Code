public class Ps_06_06_max {
    public static void main(String [] args){
        int [] arr = {3,5,6,7,4,89};
        int max = Integer.MIN_VALUE; // integer.min.value it contain lowest value
        for (int i : arr) {
            if(i>max){
                max = i;
            }
        }
     System.out.format("The maximum value of array is %d \n",max);
     System.out.println(Integer.MAX_VALUE);
     System.out.println(Integer.MIN_VALUE);

    }
}
