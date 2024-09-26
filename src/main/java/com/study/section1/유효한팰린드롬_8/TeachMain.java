package com.study.section1.유효한팰린드롬_8;

import java.util.Scanner;

public class TeachMain {

    public String solution(String str){
        String answer = "NO";

        /*
        * 방법1.
        * 입력 값에서 알파벳을 제외한 나머지는 지운 후,
        * StringBuilder을 이용하여 equals 비교
        * ( 정규식을 이용한 방법도 잘 알아두자.)
        * */

        str = str.toUpperCase().replaceAll("[^A-Z]","");

        String tmp  = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer = "YES";


        return answer;
    }


    public static void main(String[] args) {
        TeachMain teachMain = new TeachMain();

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        System.out.println(teachMain.solution(input));

    }
}
