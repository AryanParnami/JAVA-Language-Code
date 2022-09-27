public class Ch_07_02_method_overloading {
    static void telljoke(){
        System.out.print("I invented a new word!!\nPlagarism!");}

    // static void change(int a){
    //     a = 98;
    // }
    // static void change2(int []arr){

    //     arr[0] = 98;
    // }



    // overloading method 
     static void foo(){
        System.out.println("Good Morning Bro!!");

     }
     static void foo(int a){
        System.out.println("Good Morning "+a+" Bro!!"); // argument
     }
     static void foo(int a,int b){ // parameter
        System.out.println("Good Morning "+a+" Bro!!");
        System.out.println("Good Morning "+b+" Bro!!");

     }

    public static void main(String[] args){
        // telljoke();
        // // case 1. changing the value

    //     int [] marks = {34,56,67,34,47};
    //     int x = 45;
    //     change(x);
    //     System.out.println("The value of x after changing is "+ x);

    // //case 2. changing value of element of arrays
        // int [] marks = {34,56,67,34,47};
        // change2(marks);

        // System.out.println("The value of first element of marks array after changing is "+ marks[0]);
        foo();
        foo(433);// Argument are actual
        foo(3000,3434);

 }

}