class Rectangle{
    public int length = 10;
    public int breadth = 20;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
public class Rectangle1{
    public static void main(String[] args){
        Rectangle obj = new Rectangle();
         System.out.println("the area of rectangle is:"+obj.area());
         System.out.println("the perimeter is:"+obj.perimeter());
    }
}
