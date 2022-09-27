class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
    public class Ps_08_01_emlpoyee_details_user_defined_class{
        public static void main(String[] args){
            Employee aman = new Employee();
            aman.setName("Aman Soni");
            aman.salary = 40000;
            System.out.println(aman.getName());
            System.out.println("Salary of Aman Soni is : "+aman.getSalary());
        }
    }

