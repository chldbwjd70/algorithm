package com.study.section1.문자찾기_1;

import java.util.Scanner;

public class TeachMain {

    public int solution(String str, char t){
        int result = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        // 방법1.
        /*
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) == t) result++;
        }
        */

        // 방법2.
        for(char x : str.toCharArray()){
            if(x == t) result++;
        }

        return result;
    }


    public static void main(String[] args) {
        TeachMain teachMain = new TeachMain();

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        char c = scanner.next().charAt(0);

        System.out.println(teachMain.solution(input, c));

    }
}
