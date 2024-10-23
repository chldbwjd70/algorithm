package com.study.section2.점수계산_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeachMain {

    /*
     * 방법.
     * 에라토스테네스의 체를 활용
     *
     *
     *
     * N 제곱근 보다 작은 자연수로 나누기
     * 어떤 수가 자연수인지 확인할 때 그 수의 n-1까지 모두 나눠볼 필요가 없다.
     * 즉 N 제곱근까지만 나눠보면 된다.
     * 왜 ??
     * 36은 (12 * 3, 6 *6) 으로 표현 가능
     * 이미 3에서 한번 나누어 보았 으니 12로 나누어 볼 필요가 없다.
     * 보통은 N의 제곱근 기준 값으로 대칭을 이룬 다고 생각 하면 될듯.
     * 36의 제곱 근은 6
     * 2 ~ 6 까지 나누어 보면 된다.
     *
     * 예를 들어 97인 경우
     * 97의 제곱근은 약 9.8
     * 그렇 다면 2~9까지 나눠보면 된다.
     *
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
