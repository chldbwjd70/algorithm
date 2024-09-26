package com.study.section1.회문문자열_7;

import java.util.Scanner;

public class TeachMain {

    public String solution(String str){
        String answer = "YES";

        /*
        * 방법1.
        * 입력받은 문자열에 절반을 나누어
        * 앞에서 부터 중간까지 <> 뒤에서 중간까지 순회
        * 순회 하면서 둘의 값이 다르면 NO 로 return
        * 값이 같으면 기본값 YES return
        * */
        str = str.toUpperCase();
        int len = str.length();
        for(int i = 0; i < len/2; i++){
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                answer = "NO";
                break;
            }
        }

        /*
         * 방법2.
         * StringBuilder 사용하여 reverse
         * equals가 아닌 equalsIgnoreCase를 사용하여 대소문자 구분없이 같은지 확인 후
         * 같으면 YES, 다르면 NO
         * */
        String tmp = new StringBuilder(str).reverse().toString();
        if(! str.equalsIgnoreCase(tmp)) answer = "NO";


        return answer;
    }


    public static void main(String[] args) {
        TeachMain teachMain = new TeachMain();

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        System.out.println(teachMain.solution(input));

    }
}
