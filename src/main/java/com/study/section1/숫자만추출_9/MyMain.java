package com.study.section1.숫자만추출_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyMain {
    /*
    * Desc.
    * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
    * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
    * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
    *
    * Input.
    * 첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
    *
    * Output.
    * 첫 줄에 자연수를 출력합니다.
    *
    * 풀이.
    * 먼저 숫자만 추출
    * 그 숫자 중 앞에 첫번째에 0이 있는 경우 remove -> 0이 첫번째에 없을 때 까지
    * print
    *  */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input  = scanner.next();
        char[] chars =  input.toCharArray();
        List<String> test=  new ArrayList<>();

        for(int i=0; i < input.length() ; i++){
            if(Character.isDigit(chars[i])){
                test.add(String.valueOf(chars[i]));
            }
        }

        boolean isRemoved = true;

        while (isRemoved){
            int i1 = test.indexOf("0");
            if(i1 == 0){
                test.remove(0);
            }else{
                isRemoved = false;
            }
        }

        test.forEach(System.out::print);



    }

}
