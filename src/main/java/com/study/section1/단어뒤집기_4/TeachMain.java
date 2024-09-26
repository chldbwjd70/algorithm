package com.study.section1.단어뒤집기_4;

import java.util.ArrayList;
import java.util.Scanner;

public class TeachMain {

    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> result = new ArrayList<>();

        /*
        * 방법1. 아래 방법은 모두 바꾸는 방식
        * */
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            result.add(tmp);
        }

        /*
        * 방법2. 특정 문자만 뒤집어야 하는 경우
        * */
        for(String x : str){
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length();
            while (lt < rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String reversed = String.valueOf(s);
            result.add(reversed);
        }


        return result;
    }


    public static void main(String[] args) {
        TeachMain teachMain = new TeachMain();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] str = new String[n];

        for(int i=0; i < n; i++){
            str[i] = scanner.next();
        }


        for (String x : teachMain.solution(n , str)){
            System.out.println(x);
        }

    }
}
