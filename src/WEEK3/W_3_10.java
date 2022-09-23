package WEEK3;
import java.util.Scanner;
public class W_3_10 {
    public static void main(String[] args) {
        double[][] score = new double[][]{{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
        double sum = 0.0;

        int year;
        int term;
        for(year = 0; year < score.length; ++year) {
            for(term = 0; term < score[year].length; ++term) {
                sum += score[year][term];
            }
        }

        year = score.length;
        term = score[0].length;
        System.out.println("4년 전체 평점 평균은 " + sum / (double)(year * term));
    }
}
