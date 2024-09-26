package com.study.section1.가장짧은문자거리_10;

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
    * Output.
    * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
    *
    * 풀이.
    * 문자열 에서 문자 t 값인 경우 0, 아닌 경우 1 로 지정
    * 0인 경우는 다음 번째로 넘김
    * 1인 경우 0과 거리 사이즈 중 제일 작은 값을 넣음
    *  */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input  = scanner.next();
        char search = scanner.next().charAt(0);
        char[] inputArray = input.toCharArray();
        int[] result = new int[input.length()];


        for(int i=0; i < input.length() ; i++){
            if(inputArray[i] == search){
                result[i] = 0;
            }else{
                result[i] = 1;
            }
        }

        for(int i=0; i < input.length(); i ++){

            if(result[i] == 0) continue;
            else{
                int min = 101;
                for(int t=0 ; t < input.length() ; t++){
                    int size = Math.abs(i- t);
                    if(result[t] == 0) {
                        if(size < min){
                            min = size;
                            result[i] = size;
                        }
                    }


                }
            }
        }

        for(int i=0; i < input.length(); i++){
            System.out.print(result[i] + " ");
        }




    }

}
