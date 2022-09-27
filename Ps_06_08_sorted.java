public class Ps_06_08_sorted {
    public static void main(String[] args){
        int [] arr = {4,6,7,45,34,993};
        boolean itIsSorted = true;
        for (int i = 0; i< arr.length -1; i++) {
            if(arr[i] > arr[i+1]){
                itIsSorted = false;
                break;
            }
            
        }
        if(itIsSorted){
            System.out.println("The array is sorted!!");
        }
        else{
            System.out.println("The array not is sorted!!");

        }
    }
}