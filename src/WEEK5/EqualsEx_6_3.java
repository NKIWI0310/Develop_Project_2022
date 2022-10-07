package WEEK5;

class Point_6_3 {
    int x, y;
    public Point_6_3(int x, int y) {
        this.x = x; this.y = y;
    }
    public boolean equals(Object obj) {
        Point_6_3 p = (Point_6_3)obj;
        if(x == p.x && y == p.y) return true;
        else return false;
    }
}
public class EqualsEx_6_3 {

    public static void main(String[] args) {
        Point_6_3 a = new Point_6_3(2,3);
        Point_6_3 b = new Point_6_3(2,3);
        Point_6_3 c = new Point_6_3(3,4);
        if(a == b) // false
            System.out.println("a==b");
        if(a.equals(b)) // true
            System.out.println("a is equal to b");
        if(a.equals(c)) // false
            System.out.println("a is equal to c");
    }
}
