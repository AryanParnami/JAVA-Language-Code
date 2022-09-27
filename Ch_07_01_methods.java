public class Ch_07_01_methods{
    static int logic (int x,int y){ // it's just same as function in c/c++
        int z;
        if(x<y){
            z = (x + y);
        }
        else{
            z = (x + y)*5;
        }
        return z;
    }
    public static void main(String[] args){
        int a = 5;
        int b = 7;
        int c;
        c = logic(a, b);

        System.out.print(c);

    }
}