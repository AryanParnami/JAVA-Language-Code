class CellPhone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating....");
    }
    public void callFriend(){
        System.out.println("Calling Friend....");
    }
}


public class Ch_08_02_cell_phone_class_vibrating_ringing_calling {
    public static void main(String[] args){

    CellPhone asus = new CellPhone();
    asus.callFriend();
    asus.ring();
    asus.vibrate();

    }
    
}
