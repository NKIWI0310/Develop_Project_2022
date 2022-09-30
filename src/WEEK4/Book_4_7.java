package WEEK4;

import java.util.Scanner;

public class Book_4_7 {
    String title, author;
    public Book_4_7(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
class Book_4_7_Array {
    public static void main(String[] args) {
        Book_4_7 [] Book_4_7 = new Book_4_7[2]; // Book_4_7 배열 선언
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<Book_4_7.length; i++) {
            System.out.print("제목>>");
            String title = scanner.nextLine();
            System.out.print("저자>>");
            String author = scanner.nextLine();
            Book_4_7[i] = new Book_4_7(title, author);
        }
        for(int i=0; i<Book_4_7.length; i++)

            System.out.print("(" + Book_4_7[i].title + ", " + Book_4_7[i].author + ")");
        scanner.close();
    }
}
