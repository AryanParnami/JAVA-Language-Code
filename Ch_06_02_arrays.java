public class Ch_06_02_arrays {
    public static void main(String[] args){
        int[] marks = { 100, 45, 87, 68, 86 }; 

        //System.out.println(marks.length);
    //    *********** Displaying  the arrays(Naive way) ************
    System.out.println("Printing using Naive way ");

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

    //    *************Displaying the array(For loop)***************

    System.out.println("Printing using for loop");

        for (int i=0; i< marks.length; i++) {

            System.out.println(marks[i]);
        }

        //****************FOR EACH LOOP************************
    System.out.println("Printing using for each loop");

        for (int b : marks) {
            System.out.println(b);
    
        }

        // ***************** QUICK QUIZ ********************
    // System.out.println("Printing in reverse order using for loop");

    //     for (int a=marks.length -1; a>=0; a--) {

    //         System.out.println(marks[a]);
    //     }

        

       


        
    }

}