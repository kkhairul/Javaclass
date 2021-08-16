
public class Rectangle {

    int length;
    int breadth;




    Rectangle(int l, int b) {//2
        length = l;
        breadth = b;
    }

    public void area (){
        int ans = length * breadth;
        System.out.println("Area of Recttangle is-  "  + ans) ;




    }
    public void perameater(){
        int ans = 2*(length+breadth);
        System.out.println("PERIMETER IS RECTANGLE- "  +ans);

    }


}
class Square extends Rectangle {
    public void area (){
        int ans = length * breadth;
        System.out.println("Area of Square is-  "  + ans) ;

    }

    public void perameater() {
        int ans = 4 * (length + breadth);
        System.out.println("PERIMETER IS Square- " + ans);
    }
    Square(){
        super(8, 9);

    }
    public static void main (String [] args) {
        Rectangle r = new Rectangle(5, 6);
        r.area();
        r.perameater();
        Square s = new Square();
        s.area();
        s.perameater();//no

    }}
