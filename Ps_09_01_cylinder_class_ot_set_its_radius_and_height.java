class cylinder{
    int radius; 
    int height;
    double surfacearea  ;
    double volume;
    public cylinder(int r,int h){
         radius = r;
         height = h;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    
    public  double SurfaceArea() {
        return 2*3.14d*radius*height + 2*3.14d*radius*radius;
    }
    public double Volume(){
        return 3.14*radius*radius*height;
    }
    
}
public class Ps_09_01_cylinder_class_ot_set_its_radius_and_height {
    public static void main(String[] args){

        cylinder cyl = new cylinder(5, 6);
        System.out.println(cyl.getRadius());
        System.out.println(cyl.getHeight());
        System.out.println(cyl.SurfaceArea());
        System.out.println(cyl.Volume());
    
    }
}