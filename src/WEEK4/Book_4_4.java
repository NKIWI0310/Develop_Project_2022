package WEEK4;

public class Book_4_4 {
    String title;
    String author;
    public Book_4_4(String t) { // 생성자
        title = t; author = "작자미상";
    }
    public Book_4_4(String t, String a) { // 생성자
        title = t; author = a;
    }
    public static void main(String [] args) {
        Book_4_4 littlePrince = new Book_4_4("어린왕자", "생텍쥐페리");
        Book_4_4 loveStory = new Book_4_4("춘향전");
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}
