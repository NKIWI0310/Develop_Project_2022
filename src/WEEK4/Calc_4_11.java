package WEEK4;

public class Calc_4_11 {
        public static int abs(int a) { return a>0?a:-a; }
        public static int max(int a, int b) { return (a>b)?a:b; }
        public static int min(int a, int b) { return (a>b)?b:a; }
}

class CalcEx {
        public static void main(String[] args) {
            System.out.println(Calc_4_11.abs(-5));
            System.out.println(Calc_4_11.max(10, 8));
            System.out.println(Calc_4_11.min(-3, -8));
        }
    }
