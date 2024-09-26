package com.study.section1.대소문자변환_2;

import java.util.Scanner;

public class TeachMain {

    public String solution(String str){
        String answer = "";

        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }

        /* 아스키 방법
        *  1. 대문자 : 65 ~ 90
        *  2. 소문자 : 97 ~ 122
        * */
        for(char x : str.toCharArray()){
            if(x >= 65 && x <= 90) answer += (char)(x + 32);
            if(x >= 97 && x <= 122) answer += (char)(x - 32);
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
