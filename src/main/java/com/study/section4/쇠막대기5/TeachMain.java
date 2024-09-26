package com.study.section4.쇠막대기5;

import java.util.Scanner;
import java.util.Stack;

public class TeachMain {
    public static void main(String[] args) {

        /*
        * Desc.
        * '('  경우 스택에 쌓는다.
        * ')' 경우
        *  1. 레이저인 경우-> 스택에 있는 것을 지우고, 스택의 사이즈를 결과에 더한다.
        *     현재 까지 스택에 잇는 갯수만큼 레이저가 조각으로 잘려짐.
        *  2. 막대기의 끝인 경우 ->  스택에 있는 것을 지우고, 스택의 1을 더한다.
        *     막대기가 끝나니, 이미 잘렸던것들은 스택에 있으니 더해졌기에, 나머지 남은 하나만 더한다.
        * */

        Scanner in=new Scanner(System.in);
        String input = in.next();
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i < input.length(); i++ ){

            if(input.charAt(i)== '(') stack.push('(');
            else {
                stack.pop();
                if(input.charAt(i-1) == '(') answer += stack.size();
                else answer += 1;
            }
        }

        System.out.println(answer);


    }
}
