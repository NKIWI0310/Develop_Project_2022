package WEEK4;
class Sample {
    public int a;
    public int b; // private error
    int c;
}

class AccessEx_4_10 {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10;
        aClass.b = 10;
        aClass.c = 10;
    }
}

