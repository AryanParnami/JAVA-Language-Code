class OneClass{
    int a;
    int v;
    public void setA(int a) {
       // a = a;// if the variable is same then to specify the variable we use this.
       // otherwise the output will be 0
       this.a = a; 
    }
    public int getA(){
        return a;
    }
     OneClass(int v) {
        System.out.println("I am constructor of OneClass");
    }
    
}
class SecondClass  extends OneClass{

    SecondClass(int v) {
        super(v); 
        System.out.println("I am constructor of SecondClass");
        
    }
    
}
public class Ch_10_03_this_super_keyword_in_java{
    public static void main(String[] args){
        // OneClass joy = new OneClass(4);
        // joy.setA(45324);
       // System.out.println("The value of a is : "+joy.getA());
       SecondClass joy2 = new SecondClass(34);

    }
}