package WEEK5;
class point5 {
    private int x, y; // 한 점을 구성하는 x, y 좌표
    public point5() {
        this.x = this.y = 0;
    }
    public point5(int x, int y) {
        this.x = x; this.y = y;
    }
    public void showPoint() { // 점의 좌표 출력
        System.out.println("(" + x + "," + y + ")");
    }
}
class ColorPoint5 extends point5 {
    private String color; // 점의 색

    public ColorPoint5(int x, int y, String color) {
        super(x, y); // Point의 생성자 Point(x, y) 호출
        this.color = color;
    }

    public void showColorPoint() { // 컬러 점의 좌표 출력
        System.out.print(color);
        showPoint(); // Point 클래스의 showPoint() 호출
    }
}

public class SuperEx_5_3 {
    public static void main(String[] args) {
        ColorPoint5 cp = new ColorPoint5(5, 6, "blue");
        cp.showColorPoint();
    }
}
