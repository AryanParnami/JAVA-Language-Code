public class Ps_07_04_reverse_rightangle_triangle_star_pattern {
    static void pattern(int n){
        for(int i = n-1;i>=0;i--){
            for(int j = 0;j<=i;j++){
                System.out.print("*" 
                            +" ");
            }  
            System.out.println();
        } 
 }
    public static void main(String[] args){
        pattern(5);

    }
    
}
