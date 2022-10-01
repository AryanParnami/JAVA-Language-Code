class MyMainEmlpoyee{

    private int id;
    private String name;

    public MyMainEmlpoyee(){ // constructor
        id = 45;
        name = "Your Name Here";
    }
    // Using two or more constructor with same class is also constructor overloading
    
    public MyMainEmlpoyee(int myId,String myName){ // constructor with argument 
        id = myId;
        name = myName;
    }
    
    // public void setID(int i){id = i;}
    // public void setName( String n){name = n;}

    public String getName(){ return name;} 
    public int getId(){return id;}
}

public class Ch_09_02_constructor {
    public static void main(String[] args){
    MyMainEmlpoyee aman = new MyMainEmlpoyee(55,"Aman");

    System.out.println(aman.getName());
    System.out.println(aman.getId());




    }

}
