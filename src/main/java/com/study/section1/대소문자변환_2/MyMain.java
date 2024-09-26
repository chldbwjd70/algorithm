package com.study.section1.대소문자변환_2;

import java.util.Scanner;

public class MyMain {
    /*
    * Desc.
    * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
    *
    * Input.
    *
    * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
    * 문자열은 영어 알파벳으로만 구성되어 있습니다.
    *
    * Output.
    * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
    *
    * 풀이.
    * 소문자인 경우 대문자로, 대문자인 경우 소문자로 변환 후 return
    *  */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        char[] result = new char[input.length()];
        for(int i=0; i < input.length(); i++){

            if(Character.isUpperCase(input.charAt(i))){
                result[i] = Character.toLowerCase(input.charAt(i));
            }
            if(Character.isLowerCase(input.charAt(i))){
                result[i] = Character.toUpperCase(input.charAt(i));
            }
        }

        System.out.println(result);
    }

}
