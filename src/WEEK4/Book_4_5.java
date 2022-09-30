package WEEK4;

public class Book_4_5 {
    String title;
    String author;
    void show() { System.out.println(title + " " + author); }

    public Book_4_5() {
        this("", "");
        System.out.println("생성자 호출됨");
    }
    public Book_4_5(String title) {
        this(title, "작자미상");
    }
    public Book_4_5(String title, String author) {
        this.title = title; this.author = author;
    }
    public static void main(String [] args) {
        Book_4_5 littlePrince = new Book_4_5("어린왕자", "생텍쥐페리");
        Book_4_5 loveStory = new Book_4_5("춘향전");
        Book_4_5 emptyBook_4_5 = new Book_4_5();
        loveStory.show();
    }
}
