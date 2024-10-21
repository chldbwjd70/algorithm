package com.study.section1.암호_12;

import java.util.Scanner;

public class TeachMain {

    /*
     * 방법.
     * 입력받은 문자열을 0~7번째꺼를 꺼냄
     * 꺼낸 문자열을 제외 후 남은 문자열로 refresh
     * 꺼낸 문자열은 2진수 변환 후 문자로 변환
     * */


    public String solution(int n , String s){
        String answer = "";

        for(int i=0; i < n; i ++){
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp);
            answer += (char)num;
            s = s.substring(7);
        }
        return answer;
    }


    public static void main(String[] args) {
        TeachMain teachMain = new TeachMain();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String s = scanner.next();

        System.out.println(teachMain.solution(n, s));

    }
}
