class Base{
    int x;
    public int getx(){
        return x;
    }
    public void setx(int x){
       this.x= x;
    }
    public void printMe(){
        System.out.println("I am  a condtructor!!");
    }
}
class Derived extends Base{
    int y;
    public int gety(){
        return y;
    }
    public void sety(int y){
       this.y= y;
    }
}
public class Ch_10_01_inheritance {
    public static void main(String[] args){
        // Creating an object of Base class
        Base aman = new Base();
        aman.setx(4);
        System.out.println("The value of x in base is : "+aman.getx());
        aman.printMe();
        // Creating an object of Derived class 
        Derived john = new Derived();
        john.setx(35);
        System.out.println("The value of x in base is : "+john.getx());
        john.sety(55);
        System.out.println("The value of x in base is : "+john.gety());

         // we can access method of Base in Derived but can't access method of Derived in Base in case of public
           
    



    }
    
}
