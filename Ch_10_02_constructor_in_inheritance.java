class Base1 {
    int y;
    Base1() {
        System.out.println("I am a Base class constructor");
    }
    Base1(int y) {
        System.out.println("I am a base class overloaded constructor with value of y as: "+y);
    }

}

class Derived1 extends Base1 {
    Derived1() {
       // super(y);  // calling overloaded constructors or constructor with argument
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x,int y) {
        super(y);// calling overloaded constructors or constructor with argument
        System.out.println("I am a derived class overloaded constructor with value of x as: "+x);
    }
}

class ChildOfDerived extends Derived1 {
    ChildOfDerived() {
       // super(y);  // calling overloaded constructors or constructor with argument
        System.out.println("I am a ChildOfDerived class constructor");
    }
    ChildOfDerived(int x,int y,int z) {
        super(x,y);// calling overloaded constructors or constructor with argument
        System.out.println("I am a ChildOfDerived class overloaded constructor with value of z as: "+z);
    }

}

public class Ch_10_02_constructor_in_inheritance { 
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1();
       // Derived1 e = new Derived1(43,4);// If constructor is present in both classes then
        // first base class's constructor will run the derived class's constructor will run
        ChildOfDerived cd = new ChildOfDerived(23,45,56);
    }
}
