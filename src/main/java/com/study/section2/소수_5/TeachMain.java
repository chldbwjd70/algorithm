package com.study.section2.소수_5;

import java.util.Scanner;

public class TeachMain {

    /*
     * Note.
     * 에라토스테네스의체 사용
     * 1. 본인이 0인 경우 result ++
     * 2. 현재 값의 배수의 값을 1로 변경
     * 3. 위 방법을 통해 순회 하여 결과 도축
     * */

    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];

        for(int i =2; i <= n; i++){
            if(ch[i] == 0){
                answer++;
                // 아래 for 문에서 j + i를 더해 줌으로 써 배수의 값을 구할 수 있음.
                for(int j=i; j <= n; j = j + i)ch[j] = 1;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        TeachMain teachMain = new TeachMain();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(teachMain.solution(n));


    }
}
