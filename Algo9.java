import java.util.Scanner;
import java.util.Arrays;

class Algo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[5 * n];

        for(int i = 0; i <5 * n; i++) {
            score[i] = sc.nextInt();
        }
        

        //評点を昇順にソートする
        Arrays.sort(score);

        //3N人分の平均を求める
        double sum = 0;
        for(int i = n; i < 4*n; i++) {
             sum += score[i];
        }
        double ave = sum / (3 * n);

        System.out.printf("%.15f\n", ave);
    }
}