package com.study.section2.등수구하기_8;

import java.util.Scanner;

public class TeachMain {

    /*
     * 방법.
     * 순회하며 조건문을 통해 진행한다.
     * 조건문은 두 사람 중 한명을 기준으로
     * 한명이 이기는 조건을 세우고
     * 나머지는 다른 한명이 이기는 방식으로 세운다.
     * */

    public String solution(int n, int[] a, int[]b){
        String answer = "";

        for(int i=0; i < n ; i++){
            if(a[i] == b[i]) answer += "D";
            else if (a[i] == 1 &&  b[i] == 3)  answer += "A";
            else if (a[i] == 2 &&  b[i] == 1)  answer += "A";
            else if (a[i] == 3&&  b[i] == 2)  answer += "A";
            else answer += "B";
        }


        return answer;
    }


    public static void main(String[] args) {
        TeachMain teachMain = new TeachMain();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b= new int[n];

        for(int i=0; i < n; i++){
            a[i] = scanner.nextInt();
        }

        for(int i=0; i < n; i++){
            b[i] = scanner.nextInt();
        }

        for(char c : teachMain.solution(n, a, b).toCharArray()){
            System.out.println(c);
        }


    }
}
