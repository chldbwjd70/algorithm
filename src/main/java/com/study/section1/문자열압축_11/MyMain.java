package com.study.section1.문자열압축_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyMain {
    // TODO. 여기부터 강의 봐야함
    /*
    * Desc.
    * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
    * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
    * 단 반복횟수가 1인 경우 생략합니다.
    *
    * Input.
    * 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
    *
    * Output.
    * 첫 줄에 압축된 문자열을 출력한다.
    *
    * 풀이.
    * 다음 문자열이 현재 문자열과 동일한 경우 ++
    * 아닌 경우 pass
    *  */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input  = scanner.next();

        char[] inputArray = input.toCharArray();


        List<String> result = new ArrayList<>();

        int count = 1;
        for(int i=1; i < inputArray.length; i++){
                if(inputArray[i-1] == inputArray[i]){
                    count++;
                }else{
                    if(count != 1) {
                        result.add(String.valueOf(inputArray[i-1] )+ count);
                        count = 1;
                    }else{
                        result.add(String.valueOf(inputArray[i-1]));
                    }
                }

                if(i== inputArray.length -1){
                    if(count != 1) {
                        result.add(String.valueOf(inputArray[i-1] )+ count);
                        count = 1;
                    }else{
                        result.add(String.valueOf(inputArray[i-1]));
                    }
                }

        }


        result.forEach(System.out::print);
    }

}
