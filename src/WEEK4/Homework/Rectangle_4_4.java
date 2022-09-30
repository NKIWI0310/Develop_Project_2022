package WEEK4.Homework;
import java.util.Scanner;
class Rectangle{
    private int x = 0;
    private int y = 0;
    private int width = 0;
    private int height = 0;

    public Rectangle(){}
    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int square() {
        return width * height;
    }

    public void show() {
        System.out.printf("(%d,%d)에서 크기가 %dx%d인 사각형 \n", x, y, width, height);
    }

    public boolean contains (Rectangle r) {
        // x,y 좌표가 r의 좌표에 포함 되는지 그리고(and) 가로 세로의 값에 x,y 좌표 값을 더한 것 보다 큰 경우. 포함된다.
        if ((x < r.x) && (y < r.y) && ( x + width > r.x + r.width && y + height > r.y + r.height ))
            return true;
        else
            return false;
    }
}
public class Rectangle_4_4 {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s을 포함합니다.");
    }
}
