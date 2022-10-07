package WEEK5.homework;

class Point {
    private int x, y;
    public Point() {}
    public Point(int x, int y) {
        this.x=x; this.y=y;
    }
    int getX() { return x; }
    int getY() { return y; }
    protected void move(int x, int y) { this.x=x; this.y=y; }

}

public class ColorPoint_5_5 extends Point {
    String color;

    ColorPoint_5_5(int x, int y, String color) {
        super(x,y);
        this.color=color;
    }

    void setXY(int x, int y) {
        super.move(x,y);
    }

    void setColor(String color) {
        this.color=color;
    }

    public String toString() {
        String a = color+"색의 ("+getX()+","+getY()+")의 점";
        return a;
    }

    public static void main(String[] args) {

        ColorPoint_5_5 cp = new ColorPoint_5_5(5,5,"YELLOW");

        cp.setXY(10,20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str + "입니다.");

    }
}
