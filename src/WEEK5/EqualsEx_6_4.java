package WEEK5;

class Rect_6_4 {
    int width;
    int height;
    public Rect_6_4(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public boolean equals(Object obj) {
        Rect_6_4 p = (Rect_6_4)obj;
        if (width*height == p.width*p.height)
            return true;
        else
            return false;
    }
}
public class EqualsEx_6_4 {
    public static void main(String[] args) {
        Rect_6_4 a = new Rect_6_4(2,3);
        Rect_6_4 b = new Rect_6_4(3,2);
        Rect_6_4 c = new Rect_6_4(3,4);
        if(a.equals(b))
            System.out.println("a is equal to b");
        if(a.equals(c))
            System.out.println("a is equal to c");
        if(b.equals(c))
            System.out.println("b is equal to c");
    }

}
