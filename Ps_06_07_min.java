public class Ps_06_07_min {
    public static void main(String [] args){
        int [] arr = {30,5,6,7,4,89};
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if(i<min){
                min = i;
            }
        }
     System.out.format("The minimum value in array is %d",min);
    }

}
