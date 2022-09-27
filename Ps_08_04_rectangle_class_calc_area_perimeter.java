class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
    public class Ps_08_04_rectangle_class_calc_area_perimeter{
            public static void main(String[] args){
                Rectangle rec = new Rectangle();
                rec.length = 2;
                rec.breadth = 2;
                System.out.println("The area of the rectangle is : "+rec.area());
                System.out.println("The perimeter of the rectangle is : "+rec.perimeter());

            }
    }
