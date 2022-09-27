public class Ps_03_03_repalce_str {
    public static void main(String args[]){
        String str = "Dear *name*,Thanks a lot!";
        str = str.replace("*name*","Aman");
        System.out.println(str);

    }
}