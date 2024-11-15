package com.study.section2.임시반장구하기_11;

import java.util.Scanner;

public class TeachMain {

    /*
     * Note.
     *
     * */

    public int  solution(int n, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for(int j= 1; j <= n; j++){
                for(int k = 1; k <=5; k++ ){
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max) {
                max = cnt;
                answer=i;
            }
        }


        return answer;

    }


    public static void main(String[] args) {
        TeachMain teachMain = new TeachMain();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        int [][] arr = new int[n +1][6];

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 5; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }


        System.out.println(teachMain.solution(n, arr));
    }
}
