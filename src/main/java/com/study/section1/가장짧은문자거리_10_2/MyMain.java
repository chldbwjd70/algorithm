package com.study.section1.가장짧은문자거리_10_2;


import java.util.Scanner;

public class MyMain {
    /*
    * Desc.
    * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
    *
    * Input.
    * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
    * 문자열의 길이는 100을 넘지 않는다.
    *
    *
    * Output.
    * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
    *
    * 풀이.
    * 1. 0번부터 끝까지 순회 하여 indexOf 값과 현재 값의 절대값을 구해서 넣는다. (같은 경우는 0)
    * 2. 끝에서 1번째까지 순회 하여 뒤에서 시작하는거니 lastIndexOf를 통해 거리를 구한다.
    *    여기서 만약 구해진 거리 값이 result에 있는 값 보다 작은 경우
    *    구해진 거리 값으로 result를 변경한다.
    * 3. 끝에서 순회 하는 경우 0번째 까지 갈 필요가 없는 이유
    *    : 처음에 순회 시 이미 0번째 값은 정해졌다고 생각함.  (좀 더 명확한 이유가 있을 거 같은데 나의 지식 부족)
    *  */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        char ch = scanner.next().charAt(0);
        int[] result = new int[input.length()];

        for(int i=0; i < input.length(); i++) {
            if(input.charAt(i) == ch) {
                result[i] = 0;
            }
            else{
                int index = input.indexOf(ch, i);
                int abs = Math.abs(index - i);
                result[i] = abs;
            }
        }


        for( int i= input.length()-1; i > 0; i--) {
            if(input.charAt(i) != ch) {
                int index = input.lastIndexOf(ch, i);
                int abs = Math.abs(index - i);
                if(result[i] > abs) { result[i] = abs; }
            }
        }

        for(int i = 0; i < input.length(); i++) {
            System.out.print(result[i] + " ");
        }

    }




}
