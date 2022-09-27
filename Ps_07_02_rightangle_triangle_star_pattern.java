public class Ps_07_02_rightangle_triangle_star_pattern {
    static void pattern(int n){
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < i+1; j++) {
            System.out.print("*");
          }
          System.out.print("\n");
        }
   }
   public static void main(String[] args){
    pattern(20);
   }
}
