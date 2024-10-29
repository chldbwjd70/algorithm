package com.study.section2.피보나치수열_4;


import java.util.Scanner;

public class MyMain {
    // TODO.여기 부터 다른 풀이 강의 확인

    /*
    * Desc.
    * 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다
    * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
    *
    * Input.
    * 첫 줄에 총 항수 N(3<=N<=45)이 입력된다
    *
    *
    * Output.
    * 첫 줄에 피보나치 수열을 출력합니다.
    *
    * 풀이.
    * 총 항수를 순회
    * 피보나치 수열 값을 결과에 append
    * 1부터 바로 앞 숫자와 비교 후 크면 add
    *  */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size  = scanner.nextInt();
        int[] result = new int[size];


        // init
        result[0] = 1;
        result[1] = 1;


        for(int i=2; i < size; i++) {
            result[i] = result[i-1] + result[i-2];
        }


        for(int i=0; i<size; i++) {
            System.out.print(result[i] + " ");
        }

    }


}
