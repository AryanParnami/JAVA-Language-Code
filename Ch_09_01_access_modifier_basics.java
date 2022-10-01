class MyEmlpoyee{
    private int id;
    private String name;
    public void setID(int i){
        id = i;
    }
    public void setName( String n){
        name = n;
    }
    public String getName(){
        return name;
    } 
    
    public int getID(){
        return id;
    }
    
}

public class Ch_09_01_access_modifier_basics{
    public static void main(String [] args){
        MyEmlpoyee aman = new MyEmlpoyee();
        // aman.id = 34;
        // aman.name = "Aman Soni";---> Will throws an error because of private access modifier
        aman.setID(44);
        aman.setName("Aman Soni");
        System.out.println(aman.getID());
        System.out.println(aman.getName());
    }
}