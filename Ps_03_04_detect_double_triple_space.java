public class Ps_03_04_detect_double_triple_space {
    public static void main(String args[]){
        String str = "This string contains   double and triple spaces";
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));
    }
}