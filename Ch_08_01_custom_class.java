class Employee
{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.print("My id is "+id);
        System.out.println(" and my name is "+name);

    }
}
public class Ch_08_01_custom_class {
    public static void main(String[] args){
        Employee aryan = new Employee();
        Employee john = new Employee();

        // Setting Attributes
         aryan.id = 334;
         aryan.name = "aryan";
         aryan.salary = 34000;
         john.id = 232746;
         john.name = "John Soni";
         john.salary = 40000;

        // System.out.println(Aryan.id);
        // System.out.println(Aryan.name);
        
        // Printing Attributes
        aryan.printDetails();
        john.printDetails();
        System.out.print(john.salary); 



    }
}
