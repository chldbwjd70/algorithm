package com.study.section1.특정문자뒤집기_5;

import java.util.Scanner;

public class TeachMain {

    /*
    * 나와 다른점.
    * 왼쪽/오른쪽 알파벳이 경우 ++. -- 를 먼저 했음
    * 나는 && 먼저 조건을 걸어서 필요하지 않은 연산 까지 진행됨.
    * */
    public String solution(String str){
        String result;

        char[] s = str.toCharArray();

        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt){
            if(!Character.isAlphabetic(s[lt]))  lt++;
            else if(!Character.isAlphabetic(s[rt]))rt--;
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;

            }

        }

        result = String.valueOf(s);
        return result;
    }


    public static void main(String[] args) {
        TeachMain teachMain = new TeachMain();

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        System.out.println(teachMain.solution(input));

    }
}
