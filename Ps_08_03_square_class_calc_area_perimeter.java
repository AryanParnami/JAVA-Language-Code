class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
    public int volume(){
        return side*side*side;
    }
}
public class Ps_08_03_square_class_calc_area_perimeter {
    public static void main(String[]args){

        Square sq = new Square();
        sq.side = 4;
        System.out.println("The perimeter of the square is : "+sq.perimeter());
        System.out.println("The area of the square is : "+sq.area());
        System.out.println("The volume of the square is : "+sq.volume());
        
    }
}
