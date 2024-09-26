package com.study.section1.회문문자열_7;

import java.util.Scanner;

public class MyMain {
    /*
    * Desc.
    *
    * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
    * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
    * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
    *
    * Input.
    * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
    *
    * Output.
    * 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
    *
    * 풀이.
    * 입력 값은 값을 대/소문자 중 하나로 통일.
    * StringBuilder 통해 reverse
    * 둘이 같은 지 확인
    *  */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input  = scanner.next().toUpperCase();
        StringBuilder reverseInput =  new StringBuilder(input).reverse();


        if (input.equals(reverseInput.toString())){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

}
