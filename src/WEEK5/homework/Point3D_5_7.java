package WEEK5.homework;

public class Point3D_5_7 extends Point{

        private int z;

        public Point3D_5_7() {      // 문제에선 사용할일이 없지만 기본생성자는 적어주는게 좋다.
            super(0,0);
            z = 0;
        }

        public Point3D_5_7(int x, int y, int z) {
            super(x, y);
            this.z = z;
        }

        void moveUp() { z++; }

        void moveDown() { z--; }

        public String toString() {

            String a;
            a = "(" + getX() + "," + getY() + "," + z + ")의 점";

            return a;
        }

        public void move(int x, int y, int z) {
            super.move(x, y);
            this.z = z;
        }

        public static void main(String[] args) {  // 메인

            Point3D_5_7 p = new Point3D_5_7(1, 2, 3);
            System.out.println(p.toString() + "입니다.");

            p.moveUp();
            System.out.println(p.toString() + "입니다.");

            p.moveDown();
            p.move(10, 10);
            System.out.println(p.toString() + "입니다.");

            p.move(100, 200, 300);
            System.out.println(p.toString() + "입니다.");

        }
    }
