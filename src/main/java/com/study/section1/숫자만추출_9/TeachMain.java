package com.study.section1.숫자만추출_9;

import java.util.Scanner;

public class TeachMain {

    public int solution(String str){
        int answer1 = 0;

        /* 방법1.
        * 아스키 코드 숫자 : 48 ~ 57
        * 숫자인 경우 -> answer = answer * 10 + (x - 48)
        * */
        for(char x : str.toCharArray()){
            if(x >= 48 && x <= 57){
                answer1 = answer1 * 10 +(x - 48);
            }
        }

        /*
        * 방법2.
        * Character을 이용하여 answer2에 누적
        * 누적된 값에는 앞에 0 이 있음
        * 그걸 해결하게 위해 Integer.parseInt() 활용
        * */
        String answer2 = "";
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)) answer2 += x;

        }
        System.out.println(Integer.parseInt(answer2));


        return answer1;
    }


    public static void main(String[] args) {
        TeachMain teachMain = new TeachMain();

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        System.out.println(teachMain.solution(input));

    }
}
