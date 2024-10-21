package com.study.section2.보이는학생_2;

import java.util.Scanner;

public class TeachMain {

    /*
     * 방법.
     * 유정 방식과 유사
     * 초기화 방식만 다름
     * 초기화 방식은 MyMain 에 적어둠
     * */

    public int solution(int n, int[] arr){
        int answer = 1, max= arr[0];

        for(int i=1; i< n; i++){
            if(arr[i] > max) {
                answer++;
                max = arr[i];
            }

        }
        return answer;
    }


    public static void main(String[] args) {
        TeachMain teachMain = new TeachMain();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println( teachMain.solution(n, arr));

    }
}
