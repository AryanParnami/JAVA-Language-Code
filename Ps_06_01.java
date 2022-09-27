public class Ps_06_01 {
    public static void main(String [] args){
       float [] marks = {23,45,67,49.5f,29};
       float sum = 0.0f;
       for (float element : marks) {
         sum = sum + element;
       }
       System.out.println(sum);
    }  
 }

