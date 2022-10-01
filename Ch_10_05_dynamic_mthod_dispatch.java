class Phone{
    public void ShowTime(){
        System.out.println("Time is 8 am now ");
    }
    public void on(){
        System.out.println("Turning on Phone......");
    }
}
class SmartPhone extends Phone{
    @Override  // Recomended to use because if not overriden then produce an error 
    public void on(){
        System.out.println("Turning on SmartPhone......");
    }
    public void Music(){
        System.out.println("Playing music in SmartPhone.......");
    }
}
public class Ch_10_05_dynamic_mthod_dispatch{
    public static void main(String[] args){
        Phone obj = new SmartPhone();
        // SmartPhone obj = new Phone();// Not Allowed 
        obj.ShowTime();// will run because present in super class
        obj.on();// will run because overriden in Sub class from Super class
        // obj.Music();// Can't run this method because it is not prsent in super class 


    }   
}