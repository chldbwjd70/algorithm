package com.study.section1.문자열압축_11;

import java.util.Scanner;

public class TeachMain {

    /*
     * 방법.
     * 처음 부터 순회 cnt = 1로 초기화
     * i번째 문자와 i+1번째
     * 문자가 같으면 cnt++
     * 문자가 다르면 i번째 문자를 결과 값에 append
     *          + cnt가 1보다 크면 해당 cnt도 결과에 append
     *
     * 마지막 번째가 된 경우는 IndexOutOfException이 발생하기 때문에
     * 마지막 배열 뒤에 빈 문자열 배열을 하나 더 추가해서 확인한다.
     * */

    public String solution(String str){
        String answer = "";

        str = str + "";
        int cnt = 1;

        for (int i = 0; i < str.length() -1; i++) {
            if(str.charAt(i) == str.charAt(i+1))cnt++;
            else {
                answer += str.charAt(i);
                if(cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        TeachMain teachMain = new TeachMain();

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        System.out.println(teachMain.solution(input));

    }
}
