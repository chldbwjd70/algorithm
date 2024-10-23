package com.study.section2.뒤집은소수_6;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyMain {
    /*
    * Desc.
    * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
    * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
    * 첫 자리부터의 연속된 0은 무시한다.
    *
    * Input.
    * 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
    * 각 자연수의 크기는 100,000를 넘지 않는다.
    *
    * Output.
    * 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
    *
    * 풀이.
    * 입력 값을 뒤집은 후 int로 변환
    * 에라토스테네스의체를 사용 하여 소수인 경우만 결과에 append
    *  */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size  = scanner.nextInt();
        List<Integer> result = new ArrayList<>();

        for(int i=0; i < size ; i++){
            int input = scanner.nextInt();
            int reversedNumber = getReversedNumber(input);
            if(reversedNumber != 1  && isDecimal(reversedNumber)){
                result.add(reversedNumber);
            }
        }

        result.forEach(r -> System.out.print(r + " "));

    }

    public static boolean isDecimal(int number){
        double sqrt = Math.sqrt(number);
        int sqrtInt = (int) sqrt;

        for(int i=2; i <= sqrtInt; i++){
            if(number % i == 0){
                return false;
            }
        }
        return  true;
    }

    public static int getReversedNumber(int number){
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(number));
        return Integer.parseInt(stringBuilder.reverse().toString());
    }


}
