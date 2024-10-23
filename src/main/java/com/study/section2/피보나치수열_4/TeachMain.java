package com.study.section2.피보나치수열_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeachMain {

    /*
     * 방법.
     * 입력 받은 값을 배열로 변환 하여 비교
     * 첫번째 값은 무조건 add
     * */
    public List<Integer> solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();

        answer.add(arr[0]);
        for(int i=1; i <n; i++){
            if(arr[i] > arr[i-1]) answer.add(arr[i]);
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

        for(int x : teachMain.solution(n, arr)){
            System.out.print(x + " ");
        }

    }
}
