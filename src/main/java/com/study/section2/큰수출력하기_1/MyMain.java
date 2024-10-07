package com.study.section2.큰수출력하기_1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyMain {
    /*
    * Desc.
    * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
    * (첫 번째 수는 무조건 출력한다)
    *
    * Input.
    * 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
    *
    *
    * Output.
    * 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
    *
    * 풀이.
    * 입력 받은 숫자 저장
    * 0번째는 앞 숫자가 없으니 무조건 add
    * 1부터 바로 앞 숫자와 비교 후 크면 add
    *  */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputSize  = scanner.nextInt();

        List<String> result = new ArrayList<>();
        List<Integer> inputList = new ArrayList<>();

        for(int i = 0; i < inputSize ; i ++){
            inputList.add(scanner.nextInt());
        }


        result.add(String.valueOf(inputList.get(0)));
        for(int i=1; i< inputSize; i++){
            int i1 = Integer.parseInt(String.valueOf(inputList.get(i-1)));
            int i2 = Integer.parseInt(String.valueOf(inputList.get(i)));
            if(i2 > i1){
                result.add(String.valueOf(inputList.get(i)));
            }
        }

        for(String s : result){
            System.out.print(s + " ");
        }


    }


}
