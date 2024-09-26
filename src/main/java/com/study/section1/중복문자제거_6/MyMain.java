package com.study.section1.중복문자제거_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyMain {
    /*
    * Desc.
    *
    * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
    * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
    *
    * Input.
    * 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
    *
    * Output.
    * 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
    *
    * 풀이.
    * 입력 단어의 첫번째는 무조건 중복이 아니기에 넣고 시작.
    * 그 다음부터 해당 번째에서 이전까지 문자 중 중복있는 것을 count로 설정
    * count = 0 인 것만 결과에 add
    *  */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input  = scanner.next();

        char[] inputArray = input.toCharArray();
        List<String> result = new ArrayList<>();


        result.add(String.valueOf(inputArray[0]));
        for(int i=1; i < input.length(); i++){
            int count = 0;
            char c = inputArray[i];
            for(int t=0; t < i; t++){
                if(c == inputArray[t]){
                    count++;
                }
            }

            if(count == 0){
                result.add(String.valueOf(c));
            }
        }

        for(String s : result){
            System.out.print(s);
        }

    }

}
