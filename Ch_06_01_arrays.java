public class Ch_06_01_arrays {
    public static void main(String[] args) {
        // // 1. Declaration and memory allocation
        // int [] marks = new int[5];

        // // 2. Declaration and then memory allocation
        // int [] marks;
        // marks = new int[5];
        // Intialization
        // marks[0] = 100;
        // marks[1] = 45;
        // marks[2] = 87;
        // marks[3] = 68;
        // marks[4] = 86;

        // 3. Declaration, memory allocation and initialization together
        int[] marks = { 100, 45, 87, 68, 86 }; 

        System.out.println(marks[2]);

        // Arrays with other data type
        float [] marks2 = { 58.89f, 45.95f, 87.65f, 68.26f, 86.25f }; 
        System.out.println(marks2[0]);
        String [] students = {"aryan","vinay","jatin","sandeep"};
        System.out.println(students[0]);

    }
}