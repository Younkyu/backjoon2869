package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long up = sc.nextInt();
        long down = sc.nextInt();
        long v = sc.nextInt();

        long result;
        result = (v-down) / (up - down);
        if ((v-down) % (up - down) != 0 ) result++;

        System.out.println(result);
    }
}
