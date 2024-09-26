package com.study.section1.특정문자뒤집기_5;

import java.util.Scanner;

public class MyMain {
    /*
    * Desc.
    * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
    * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
    *
    * Input.
    * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
    *
    * Output.
    * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
    *
    * 풀이.
    * 왼쪽이 알파벳이 아닌 경우 +
    * 오른쪽이 알파벳이 아닌 경우 -
    * 이러면서 둘다 알파벳인 경우가 나올 것이고,
    * 그에 따라 알파벳 위치를 바꾼다.
    *  */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input  = scanner.next();
        char[] inputArray = input.toCharArray();

        int lt = 0;
        int rt = input.length()-1;
        while (lt < rt){

            if(Character.isAlphabetic(inputArray[lt]) && Character.isAlphabetic(inputArray[rt])){
                char tmp = inputArray[lt];
                inputArray[lt] = inputArray[rt];
                inputArray[rt] = tmp;
                lt++;
                rt--;
            }else{
                if(!Character.isAlphabetic(inputArray[lt])){
                    lt++;
                }

                if(!Character.isAlphabetic(inputArray[rt])){
                    rt--;
                }

            }
        }
        System.out.println(String.valueOf(inputArray));

    }

}
