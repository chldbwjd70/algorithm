package com.study.section2.피보나치수열_4;

import java.util.Scanner;

public class TeachMain {

    /*
     * Note.
     *
     * */

    public int[] solution(int n) {
        int[] answer = new int[n];

        answer[0] = 1;
        answer[1] = 1;

        for(int i=2; i < n; i++){
            answer[i] = answer[i-1] + answer[i-2];
        }

        return answer;
    }


    public static void main(String[] args) {
        TeachMain teachMain = new TeachMain();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for(int x : teachMain.solution(n)) System.out.print( x + " ");

    }
}
