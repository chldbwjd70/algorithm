package com.study.section1.중복문자제거_6;

import java.util.Scanner;

public class TeachMain {

    /*
    * 해결 방법1.
    * string에서 indexof를 통해 첫번째로 추출되는 순번을 찾음
    * 그 순번과 현재 i가 같으면 문자열 중 첫번째에 있는 위치.
    * 그 순번과 현재 i가 다르면 이미 앞쪽에 중복된 문자가 있다는 의미.
    * */
    public String solution(String str){
        String answer= "";

        for(int i= 0; i < str.length(); i ++){
            // System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
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
