class rectangle{
    private float length;
    private float breadth;
     float area;
     float perimeter;

    public rectangle(float l,float b){
        length = l;
        breadth = b;
    }
    public float getLength(){
        return length;
    }
    public float getBreadth(){
        return breadth;
    }
    public float getArea(){
        return length*breadth;
    }
    public float getPerimeter(){
        return 2*(length+breadth);
    }

}
public class Ps_09_02_rectangle_class_calc_formula {
    public static void main(String[] args){
        rectangle rec = new rectangle(4,6);
        System.out.println(rec.getBreadth());
        System.out.println(rec.getLength());
        System.out.println(rec.getArea());
        System.out.println(rec.getPerimeter());

    }
}
